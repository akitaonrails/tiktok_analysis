package com.ss.android.ugc.aweme.shortvideo.sticker.comment;

import X.C04TD;
import X.C13LP;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.ICommentFavoriteService;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class CommentFavoriteServiceImpl implements ICommentFavoriteService, WeakHandler.IHandler {
    public final int LL = 64;
    public final Map<String, Integer> LLILLJJLI = new LinkedHashMap();

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    public static ICommentFavoriteService LIZJ() {
        Object objLIZ = C04TD.LIZ(ICommentFavoriteService.class, false);
        if (objLIZ != null) {
            return (ICommentFavoriteService) objLIZ;
        }
        if (C04TD.k5 == null) {
            synchronized (ICommentFavoriteService.class) {
                if (C04TD.k5 == null) {
                    C04TD.k5 = new CommentFavoriteServiceImpl();
                }
            }
        }
        return C04TD.k5;
    }

    @Override // com.ss.android.ugc.aweme.comment.ICommentFavoriteService
    public final int LIZ(String str) {
        boolean z;
        Integer num;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        int iIntValue = -1;
        if (z) {
            return -1;
        }
        synchronized (this.LLILLJJLI) {
            try {
                if (this.LLILLJJLI.containsKey(str) && (num = (Integer) ((LinkedHashMap) this.LLILLJJLI).get(str)) != null) {
                    iIntValue = num.intValue();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return iIntValue;
    }

    @Override // com.ss.android.ugc.aweme.comment.ICommentFavoriteService
    public final void LIZIZ(int i, String str) {
        if (str.length() == 0) {
            return;
        }
        synchronized (this.LLILLJJLI) {
            try {
                if (this.LLILLJJLI.size() >= this.LL) {
                    ((LinkedHashMap) this.LLILLJJLI).entrySet().remove((Map.Entry) C13LP.LJJJJZ(((LinkedHashMap) this.LLILLJJLI).entrySet()));
                }
                this.LLILLJJLI.put(str, Integer.valueOf(i));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
