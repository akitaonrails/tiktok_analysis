package com.ss.android.ugc.aweme.comment.preload;

import X.C0BTZ;
import X.C0CNZ;
import X.C0VU1;
import X.C1214904p9;
import X.C21172617tM;
import X.C523420Kfs;
import X.C786410Ut5;
import X.InterfaceC799590VYf;
import Y.ARunnableS113S0100000_13;
import android.content.Context;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.task.ExtendedPreloadTask;

/* JADX INFO: loaded from: classes22.dex */
public final class CommentPreloadTask extends ExtendedPreloadTask implements InterfaceC799590VYf {
    @Override // com.ss.android.ugc.aweme.task.ExtendedPreloadTask
    public final String LIZ() {
        return "click_comment_button_label";
    }

    @Override // X.InterfaceC800080Va2
    public final String key() {
        return "CommentPreloadTask";
    }

    @Override // X.InterfaceC799590VYf
    public final /* synthetic */ int level() {
        return 1;
    }

    @Override // X.InterfaceC799590VYf
    public final int priority() {
        return 2;
    }

    @Override // X.InterfaceC800080Va2
    public final int targetProcess() {
        return 1;
    }

    @Override // X.InterfaceC800080Va2
    public final boolean meetTrigger() {
        String str;
        if (!C0CNZ.LIZJ() || (C0CNZ.LIZLLL() & 128) <= 0) {
            if ((C0BTZ.LIZ() & 16) == 16) {
                String str2 = (String) this.LL.getValue();
                if (str2 != null) {
                    return str2.equals("2");
                }
                return false;
            }
            if ((C0BTZ.LIZ() & 32) != 32) {
                return false;
            }
            String str3 = (String) this.LL.getValue();
            if ((str3 == null || !str3.equals("2")) && ((str = (String) this.LL.getValue()) == null || !str.equals("1"))) {
                return false;
            }
        }
        return true;
    }

    @Override // X.InterfaceC799590VYf
    public final C0VU1 threadType() {
        return C0VU1.CPU;
    }

    @Override // X.InterfaceC308150C6b
    public final void run(Context context) {
        if (C0CNZ.LIZJ() && (C0CNZ.LIZLLL() & 128) > 0) {
            CommentService.LIZ.getClass();
            C523420Kfs.LIZ().LJJJLZIJ();
        }
        if (((Boolean) C1214904p9.LIZIZ.getValue()).booleanValue()) {
            C786410Ut5.LJLIIL(1000L, C21172617tM.LJFF.LIZ(), new ARunnableS113S0100000_13(this, 92));
        }
    }
}
