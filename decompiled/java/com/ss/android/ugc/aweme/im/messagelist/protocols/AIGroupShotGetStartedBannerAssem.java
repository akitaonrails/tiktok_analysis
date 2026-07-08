package com.ss.android.ugc.aweme.im.messagelist.protocols;

import X.AbstractC1682806iQ;
import X.C01GW;
import X.C0Y8T;
import X.C0YSQ;
import X.C0ZHB;
import X.C1378990lzN;
import X.C1389890mGx;
import X.C1559260qg8;
import X.C1682506iN;
import X.C1682706iP;
import X.C1708606ma;
import X.C1710506mt;
import X.C1976907ol;
import X.C19EG;
import X.C2188811AlT;
import X.C23250099c;
import X.C418440Gaw;
import X.C452501pT;
import X.C457780HxI;
import X.C461620I8i;
import X.C631370Opb;
import X.C723590SZx;
import X.C723830SaL;
import X.C724240Sb0;
import X.C786410Ut5;
import X.C814420VxA;
import X.C899270ZPp;
import X.C900040ZSo;
import X.C911570ZpT;
import X.InterfaceC1587906Jp;
import X.InterfaceC712990Rxx;
import X.InterfaceC876950Yaj;
import Y.ACListenerS137S0100000_2;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.ss.android.ugc.aweme.aigroupshot.AIGroupShotEntry;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMAIGroupShotBridgeApi;
import com.ss.android.ugc.aweme.im.saas.host.api.camera.IMCameraBridgeApi;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.text.u;

