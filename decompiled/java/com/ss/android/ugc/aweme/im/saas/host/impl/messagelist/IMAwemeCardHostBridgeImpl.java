package com.ss.android.ugc.aweme.im.saas.host.impl.messagelist;

import X.C0IBF;
import X.C0IBX;
import X.C0ZQI;
import X.C0ZYL;
import X.C1367960lha;
import X.C13LE;
import X.C1562980qm8;
import X.C19719912Dl;
import X.C457850HxP;
import X.C729540SjY;
import X.C869590Y9l;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.messagelist.IMAwemeCardHostBridge;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMAwemeSideMessageStatusReusedSkeletonUISlot;
import com.ss.android.ugc.aweme.im.viewmodel.PanelStateViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: loaded from: classes7.dex */
public final class IMAwemeCardHostBridgeImpl implements IMAwemeCardHostBridge {
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.messagelist.IMAwemeCardHostBridge
    public final C19719912Dl LIZLLL() {
        return C13LE.LIZ(DMAwemeSideMessageStatusReusedSkeletonUISlot.class);
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.messagelist.IMAwemeCardHostBridge
    public final C0ZYL LIZIZ() {
        C1367960lha.LIZ.getClass();
        return C1367960lha.LIZ().LIZIZ();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0SjY] */
    @Override // com.ss.android.ugc.aweme.im.saas.host.api.messagelist.IMAwemeCardHostBridge
    public final C729540SjY LJ(final Context context, final Aweme aweme, final String str, final String str2, final boolean z) {
        return new C0IBX(context, aweme, str, str2, z) { // from class: X.0SjY
            public final Context LIZ;
            public final Aweme LIZIZ;
            public final String LIZJ;
            public final String LIZLLL;
            public final boolean LJ;

            @Override // X.C0IBX
            public final int getType() {
                return 1;
            }

            @Override // X.C0IBX
            public final Integer LIZ() {
                return Integer.valueOf(R.raw.icon_story_star);
            }

            @Override // X.C0IBX
            public final Integer LIZJ() {
                return 2131847841;
            }

            @Override // X.C0IBX
            public final Integer LJ() {
                return Integer.valueOf(R.attr.ej);
            }

            @Override // X.C0IBX
            public final void LIZLLL(C197039127h c197039127h) {
                C729510SjV.LIZJ(this.LIZIZ, this.LIZLLL);
                C729510SjV.LJJJJJ(this.LIZ, this.LIZIZ, "chat_page", this.LIZJ, null, 1);
            }

            @Override // X.C0IBX
            public final void LJFF(C197039127h c197039127h) {
                if (this.LJ) {
                    ((InterfaceC1618460sDc) C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(311)).getValue()).LJIIIIZZ("show", "dm");
                }
            }

            {
                this.LIZ = context;
                this.LIZIZ = aweme;
                this.LIZJ = str;
                this.LIZLLL = str2;
                this.LJ = z;
            }
        };
    }

    @Override // com.ss.android.ugc.aweme.im.saas.host.api.messagelist.IMAwemeCardHostBridge
    public final C1562980qm8 LIZJ(C869590Y9l c869590Y9l, Object obj, Object obj2, Object obj3, Fragment fragment, Activity activity, Object obj4) {
        SessionInfo sessionInfo;
        C0IBF c0ibf;
        C0ZQI c0zqi = (C0ZQI) obj;
        if (obj2 instanceof SessionInfo) {
            sessionInfo = (SessionInfo) obj2;
        } else {
            sessionInfo = null;
        }
        if (obj3 instanceof C0IBF) {
            c0ibf = (C0IBF) obj3;
        } else {
            c0ibf = null;
        }
        return C457850HxP.LIZ(activity, fragment, c869590Y9l, sessionInfo, c0ibf, c0zqi, (PanelStateViewModel) obj4);
    }
}
