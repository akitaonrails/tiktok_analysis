package com.bytedance.librarian;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes31.dex */
public class LibrarianUnsatisfiedLinkError extends UnsatisfiedLinkError {
    public static final ArrayList<LibrarianUnsatisfiedLinkError> LL = new ArrayList<>();
    public static final ArrayList<UnsatisfiedLinkError> LLILLJJLI = new ArrayList<>();

    public LibrarianUnsatisfiedLinkError(String str) {
        super(str);
        ArrayList<LibrarianUnsatisfiedLinkError> arrayList = LL;
        synchronized (arrayList) {
            try {
                arrayList.add(this);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public LibrarianUnsatisfiedLinkError(String str, Throwable th) {
        super(str);
        initCause(th);
        ArrayList<LibrarianUnsatisfiedLinkError> arrayList = LL;
        synchronized (arrayList) {
            try {
                arrayList.add(this);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
    }
}
