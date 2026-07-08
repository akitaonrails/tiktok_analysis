package com.ss.android.ugc.aweme.tako.otherpage.third;

import X.AbstractC2361009My;
import X.C07I3;
import X.C0H9N;
import X.C1220000hqw;
import X.C13LE;
import X.C20230914Dz;
import X.C338520DOw;
import X.C444880HcU;
import X.C451460Hn6;
import X.C451620HnM;
import X.C452070Ho5;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736950SvV;
import X.C786410Ut5;
import android.os.Bundle;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.screenshot.IScreenshotService;
import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.otherpage.botcenter.TakoBotCenterViewModel;
import com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS248S0000000_14;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS36S0010000_24;
import kotlin.jvm.internal.AwS390S0200000_24;
import kotlin.jvm.internal.AwS603S0100000_24;

/* JADX INFO: loaded from: classes31.dex */
public final class ThirdPartyBotFragment extends TakoBaseFragment {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZjEtIiB9JzEkLDHELIOS0jKSIpZzs7ITcoZxs7ITcoGS4hPDwOJjsVOiQrJCo9PA==";
    public final C736950SvV LLLLILI = new C736950SvV(C13LE.LIZ(TakoBotCenterViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS274S0000000_30.get$arr$(190), new C451460Hn6(this, false), new C451620HnM(this, true), new C338520DOw(this));

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment
    public final void mS() {
        IScreenshotService iScreenshotService;
        String str;
        AIBotInfo aIBotInfo;
        if (C07I3.LIZ()) {
            TakoEnterParams takoEnterParams = this.LLJILLL;
            if ((takoEnterParams == null || (aIBotInfo = takoEnterParams.botInfo) == null || !aIBotInfo.isNovelBot()) && (iScreenshotService = (IScreenshotService) this.LLIZLLLIL.getValue()) != null) {
                TakoEnterParams takoEnterParams2 = this.LLJILLL;
                if (takoEnterParams2 == null || (str = takoEnterParams2.enterFrom) == null) {
                    str = "";
                }
                iScreenshotService.LJI(str, new AbstractC2361009My() { // from class: X.14E4
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            r6 = r12
            super.onCreate(r13)
            com.ss.android.ugc.aweme.tako.model.TakoEnterParams r0 = r6.LLJILLL
            if (r0 == 0) goto L40
            com.ss.android.ugc.aweme.tako.model.AIBotInfo r5 = r0.botInfo
            if (r5 == 0) goto L40
            long r3 = r5.botId
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L40
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L40
            int r1 = r5.botSource
            r0 = 2
            if (r1 != r0) goto L40
            java.lang.String r0 = r5.botAvatar
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L40
            java.lang.String r0 = r5.botName
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L40
        L2f:
            java.lang.Class<com.ss.android.ugc.aweme.tako.arch.scope.TakoFragmentScope> r7 = com.ss.android.ugc.aweme.tako.arch.scope.TakoFragmentScope.class
            com.ss.android.ugc.aweme.tako.botpage.vm.ability.TakoAIBotUIAbility r8 = new com.ss.android.ugc.aweme.tako.botpage.vm.ability.TakoAIBotUIAbility
            com.ss.android.ugc.aweme.tako.model.TakoEnterParams r0 = r6.LLJILLL
            r8.<init>(r0)
            java.lang.Class<com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility> r9 = com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility.class
            r11 = 0
            r10 = r6
            X.C1558520qew.LJI(r6, r7, r8, r9, r10, r11)
            return
        L40:
            X.19EG r0 = r6.getActivity()
            if (r0 == 0) goto L2f
            r0.finish()
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.tako.otherpage.third.ThirdPartyBotFragment.onCreate(android.os.Bundle):void");
    }

    @Override // com.ss.android.ugc.aweme.tako.ui.TakoBaseFragment, com.bytedance.ies.foundation.fragment.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        AIBotInfo aIBotInfo;
        View viewFindViewById;
        super.onViewCreated(view, bundle);
        List<String> list = null;
        C723850SaN.LIZ(this, false, null, new AwS603S0100000_24(this, 328), 3);
        View viewLIZJ = C20230914Dz.LIZJ(this);
        if (viewLIZJ != null && (viewFindViewById = viewLIZJ.findViewById(R.id.a1_)) != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        C444880HcU c444880HcU = C0H9N.LIZ;
        TakoEnterParams takoEnterParams = this.LLJILLL;
        if (takoEnterParams != null && (aIBotInfo = takoEnterParams.botInfo) != null) {
            list = aIBotInfo.bgUrls;
        }
        C0H9N.LJ(list, new AwS390S0200000_24(this, viewLIZJ, 46));
    }
}
