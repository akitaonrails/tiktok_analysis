package com.ss.android.ugc.aweme.upvote.publish;

import X.AbstractC1387200mCc;
import X.C09YA;
import X.C0O8X;
import X.C1358700lSe;
import X.C1388190mED;
import X.C14EU;
import X.C1906580ziK;
import X.C19EG;
import X.C211000rc;
import X.C2188811AlT;
import X.C739870T0n;
import X.C751650Te7;
import X.InterfaceC0148002o;
import X.InterfaceC1914010zuJ;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.notice.api.ab.AddOptionForGuidanceExp;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelAuthEdmAndSmsGuideV3;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthRefactorExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import com.ss.android.ugc.aweme.upvote.detail.input.RepostInputFragment;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes13.dex */
public final class UpvotePublishVM extends AssemViewModel<C1358700lSe> {
    public final C0O8X LL = new C0O8X();
    public final C09YA LLILLJJLI = new C09YA(this, new C751650Te7());

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1358700lSe(0);
    }

    public static boolean wQ2() {
        Activity activityLIZIZ;
        C19EG c19egLIZIZ;
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        if (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null || (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) == null) {
            return false;
        }
        for (Fragment fragment : c19egLIZIZ.getSupportFragmentManager().LJJLIIIJL()) {
            if (fragment instanceof RepostInputFragment) {
                Dialog dialog = ((DialogFragment) fragment).getDialog();
                return dialog != null && dialog.isShowing();
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String vQ2() {
        /*
            r4 = this;
            X.0mCc r0 = X.C1906580ziK.LJ()
            r3 = 0
            if (r0 == 0) goto L54
            java.lang.Object r1 = r0.LIZ
        L9:
            boolean r0 = r1 instanceof X.InterfaceC1603190roz
            if (r0 == 0) goto L10
            r3 = r1
            X.0roz r3 = (X.InterfaceC1603190roz) r3
        L10:
            java.lang.String r2 = "homepage_hot"
            if (r3 == 0) goto L1f
            java.lang.String r1 = r3.getEnterFrom()
            int r0 = r1.hashCode()
            switch(r0) {
                case -1572049565: goto L4b;
                case -1271119582: goto L20;
                case -667094460: goto L29;
                case -562830579: goto L32;
                case 1691937916: goto L3b;
                case 1691943685: goto L42;
                default: goto L1f;
            }
        L1f:
            return r2
        L20:
            java.lang.String r0 = "homepage_follow"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L53
            return r2
        L29:
            java.lang.String r0 = "homepage_friends"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L53
            return r2
        L32:
            java.lang.String r0 = "personal_homepage"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L53
            return r2
        L3b:
            boolean r0 = r1.equals(r2)
            if (r0 != 0) goto L53
            return r2
        L42:
            java.lang.String r0 = "homepage_now"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L53
            return r2
        L4b:
            java.lang.String r0 = "notification_page"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1f
        L53:
            return r1
        L54:
            r1 = r3
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.upvote.publish.UpvotePublishVM.vQ2():java.lang.String");
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onCommentListPanelShow(C739870T0n c739870T0n) {
        final Activity activityLIZIZ;
        if (c739870T0n.LIZ == 0) {
            EventBus.LIZLLL().LJJI(this);
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
                if (!ChannelsAuthRefactorExp.INSTANCE.enabled() && !ChannelAuthEdmAndSmsGuideV3.INSTANCE.enabled()) {
                    ((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJIIJ(ActivityStack.getTopActivity(), "repost_finish", new InterfaceC1914010zuJ() { // from class: X.0Te6
                        @Override // X.InterfaceC1914010zuJ
                        public final void LIZIZ() {
                        }

                        @Override // X.InterfaceC1914010zuJ
                        public final void LIZ() {
                            String strLIZIZ = AddOptionForGuidanceExp.LIZIZ("repost");
                            C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
                            Context context = activityLIZIZ;
                            if (strLIZIZ.length() == 0) {
                                strLIZIZ = "normal";
                            }
                            c19212010Ec.LJIILJJIL(context, new C1917290zzb(strLIZIZ, this.vQ2(), "exit_comment", "repost", null, null, null, null, null, 8176));
                        }
                    });
                    return;
                }
                UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZJ("repost_finish");
                unifiedAuthPopupConfigLIZJ.setSceneId("repost_finish_exit_comment");
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ);
                if (c19egLIZIZ != null) {
                    String strLJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LJ(c19egLIZIZ);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("EnterFrom: ");
                    sbLIZ.append(vQ2());
                    sbLIZ.append("; TabName: ");
                    sbLIZ.append(strLJ);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C211000rc.LIZ("[Push]");
                    unifiedAuthPopupConfigLIZJ.setSubSceneId(strLJ);
                }
                unifiedAuthPopupConfigLIZJ.setEnterFrom(vQ2());
                unifiedAuthPopupConfigLIZJ.setEnterMethod("exit_comment");
                unifiedAuthPopupConfigLIZJ.setSysPage("repost_finish");
                ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZLLL(activityLIZIZ, null, unifiedAuthPopupConfigLIZJ);
            }
        }
    }
}
