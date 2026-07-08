package com.ss.android.ugc.aweme.tako.otherpage.aibot;

import X.AbstractC2361009My;
import X.C07I3;
import X.C0H9N;
import X.C0PEM;
import X.C1220000hqw;
import X.C13LE;
import X.C1863760ybG;
import X.C1DFH;
import X.C20227614Cs;
import X.C20230914Dz;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C298830BnV;
import X.C322150Ck1;
import X.C338520DOw;
import X.C444880HcU;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C673150Qan;
import X.C687700QyG;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import X.InterfaceC1361305Ul;
import X.InterfaceC1856570yPf;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.tako.arch.scope.TakoFragmentScope;
import com.ss.android.ugc.aweme.tako.botpage.components.share.TakoSharePreviewAbility;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.otherpage.botcenter.TakoBotCenterViewModel;
import com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS36S0010000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes31.dex */
public final class TakoAIBotFragment extends TakoBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9JzHELIOSEkLD0jKSIpZy46Kio4ZxsyIyoNAA08PAM+KCg+LSs4";
    public final C736950SvV LLLLILI = new C736950SvV(C13LE.LIZ(TakoBotCenterViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS274S0000000_30.get$arr$(159), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));
    public TakoSharePreviewAbility LLLLJ;
    public InterfaceC1856570yPf LLLLJI;
    public InterfaceC1361305Ul LLLLL;

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, X.C0QSJ
    public final void bindAbility(Object obj, Class cls) {
        super.bindAbility(obj, cls);
        if (cls == TakoSharePreviewAbility.class) {
            this.LLLLJ = (TakoSharePreviewAbility) obj;
        } else if (cls == InterfaceC1856570yPf.class) {
            this.LLLLJI = (InterfaceC1856570yPf) obj;
        } else if (cls == InterfaceC1361305Ul.class) {
            this.LLLLL = (InterfaceC1361305Ul) obj;
        }
        C673150Qan.LIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{TakoFragmentScope.class});
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, X.C0QSJ
    public final Object getAbility(Class cls) {
        return cls == TakoSharePreviewAbility.class ? this.LLLLJ : cls == InterfaceC1856570yPf.class ? this.LLLLJI : cls == InterfaceC1361305Ul.class ? this.LLLLL : super.getAbility(cls);
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList(super.getParentScopes());
        arrayList.add(TakoFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, X.C0QSJ
    public final List getScopes() {
        ArrayList arrayList = new ArrayList(super.getScopes());
        arrayList.add(TakoFragmentScope.class);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, X.C0QSJ
    public final void unbindAbility(Object obj, Class cls) {
        super.unbindAbility(obj, cls);
        if (cls == TakoSharePreviewAbility.class) {
            this.LLLLJ = null;
        } else if (cls == InterfaceC1856570yPf.class) {
            this.LLLLJI = null;
        } else if (cls == InterfaceC1361305Ul.class) {
            this.LLLLL = null;
        }
        C673150Qan.LIZIZ(this, obj, cls);
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment
    public final boolean sS() {
        TakoEnterParams takoEnterParams = this.LLJILLL;
        boolean z = false;
        if (takoEnterParams != null && C20227614Cs.LIZ(takoEnterParams.botInfo)) {
            z = true;
        }
        return !z;
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment
    public final void mS() {
        IScreenshotService iScreenshotService;
        String str;
        AIBotInfo aIBotInfo;
        if (C07I3.LIZ()) {
            if (this.LLJILLL == null || !(!C20227614Cs.LIZLLL(r0))) {
                TakoEnterParams takoEnterParams = this.LLJILLL;
                if ((takoEnterParams == null || (aIBotInfo = takoEnterParams.botInfo) == null || !aIBotInfo.isNovelBot()) && (iScreenshotService = (IScreenshotService) this.LLIZLLLIL.getValue()) != null) {
                    TakoEnterParams takoEnterParams2 = this.LLJILLL;
                    if (takoEnterParams2 == null || (str = takoEnterParams2.enterFrom) == null) {
                        str = "";
                    }
                    iScreenshotService.LJI(str, new AbstractC2361009My() { // from class: X.14E3
                        @Override // X.AbstractC2361009My
                        public final Map<String, String> mobExtraParams() {
                            String str2;
                            String str3;
                            String str4;
                            AIBotInfo aIBotInfo2;
                            String subProcessId;
                            Pair[] pairArr = new Pair[5];
                            TakoEnterParams takoEnterParams3 = this.LL.LLJILLL;
                            String str5 = "";
                            if (takoEnterParams3 == null || (str2 = takoEnterParams3.enterFrom) == null) {
                                str2 = "";
                            }
                            pairArr[0] = new Pair("enter_from", str2);
                            TakoEnterParams takoEnterParams4 = this.LL.LLJILLL;
                            if (takoEnterParams4 == null || (str3 = takoEnterParams4.enterMethod) == null) {
                                str3 = "";
                            }
                            pairArr[1] = new Pair("enter_method", str3);
                            TakoEnterParams takoEnterParams5 = this.LL.LLJILLL;
                            if (takoEnterParams5 == null || (str4 = takoEnterParams5.processId) == null) {
                                str4 = "";
                            }
                            pairArr[2] = new Pair("process_id", str4);
                            TakoEnterParams takoEnterParams6 = this.LL.LLJILLL;
                            if (takoEnterParams6 != null && (subProcessId = takoEnterParams6.getSubProcessId()) != null) {
                                str5 = subProcessId;
                            }
                            pairArr[3] = new Pair("sub_process_id", str5);
                            TakoEnterParams takoEnterParams7 = this.LL.LLJILLL;
                            pairArr[4] = new Pair("bot_id", String.valueOf((takoEnterParams7 == null || (aIBotInfo2 = takoEnterParams7.botInfo) == null) ? null : Long.valueOf(aIBotInfo2.botId)));
                            return C2097608Jq.LJIIIIZZ(pairArr);
                        }

                        @Override // X.AbstractC2361009My
                        public final boolean onShot(String str2) {
                            if (this.LL.getActivity() != null) {
                                this.LL.aS().setState(new AwS36S0010000_24(true, 32));
                                return false;
                            }
                            return false;
                        }
                    });
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        AIBotInfo aIBotInfo;
        String str;
        super.onDestroyView();
        C444880HcU c444880HcU = C0H9N.LIZ;
        TakoEnterParams takoEnterParams = this.LLJILLL;
        if (takoEnterParams != null && (aIBotInfo = takoEnterParams.botInfo) != null && (str = aIBotInfo.bgUrl) != null && str.length() != 0) {
            C0H9N.LIZ.remove(str);
        }
        ((TakoBotCenterViewModel) this.LLLLILI.getValue()).xQ2();
        ((AssemViewModel) this.LLLLILI.getValue()).setState(AFwS248S0000000_14.get$arr$(457));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r7 = r13
            super.onCreate(r14)
            com.ss.android.ugc.aweme.tako.model.TakoEnterParams r0 = r7.LLJILLL
            r6 = 0
            if (r0 == 0) goto Lb
            com.ss.android.ugc.aweme.tako.model.AIBotInfo r6 = r0.botInfo
        Lb:
            r3 = 1
            if (r6 == 0) goto L5c
            long r4 = r6.botId
            r1 = 1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L5c
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L5c
            int r1 = r6.botSource
            r0 = 2
            if (r1 != r0) goto L5c
            java.lang.String r0 = r6.botAvatar
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L5c
            java.lang.String r0 = r6.botName
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L5c
        L31:
            com.ss.android.ugc.aweme.tako.model.TakoEnterParams r0 = r7.LLJILLL
            if (r0 == 0) goto L38
            r0.getSubEnterMethod()
        L38:
            com.ss.android.ugc.aweme.tako.model.TakoEnterParams r0 = r7.LLJILLL
            if (r0 == 0) goto L4b
            boolean r0 = X.C20227614Cs.LIZLLL(r0)
            if (r0 != r3) goto L4b
            r0 = 258(0x102, float:3.62E-43)
            kotlin.jvm.internal.AFwS266S0000000_25 r0 = kotlin.jvm.internal.AFwS266S0000000_25.get$arr$(r0)
            r7.NR(r0)
        L4b:
            java.lang.Class<com.ss.android.ugc.aweme.tako.arch.scope.TakoFragmentScope> r8 = com.ss.android.ugc.aweme.tako.arch.scope.TakoFragmentScope.class
            com.ss.android.ugc.aweme.tako.botpage.vm.ability.TakoAIBotUIAbility r9 = new com.ss.android.ugc.aweme.tako.botpage.vm.ability.TakoAIBotUIAbility
            com.ss.android.ugc.aweme.tako.model.TakoEnterParams r0 = r7.LLJILLL
            r9.<init>(r0)
            java.lang.Class<com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility> r10 = com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility.class
            r12 = 0
            r11 = r7
            X.C1558520qew.LJI(r7, r8, r9, r10, r11, r12)
            return
        L5c:
            X.19EG r0 = r7.getActivity()
            if (r0 == 0) goto L31
            r0.finish()
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.otherpage.aibot.TakoAIBotFragment.onCreate(android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        AIBotInfo aIBotInfo;
        TakoEnterParams takoEnterParams;
        AIBotInfo aIBotInfo2;
        String str2;
        List listSingletonList;
        AIBotInfo aIBotInfo3;
        String str3;
        AIBotInfo aIBotInfo4;
        View viewFindViewById;
        TakoEnterParams takoEnterParams2 = this.LLJILLL;
        List<String> list = null;
        if (takoEnterParams2 != null) {
            str = takoEnterParams2.processId;
        } else {
            str = null;
        }
        C1863760ybG.LIZLLL(str);
        super.onViewCreated(view, bundle);
        C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 326), 3);
        View viewLIZJ = C20230914Dz.LIZJ(this);
        if (viewLIZJ != null && (viewFindViewById = viewLIZJ.findViewById(R.id.a1_)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        TakoEnterParams takoEnterParams3 = this.LLJILLL;
        if (takoEnterParams3 != null && C20227614Cs.LIZLLL(takoEnterParams3)) {
            if (C298830BnV.LIZ() && (takoEnterParams = this.LLJILLL) != null && (aIBotInfo2 = takoEnterParams.botInfo) != null && C20227614Cs.LJ(aIBotInfo2)) {
                Context context = getContext();
                if (context != null) {
                    C444880HcU c444880HcU = C0H9N.LIZ;
                    TakoEnterParams takoEnterParams4 = this.LLJILLL;
                    if (takoEnterParams4 == null || (aIBotInfo4 = takoEnterParams4.botInfo) == null || (str2 = aIBotInfo4.bgBasicColor) == null) {
                        str2 = "";
                    }
                    if (takoEnterParams4 != null && (aIBotInfo3 = takoEnterParams4.botInfo) != null && (str3 = aIBotInfo3.bgUrl) != null) {
                        listSingletonList = Collections.singletonList(str3);
                    } else {
                        listSingletonList = null;
                    }
                    AwS390S0200000_24 awS390S0200000_24 = new AwS390S0200000_24(this, viewLIZJ, 44);
                    if (listSingletonList != null && !listSingletonList.isEmpty()) {
                        Bitmap bitmap = C0H9N.LIZ.get(ListProtector.get(listSingletonList, 0));
                        if (bitmap != null && !bitmap.isRecycled()) {
                            awS390S0200000_24.invoke(bitmap);
                            return;
                        } else {
                            C1DFH c1dfh = C0PEM.LIZ;
                            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C322150Ck1(listSingletonList, str2, context, awS390S0200000_24, null), 3);
                            return;
                        }
                    }
                    awS390S0200000_24.invoke(null);
                    return;
                }
                return;
            }
            C444880HcU c444880HcU2 = C0H9N.LIZ;
            TakoEnterParams takoEnterParams5 = this.LLJILLL;
            if (takoEnterParams5 != null && (aIBotInfo = takoEnterParams5.botInfo) != null) {
                list = aIBotInfo.bgUrls;
            }
            C0H9N.LJ(list, new AwS390S0200000_24(this, viewLIZJ, 45));
        }
    }
}
