package kotlin.io;

import X.C08FF;
import X.C2254308sP;
import X.InterfaceC2044707zh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class FileWalkDirection {
    public static final FileWalkDirection BOTTOM_UP;
    public static final /* synthetic */ FileWalkDirection[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final FileWalkDirection TOP_DOWN;

    public static InterfaceC2044707zh<FileWalkDirection> getEntries() {
        return LLILLJJLI;
    }

    static {
        FileWalkDirection fileWalkDirection = new FileWalkDirection("TOP_DOWN", 0);
        TOP_DOWN = fileWalkDirection;
        FileWalkDirection fileWalkDirection2 = new FileWalkDirection("BOTTOM_UP", 1);
        BOTTOM_UP = fileWalkDirection2;
        FileWalkDirection[] fileWalkDirectionArr = {fileWalkDirection, fileWalkDirection2};
        LL = fileWalkDirectionArr;
        LLILLJJLI = new C2254308sP(fileWalkDirectionArr);
    }

    public static FileWalkDirection[] values() {
        return (FileWalkDirection[]) LL.clone();
    }

    public static FileWalkDirection valueOf(String str) {
        return (FileWalkDirection) C08FF.LIZ(FileWalkDirection.class, str);
    }

    public FileWalkDirection(String str, int i) {
    }
}