/* JADX INFO: loaded from: classes3.dex */
public final class AIGroupShotGetStartedBannerAssem extends ReusedUISlotAssem<AIGroupShotGetStartedBannerAssem> implements InterfaceC712990Rxx<C900040ZSo> {
    public final C1559260qg8 LLJJLIIIJLLLLLLLZ = new C1559260qg8(new C723590SZx(this, C457780HxI.class, null), checkSupervisorPrepared());
    public final C01GW LLJL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 359));
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 360));
    public final C01GW LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS546S0100000_2(this, 358));
    public final AIGroupShotGetStartedBannerAssem$aiGroupShotCardInterceptor$1 LLJLL = new IInterceptor() { // from class: com.ss.android.ugc.aweme.im.messagelist.protocols.AIGroupShotGetStartedBannerAssem$aiGroupShotCardInterceptor$1
        @Override // com.bytedance.router.interceptor.IInterceptor
        public final /* synthetic */ boolean shouldHandleRoute(RouteIntent routeIntent) {
            return C1976907ol.LIZ(this, routeIntent);
        }

        @Override // com.bytedance.router.interceptor.IInterceptor
        public final boolean matchInterceptRules(RouteIntent routeIntent) {
            String host;
            Uri uri;
            Uri uri2;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String path = null;
            if (routeIntent != null && (uri2 = routeIntent.getUri()) != null) {
                host = uri2.getHost();
            } else {
                host = null;
            }
            sbLIZ.append(host);
            if (routeIntent != null && (uri = routeIntent.getUri()) != null) {
                path = uri.getPath();
            }
            sbLIZ.append(path);
            return u.LJJIIJZLJL(C2188811AlT.LIZIZ(sbLIZ), "im/ai-group-shot-get-start", false);
        }

        @Override // com.bytedance.router.interceptor.IInterceptor
        public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
            IMCameraBridgeApi iMCameraBridgeApiLIZ;
            AbstractC1682806iQ abstractC1682806iQLIZ;
            IMCameraBridgeApi.LIZ.getClass();
            IMCameraBridgeApi iMCameraBridgeApiLIZ2 = C461620I8i.LIZ();
            if (iMCameraBridgeApiLIZ2 != null) {
                iMCameraBridgeApiLIZ2.LJJIFFI();
            }
            C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(this.LL.op().getConversationId());
            if (c0y8tLIZ != null && c0y8tLIZ.isGroupChat() && c0y8tLIZ.getMemberCount() < C911570ZpT.LIZ().inviteFriendsGroupLimit) {
                C1389890mGx c1389890mGx = new C1389890mGx(this.LL.getContentView());
                c1389890mGx.LJIIIZ(2131831189);
                c1389890mGx.LJIIJJI();
                return true;
            }
            C19EG c19egLIZ = C724240Sb0.LIZ(this.LL);
            if (c19egLIZ == null) {
                return true;
            }
            IMAIGroupShotBridgeApi.LIZ.getClass();
            IMAIGroupShotBridgeApi iMAIGroupShotBridgeApiLIZ = C1708606ma.LIZ();
            if (iMAIGroupShotBridgeApiLIZ != null) {
                AIGroupShotEntry.InChat.GroupShotCard groupShotCard = AIGroupShotEntry.InChat.GroupShotCard.INSTANCE;
                if (this.LL.op().getChatType() == 3) {
                    abstractC1682806iQLIZ = new C1682706iP(this.LL.op().getConversationId());
                } else {
                    abstractC1682806iQLIZ = C1682506iN.LIZ(this.LL.op().getConversationId());
                }
                iMAIGroupShotBridgeApiLIZ.LIZIZ(c19egLIZ, groupShotCard, abstractC1682806iQLIZ, ((C900040ZSo) C631370Opb.LIZ(this.LL)).LL, Integer.valueOf(this.LL.op().getChatType()));
            }
            if (!C899270ZPp.LIZ(((C457780HxI) this.LL.LLJJLIIIJLLLLLLLZ.getValue()).LLILLL) && (iMCameraBridgeApiLIZ = C461620I8i.LIZ()) != null) {
                iMCameraBridgeApiLIZ.LJJIJIIJIL();
            }
            return true;
        }
    };

    @Override // com.bytedance.assem.arch.reused.ReusedUISlotAssem
    public final int Oo() {
        return R.layout.cl5;
    }

    @Override // X.InterfaceC712990Rxx
    public final void unBind() {
    }

    @Override // X.InterfaceC712990Rxx
    public final void wr() {
    }

    public final SessionInfo op() {
        return (SessionInfo) this.LLJL.getValue();
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void onViewCreated(View view) {
        view.setTag(R.id.k__, C0ZHB.FIRST_ITEM_FILL_TOP);
        C723830SaL.LIZ(this, null, new AwS581S0100000_2(this, 215));
        View viewFindViewById = view.findViewById(R.id.deb);
        if (Build.VERSION.SDK_INT >= 28) {
            int iArgb = Color.argb(C814420VxA.LIZIZ(127.5f), 0, 0, 0);
            viewFindViewById.setOutlineAmbientShadowColor(iArgb);
            viewFindViewById.setOutlineSpotShadowColor(iArgb);
        }
        C1378990lzN.LIZIZ(viewFindViewById, Float.valueOf(C418440Gaw.LIZIZ(20)), null, null, null, null, 30);
        viewFindViewById.setClipToOutline(false);
        viewFindViewById.setElevation(C418440Gaw.LIZIZ(8));
        C786410Ut5.I7(new ACListenerS137S0100000_2(this, 28), (View) this.LLJLILLLLZIIL.getValue());
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1710506mt(this, null), 3);
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ boolean ur(C900040ZSo c900040ZSo) {
        return true;
    }

    @Override // X.InterfaceC712990Rxx
    /* JADX INFO: renamed from: rr */
    public final /* bridge */ /* synthetic */ void up(C900040ZSo c900040ZSo) {
    }

    @Override // X.InterfaceC712990Rxx
    public final /* bridge */ /* synthetic */ void vr(C900040ZSo c900040ZSo) {
    }

    @Override // X.InterfaceC712990Rxx
    public final void sr(InterfaceC1587906Jp interfaceC1587906Jp, List list) {
    }
}
