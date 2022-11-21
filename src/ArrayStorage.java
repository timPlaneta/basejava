/**
 * Array based storage for Resumes
 */
public class ArrayStorage {

    private int cntResume = 0;
    Resume[] storage = new Resume[10000];

    void clear() {
        for (int i = 0; i < cntResume; i++) {
            storage[i] = null;
        }
        cntResume = 0;
    }

    void save(Resume r) {
        if (r.uuid != null) {
            storage[cntResume] = r;
            cntResume++;
        }
    }

    Resume get(String uuid) {
        Resume res = null;

        for (Resume r : storage) {
            if (r.uuid.equals(uuid)) {
                res = r;
                break;
            }
        }
        return res;
    }

    void delete(String uuid) {
    }

    /**
     * @return array, contains only Resumes in storage (without null)
     */
    Resume[] getAll() {
        Resume[] res = new Resume[cntResume];

        for (int i = 0; i < cntResume; i++) {
            res[i] = storage[i];
        }
        return res;
    }

    int size() {
        return cntResume;
    }
}
