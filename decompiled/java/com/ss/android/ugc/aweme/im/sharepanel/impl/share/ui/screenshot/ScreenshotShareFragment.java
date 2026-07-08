package com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.screenshot;

import X.AbstractC343940De4;
import X.C01GW;
import X.C0ID2;
import X.C0OM1;
import X.C0ZNY;
import X.C1250250idj;
import X.C1251150ifB;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1331730kl9;
import X.C1331750klB;
import X.C1362230lYL;
import X.C1363150lZp;
import X.C1366320lew;
import X.C1366330lex;
import X.C1366400lf4;
import X.C1366570lfL;
import X.C1366580lfM;
import X.C1369580lkC;
import X.C1370940lmO;
import X.C1370970lmR;
import X.C1371590lnR;
import X.C1371970lo3;
import X.C1388190mED;
import X.C1391190mJ3;
import X.C13LE;
import X.C1440005kM;
import X.C1529905yr;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C343970De7;
import X.C418440Gaw;
import X.C452501pT;
import X.C621180OYa;
import X.C786410Ut5;
import X.C814420VxA;
import X.DialogC1366360lf0;
import X.InterfaceC1356370lOt;
import X.InterfaceC1356390lOv;
import X.InterfaceC1356400lOw;
import X.InterfaceC1362720lZ8;
import X.InterfaceC1363760lao;
import X.InterfaceC1365250ldD;
import X.InterfaceC1366340ley;
import X.InterfaceC1366350lez;
import X.InterfaceC344240DeY;
import Y.ARunnableS54S0300000_21;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import com.ss.android.ugc.aweme.im.message.template.data.QuoteMode;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.dm.IMMediaPublishEvent;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class ScreenshotShareFragment extends BaseFragment implements InterfaceC1356390lOv, InterfaceC344240DeY, InterfaceC1363760lao {
    public static final int LLJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(68));
    public static final int LLJJIJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(96));
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiwhZzw7KTcpOS49LSliICIjJGHELIOSs/IS4hLWs5IGEgKzcpLCEgICo4ZxwwOiApJzw7JzEfIS4hLQM+KCg+LSs4";
    public InterfaceC1356400lOw LLIZ;
    public View LLIZLLLIL;
    public InterfaceC1356370lOt LLJ;
    public String LLJI;
    public boolean LLJILJIL;
    public InterfaceC1366340ley LLJILJILJ;
    public InterfaceC1366350lez LLJILLL;
    public C1369580lkC LLJJ;
    public String LLJIJIL = "other_page";
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 607));

    @Override // X.InterfaceC1356390lOv
    public final void GW(IMContact iMContact) {
    }

    @Override // X.InterfaceC1356390lOv
    public final void Pu0(List<? extends IMContact> list, List<? extends IMContact> list2) {
    }

    @Override // X.InterfaceC1356390lOv
    public final boolean dE(IMContact iMContact, boolean z, Fragment fragment) {
        return false;
    }

    @Override // X.InterfaceC1363760lao
    public final void LJLJJLL() {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, this.LLJILJIL ? C1366400lf4.LIZ : C343970De7.LIZ);
    }

    @Override // X.InterfaceC344240DeY
    public final C0OM1 Sn() {
        Context context;
        String string;
        C0OM1 c0om1 = new C0OM1();
        C1251150ifB c1251150ifB = new C1251150ifB();
        c1251150ifB.LIZLLL();
        c1251150ifB.LIZJ = R.raw.icon_x_mark_small;
        c1251150ifB.LIZJ(new AwS565S0100000_21(this, 608));
        c0om1.LIZIZ(c1251150ifB);
        C1250250idj c1250250idj = new C1250250idj();
        InterfaceC1366340ley interfaceC1366340ley = this.LLJILJILJ;
        if ((interfaceC1366340ley != null && (string = interfaceC1366340ley.LIZLLL(getContext())) != null) || ((context = getContext()) != null && (string = context.getString(2131831561)) != null)) {
            c1250250idj.LIZJ = string;
        }
        c0om1.LIZJ = c1250250idj;
        c0om1.LIZLLL = false;
        return c0om1;
    }

    @Override // X.InterfaceC1363760lao
    public final void Sc(IMContact iMContact) {
        if ((iMContact instanceof IMUser) || (iMContact instanceof IMConversation)) {
            InterfaceC1356370lOt interfaceC1356370lOt = this.LLJ;
            if (interfaceC1356370lOt == null) {
                interfaceC1356370lOt = null;
            }
            interfaceC1356370lOt.LIZ(iMContact);
            C1366320lew.LIZJ(C1366320lew.LIZ, this.LLJIJIL, "enter_chat", iMContact.getUid(), C1529905yr.LIZIZ(iMContact), 16);
        }
    }

    @Override // X.InterfaceC1356390lOv
    public final void jR(List<? extends IMContact> list) {
        String str;
        IMUser iMUser;
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        InterfaceC1356400lOw interfaceC1356400lOw = this.LLIZ;
        InterfaceC1356400lOw interfaceC1356400lOw2 = null;
        if (interfaceC1356400lOw == null) {
            interfaceC1356400lOw = null;
        }
        ArrayList arrayList = new ArrayList();
        for (IMContact iMContact : list) {
            IMContact iMContact2 = iMContact;
            if ((iMContact2 instanceof IMUser) && (iMUser = (IMUser) iMContact2) != null && (imUserBizInfo = iMUser.getImUserBizInfo()) != null && (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) != null) {
                str = userB2CAccountInfo.userTags;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str, "")) {
                arrayList.add(iMContact);
            }
        }
        getContext();
        interfaceC1356400lOw.LLJILJILJ(this, arrayList);
        InterfaceC1356400lOw interfaceC1356400lOw3 = this.LLIZ;
        if (interfaceC1356400lOw3 != null) {
            interfaceC1356400lOw2 = interfaceC1356400lOw3;
        }
        getContext();
        interfaceC1356400lOw2.LLJILJILJ(this, list);
    }

    @Override // X.InterfaceC1356390lOv
    public final void DX1(Throwable th, List list) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF(this, C343970De7.LIZ);
    }

    @Override // X.InterfaceC1356390lOv
    public final boolean eJ2(IMContact iMContact, boolean z) {
        Activity activityLIZ;
        String str;
        AbstractC343940De4 abstractC343940De4;
        InterfaceC1356370lOt interfaceC1356370lOt = null;
        if (!(iMContact instanceof IMUser) && !(iMContact instanceof IMConversation)) {
            if (iMContact instanceof C1363150lZp) {
                InterfaceC1366340ley interfaceC1366340ley = this.LLJILJILJ;
                if (interfaceC1366340ley != null) {
                    String str2 = TuxSheet._pnsPageId;
                    C1391190mJ3.LJFF(this, C343970De7.LIZ);
                    interfaceC1366340ley.LJFF(this.LLJI);
                    return false;
                }
                this.LLJILJIL = true;
                Context context = getContext();
                if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null && (str = this.LLJI) != null) {
                    C1370940lmO c1370940lmO = new C1370940lmO();
                    c1370940lmO.LIZ = "private_screenshot";
                    C786410Ut5.LJJJI("screenshot_path", str, c1370940lmO.LJII);
                    C786410Ut5.LJJJI("enter_from", this.LLJIJIL, c1370940lmO.LJII);
                    C786410Ut5.LJJJI("enter_method", "screenshot_share_panel", c1370940lmO.LJII);
                    SharePackage sharePackage = new SharePackage(c1370940lmO);
                    InterfaceC1365250ldD interfaceC1365250ldD = new InterfaceC1365250ldD() { // from class: X.0lev
                        @Override // X.InterfaceC1365250ldD
                        public final void LIZIZ(HashMap<String, String> map) {
                        }

                        @Override // X.InterfaceC1365250ldD
                        public final void LIZJ(Dialog dialog, SharePackage sharePackage2) {
                        }

                        @Override // X.InterfaceC1365250ldD
                        public final void LJFF(SharePackage sharePackage2) {
                        }

                        @Override // X.InterfaceC1365250ldD
                        public final void LJI(SharePackage sharePackage2) {
                        }

                        @Override // X.InterfaceC1365250ldD
                        public final void LJII(Dialog dialog, SharePackage sharePackage2) {
                        }

                        @Override // X.InterfaceC1365250ldD
                        public final void LJIIIIZZ() {
                        }

                        @Override // X.InterfaceC1365250ldD
                        public final void LJIIIZ(SharePackage sharePackage2) {
                        }

                        @Override // X.InterfaceC1365250ldD
                        public final void LJIIJ(SharePackage sharePackage2, List<? extends IMContact> list) {
                        }

                        @Override // X.InterfaceC1365250ldD
                        public final void LIZLLL() {
                            C1366320lew.LIZIZ(C1366320lew.LIZ, this.LIZ.LLJIJIL, "search");
                        }
                    };
                    C1366330lex c1366330lex = new C1366330lex(new AwS565S0100000_21(this, 1676), new AwS565S0100000_21(this, 1677));
                    InterfaceC1356370lOt interfaceC1356370lOt2 = this.LLJ;
                    if (interfaceC1356370lOt2 != null) {
                        interfaceC1356370lOt = interfaceC1356370lOt2;
                    }
                    C786410Ut5.B4(new DialogC1366360lf0(activityLIZ, null, interfaceC1365250ldD, c1366330lex, sharePackage, null, null, interfaceC1356370lOt.LIZIZ(), C0ZNY.LIZJ(), false));
                    String str3 = TuxSheet._pnsPageId;
                    if (this.LLJILJIL) {
                        abstractC343940De4 = C1366400lf4.LIZ;
                    } else {
                        abstractC343940De4 = C343970De7.LIZ;
                    }
                    C1391190mJ3.LJFF(this, abstractC343940De4);
                }
                if (C1366580lfM.LIZLLL()) {
                    C1366570lfL.LL.LIZLLL();
                }
                C1366320lew.LIZJ(C1366320lew.LIZ, this.LLJIJIL, "more", null, null, 28);
            }
            return false;
        }
        String strLIZIZ = C1529905yr.LIZIZ(iMContact);
        InterfaceC1366340ley interfaceC1366340ley2 = this.LLJILJILJ;
        if (interfaceC1366340ley2 != null) {
            String str4 = TuxSheet._pnsPageId;
            C1391190mJ3.LJFF(this, C343970De7.LIZ);
            interfaceC1366340ley2.LJI(iMContact, this.LLJI);
            return false;
        }
        if (z) {
            this.LLJILJIL = true;
            InterfaceC1356370lOt interfaceC1356370lOt3 = this.LLJ;
            if (interfaceC1356370lOt3 != null) {
                interfaceC1356370lOt = interfaceC1356370lOt3;
            }
            interfaceC1356370lOt.LIZLLL(iMContact);
            if (C1366580lfM.LIZLLL()) {
                C1366570lfL.LL.LIZLLL();
            }
            C1366320lew.LIZJ(C1366320lew.LIZ, this.LLJIJIL, "share_head", iMContact.getUid(), strLIZIZ, 16);
            if (strLIZIZ != null) {
                MediaModel mediaModel = new MediaModel("");
                mediaModel.LJIILL(this.LLJI);
                mediaModel.type = 1;
                IMMediaPublishEvent.DMAlbumMediaPublishEvent dMAlbumMediaPublishEvent = new IMMediaPublishEvent.DMAlbumMediaPublishEvent(strLIZIZ, Collections.singletonList(mediaModel), C2097608Jq.LJIIJ(new Pair("enter_from", this.LLJIJIL), new Pair("enter_method", "screenshot_share_panel")), null, QuoteMode.None.INSTANCE, null, null, null, null);
                IInternalShareApi.LIZ.getClass();
                C1370970lmR.LIZ().LIZIZ().LJJIZ(Collections.singletonList(iMContact));
                C1440005kM.LIZ(dMAlbumMediaPublishEvent);
            }
        }
        return z;
    }

    @Override // com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SharePackage sharePackageLIZ;
        InterfaceC1366350lez interfaceC1366350lez;
        Activity activityLIZ;
        super.onViewCreated(view, bundle);
        View view2 = this.LLIZLLLIL;
        View view3 = null;
        if (view2 == null) {
            view2 = null;
        }
        SmartImageView smartImageView = (SmartImageView) view2.findViewById(R.id.u2d);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("file://");
        sbLIZ.append(this.LLJI);
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)));
        c1331670kl3LJI.LJJ(smartImageView);
        C1331750klB c1331750klB = new C1331750klB();
        c1331750klB.LJ = C418440Gaw.LIZIZ(5);
        c1331670kl3LJI.LJJI = new C1331730kl9(c1331750klB);
        c1331670kl3LJI.LJIIJ(new C0ID2(smartImageView, 1));
        InterfaceC1366350lez interfaceC1366350lez2 = this.LLJILLL;
        if (interfaceC1366350lez2 != null) {
            sharePackageLIZ = interfaceC1366350lez2.LIZ();
        } else {
            sharePackageLIZ = null;
        }
        if (sharePackageLIZ != null && (interfaceC1366350lez = this.LLJILLL) != null && interfaceC1366350lez.LIZIZ()) {
            View view4 = this.LLIZLLLIL;
            if (view4 != null) {
                view3 = view4;
            }
            C1369580lkC c1369580lkC = (C1369580lkC) view3.findViewById(R.id.v10);
            this.LLJJ = c1369580lkC;
            if (c1369580lkC != null) {
                C786410Ut5.B0(c1369580lkC, 0);
            }
            Context context = getContext();
            if (context != null && (activityLIZ = C1388190mED.LIZ(context)) != null) {
                C1371590lnR c1371590lnRLJIIIZ = C621180OYa.LIZ.LJIIIZ(sharePackageLIZ, activityLIZ, new C1371970lo3(C13LE.LIZ(sharePackageLIZ.getClass())));
                C1362230lYL c1362230lYL = new C1362230lYL();
                c1362230lYL.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(83));
                c1362230lYL.LJIIIIZZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.5d)));
                c1362230lYL.LJIIIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9));
                c1362230lYL.LJIIJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.5d)));
                c1371590lnRLJIIIZ.LJJLIIIJILLIZJL = c1362230lYL;
                C1369580lkC c1369580lkC2 = this.LLJJ;
                if (c1369580lkC2 != null) {
                    c1369580lkC2.LLJJIII = c1371590lnRLJIIIZ;
                    C621180OYa.LIZ.LJJJ(c1371590lnRLJIIIZ, c1369580lkC2, activityLIZ, new InterfaceC1362720lZ8() { // from class: X.0HYi
                        @Override // X.InterfaceC1362720lZ8
                        public final void Ds(Function0<Unit> function0) {
                        }

                        @Override // X.InterfaceC1362720lZ8
                        public final void s1(int i) {
                        }

                        @Override // X.InterfaceC1362720lZ8
                        public final void F8(AbstractC343940De4 abstractC343940De4) {
                            String str = TuxSheet._pnsPageId;
                            C1391190mJ3.LJFF(this.LL, C343970De7.LIZ);
                        }
                    });
                }
                HandlerHook.viewPost(view, new ARunnableS54S0300000_21(this, view, c1371590lnRLJIIIZ, 7));
                return;
            }
            return;
        }
        View view5 = this.LLIZLLLIL;
        if (view5 != null) {
            view3 = view5;
        }
        C1369580lkC c1369580lkC3 = (C1369580lkC) view3.findViewById(R.id.v10);
        this.LLJJ = c1369580lkC3;
        if (c1369580lkC3 == null) {
            return;
        }
        C786410Ut5.B0(c1369580lkC3, 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0169  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.LayoutInflater r23, android.view.ViewGroup r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.screenshot.ScreenshotShareFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
