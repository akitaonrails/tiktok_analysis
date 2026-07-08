package com.bytedance.android.livesdk.widget;

import X.C0IIT;
import X.C1324720kZq;
import X.C16F5;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveLccMaskLayerWidget extends LiveWidget {
    public static final /* synthetic */ int LLJI = 0;
    public Room LL;
    public C0IIT LLILLJJLI;
    public C1324720kZq LLILLL;
    public C16F5 LLILZ;
    public LiveIconView LLILZIL;
    public C16F5 LLILZLL;
    public C16F5 LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.hzw;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x1() {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveLccMaskLayerWidget.x1():void");
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        this.LLJ = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        super.onCreate();
        this.LLILLL = (C1324720kZq) findViewById(R.id.mi6);
        this.LLIZ = (C16F5) findViewById(R.id.hzo);
        this.LLILZLL = (C16F5) findViewById(R.id.ugl);
        this.LLILZIL = (LiveIconView) findViewById(R.id.u2z);
        this.LLILZ = (C16F5) findViewById(R.id.u35);
        x1();
        show();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onDestroy() {
        super.onDestroy();
        if (!this.LLIZLLLIL) {
            y1("close");
        }
        this.LLJ = false;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        if (!this.LLJ) {
            y1("show");
        }
        this.LLJ = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y1(java.lang.String r7) {
        /*
            r6 = this;
            X.0IIT r0 = r6.LLILLJJLI
            r5 = 0
            if (r0 == 0) goto Lbb
            java.lang.String r2 = r0.LIZJ
            if (r2 == 0) goto Lbb
            int r1 = r2.hashCode()
            r0 = -1396294537(0xffffffffacc63c77, float:-5.6342114E-12)
            if (r1 == r0) goto Laa
            r0 = 55789533(0x35347dd, float:6.208982E-37)
            if (r1 == r0) goto Lb3
            r0 = 2095451657(0x7ce60e09, float:9.5561036E36)
            if (r1 != r0) goto Lbb
            java.lang.String r0 = "ec_limit_rm_parent"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lbb
        L24:
            java.lang.String r4 = "ec18_mask_layer"
        L26:
            java.lang.String r0 = "live_unavailable"
            X.0IjA r3 = X.C0IJT.LIZ(r0)
            r3.LJIL()
            java.lang.String r0 = "action_type"
            r3.LJJII(r7, r0)
            X.0IIT r0 = r6.LLILLJJLI
            if (r0 == 0) goto La8
            java.lang.String r1 = r0.LIZLLL
        L3a:
            java.lang.String r0 = "record_id"
            r3.LJJII(r1, r0)
            X.0IIT r0 = r6.LLILLJJLI
            if (r0 == 0) goto La6
            java.lang.String r1 = r0.LIZJ
        L45:
            java.lang.String r0 = "scene_type"
            r3.LJJII(r1, r0)
            com.bytedance.android.livesdk.userservice.UserService r0 = com.bytedance.android.livesdk.userservice.UserService.getInstance()
            X.0Jki r0 = r0.user()
            long r0 = r0.getCurrentUserId()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "user_id"
            r3.LJJII(r1, r0)
            X.0IIT r0 = r6.LLILLJJLI
            if (r0 == 0) goto L69
            int r0 = r0.LJ
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L69:
            java.lang.String r2 = ""
            if (r5 == 0) goto La4
            int r1 = r5.intValue()
            r0 = 1
            if (r0 != r1) goto L87
            java.lang.String r1 = "regional_block"
        L76:
            java.lang.String r0 = "violation_type"
            r3.LJJII(r1, r0)
            if (r4 != 0) goto L7e
            r4 = r2
        L7e:
            java.lang.String r0 = "show_reason"
            r3.LJJII(r4, r0)
            r3.LIZ()
            return
        L87:
            int r0 = r5.intValue()
            if (r0 != 0) goto L90
            java.lang.String r1 = "lcc"
            goto L76
        L90:
            int r1 = r5.intValue()
            r0 = 4
            if (r0 != r1) goto L9a
            java.lang.String r1 = "viewer_limit"
            goto L76
        L9a:
            int r1 = r5.intValue()
            r0 = 5
            if (r0 != r1) goto La4
            java.lang.String r1 = "mask_layer"
            goto L76
        La4:
            r1 = r2
            goto L76
        La6:
            r1 = r5
            goto L45
        La8:
            r1 = r5
            goto L3a
        Laa:
            java.lang.String r0 = "ec_limit_u18"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L24
            goto Lbb
        Lb3:
            java.lang.String r0 = "ec_limit_rm_child"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L24
        Lbb:
            X.0IIT r0 = r6.LLILLJJLI
            if (r0 == 0) goto Lc3
            java.lang.String r4 = r0.LJFF
            goto L26
        Lc3:
            r4 = r5
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.widget.LiveLccMaskLayerWidget.y1(java.lang.String):void");
    }
}
