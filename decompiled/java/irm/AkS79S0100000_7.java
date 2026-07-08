package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0JCY;
import X.C0JIB;
import X.C0JIC;
import X.C0JIE;
import X.C0JIP;
import X.C1161920gLG;
import X.C1247510iZJ;
import X.C12ES;
import X.C1388190mED;
import X.C1390850mIV;
import X.C1390920mIc;
import X.C1391190mJ3;
import X.C19EG;
import X.C23250099c;
import X.C343970De7;
import X.C489110JGb;
import X.C489720JIk;
import X.C490900JMy;
import X.C497740JfY;
import X.C823050WQl;
import X.DialogInterfaceOnCancelListenerC521720Kd8;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.feed.adapter.widget.repost.RepostPanelListCell;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.LiveHighLightPageFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.ViewerHighLightGuideDialogFragment;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.ViewerHighLightIntroDialogFragment;
import com.ss.android.ugc.aweme.pcs.course.coursedetailpage.view.dialog.PcsCourseM2GuideSheet;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.PcsCourseManagementContentAssemV2;
import com.ss.android.ugc.aweme.pcs.course.managementpage.uiv2.powerlist.CourseTitleCell;
import com.ss.android.ugc.aweme.pcs.course.musicpeelpage.ui.PcsCourseMusicPeelFragment;
import com.ss.android.ugc.aweme.pcs.course.musicpeelpage.viewmodel.PcsCourseMusicPeelVM;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class AkS79S0100000_7 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1173120gdK
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                LIZ$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                LIZ$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZ$13(this, view);
                break;
            case 14:
                LIZ$14(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS79S0100000_7(CourseTitleCell courseTitleCell, int i) {
        super(1000L);
        this.$t = i;
        this.l0 = courseTitleCell;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ$0(irm.AkS79S0100000_7 r9, android.view.View r10) {
        /*
            java.lang.Object r4 = r9.l0
            com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem.VideoPlayerTopOverlayAssem r4 = (com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem.VideoPlayerTopOverlayAssem) r4
            com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility r0 = r4.LLJJIJIL
            r8 = 0
            if (r0 != 0) goto L41
            monitor-enter(r4)
            com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility r0 = r4.LLJJIJIL     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L3a
            X.0QSJ r1 = r4.LLJJJIL     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L2e
            X.0Q7z r3 = r4.LLJJJ     // Catch: java.lang.Throwable -> L3c
            if (r3 != 0) goto L1c
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L3c
            r4.LLJJJ = r3     // Catch: java.lang.Throwable -> L3c
        L1c:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L3c
            java.lang.Class<com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.model.VideoPlayerFragmentScope> r1 = com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.model.VideoPlayerFragmentScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L3c
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L3c
            r4.LLJJJIL = r1     // Catch: java.lang.Throwable -> L3c
            if (r1 != 0) goto L2e
            r0 = r8
            goto L36
        L2e:
            java.lang.Class<com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility> r0 = com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L3c
            com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility r0 = (com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.ability.VideoPlayerPagerAbility) r0     // Catch: java.lang.Throwable -> L3c
        L36:
            r4.LLJJIJIL = r0     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L3c
            goto L3f
        L3a:
            monitor-exit(r4)
            goto L41
        L3c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L3f:
            if (r0 == 0) goto L8a
        L41:
            X.0JMk r0 = r0.LLJLLL()
            if (r0 == 0) goto L8a
            X.0JMR r7 = r0.LLILLJJLI
            if (r7 == 0) goto L8a
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem.VideoPlayerTopOverlayAssem r0 = (com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem.VideoPlayerTopOverlayAssem) r0
            X.0JMJ r0 = r0.hp()
            if (r0 == 0) goto L8a
            long r1 = r0.LLILLJJLI
            java.lang.String r6 = "click"
            java.lang.String r5 = "more"
            long r3 = r7.LIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            X.C490770JMl.LIZLLL(r0, r6, r5)
            X.0JMX r3 = X.C0JMX.LIZ
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem.VideoPlayerTopOverlayAssem r0 = (com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem.VideoPlayerTopOverlayAssem) r0
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L74
            android.app.Activity r8 = X.C1388190mED.LIZ(r0)
        L74:
            java.lang.Object r0 = r9.l0
            com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem.VideoPlayerTopOverlayAssem r0 = (com.ss.android.ugc.aweme.pcs.course.videoplayerpage.fragment.assem.contentassem.VideoPlayerTopOverlayAssem) r0
            X.0JMJ r0 = r0.hp()
            if (r0 == 0) goto L82
            java.lang.String r0 = r0.LL
            if (r0 != 0) goto L84
        L82:
            java.lang.String r0 = ""
        L84:
            r3.getClass()
            X.C0JMX.LIZ(r1, r8, r7, r0)
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: irm.AkS79S0100000_7.LIZ$0(irm.AkS79S0100000_7, android.view.View):void");
    }

    public static final void LIZ$1(AkS79S0100000_7 akS79S0100000_7, View view) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((ViewerHighLightGuideDialogFragment) akS79S0100000_7.l0, C343970De7.LIZ);
        ((ViewerHighLightGuideDialogFragment) akS79S0100000_7.l0).MR("click", "cancel");
    }

    public static final void LIZ$10(AkS79S0100000_7 akS79S0100000_7, View view) {
        ((C490900JMy) akS79S0100000_7.l0).LIZLLL();
    }

    public static final void LIZ$11(AkS79S0100000_7 akS79S0100000_7, View view) {
        ((C489720JIk) akS79S0100000_7.l0).LIZLLL();
    }

    public static final void LIZ$12(AkS79S0100000_7 akS79S0100000_7, View view) {
        ViewerHighLightIntroDialogFragment viewerHighLightIntroDialogFragment = new ViewerHighLightIntroDialogFragment("highlight_page");
        int iLJIIIIZZ = (int) (((double) C12ES.LJIIIIZZ(((LiveHighLightPageFragment) akS79S0100000_7.l0).getContext())) * 0.75d);
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = viewerHighLightIntroDialogFragment;
        tuxSheet.LLJJIJIIJIL = true;
        c1390920mIc.LJIIIIZZ(2);
        c1390920mIc.LIZIZ(iLJIIIIZZ, iLJIIIIZZ);
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLJLILLLLZIIL = false;
        tuxSheet2.LL = new DialogInterfaceOnCancelListenerC521720Kd8(viewerHighLightIntroDialogFragment, 6);
        tuxSheet2.show(((LiveHighLightPageFragment) akS79S0100000_7.l0).getParentFragmentManager(), "user_highlight_faq");
    }

    public static final void LIZ$13(AkS79S0100000_7 akS79S0100000_7, View view) {
        ((PcsCourseMusicPeelFragment) akS79S0100000_7.l0).VR().wQ2("click", "save");
        PcsCourseMusicPeelVM pcsCourseMusicPeelVMVR = ((PcsCourseMusicPeelFragment) akS79S0100000_7.l0).VR();
        C0JIC c0jic = pcsCourseMusicPeelVMVR.getState().LLILLJJLI;
        c0jic.getClass();
        if ((c0jic instanceof C0JIE) || (c0jic instanceof C0JIB)) {
            pcsCourseMusicPeelVMVR.setState(AFwS237S0000000_7.get$arr$(162));
            C23250099c.LIZLLL(pcsCourseMusicPeelVMVR.getAssemVMScope(), null, null, new C0JIP(pcsCourseMusicPeelVMVR, null), 3);
        }
    }

    public static final void LIZ$14(AkS79S0100000_7 akS79S0100000_7, View view) {
        ((PcsCourseMusicPeelFragment) akS79S0100000_7.l0).VR().xQ2();
    }

    public static final void LIZ$2(AkS79S0100000_7 akS79S0100000_7, View view) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((ViewerHighLightGuideDialogFragment) akS79S0100000_7.l0, C343970De7.LIZ);
        ((ViewerHighLightGuideDialogFragment) akS79S0100000_7.l0).LL.invoke();
        ((ViewerHighLightGuideDialogFragment) akS79S0100000_7.l0).MR("click", "confirm");
    }

    public static final void LIZ$3(AkS79S0100000_7 akS79S0100000_7, View view) {
        String str = TuxSheet._pnsPageId;
        C1391190mJ3.LJFF((ViewerHighLightIntroDialogFragment) akS79S0100000_7.l0, C343970De7.LIZ);
        ((ViewerHighLightIntroDialogFragment) akS79S0100000_7.l0).MR("click", "cancel");
    }

    public static final void LIZ$4(AkS79S0100000_7 akS79S0100000_7, View view) {
        ((PcsCourseM2GuideSheet) akS79S0100000_7.l0).close(1);
    }

    public static final void LIZ$5(AkS79S0100000_7 akS79S0100000_7, View view) {
        ((PcsCourseM2GuideSheet) akS79S0100000_7.l0).getClass();
        C823050WQl.LIZLLL().execute(new Runnable() { // from class: X.0C9D
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PcsCourseM2GuideSheet@7950.logM2GuideClick$1");
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("enter_from", "service_plus_course_purchase_page");
                    AppLogNewUtils.onEventV3("guide_user_m2_click", jSONObject);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PcsCourseM2GuideSheet@7950.logM2GuideClick$1");
            }
        });
        IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
        Context context = ((PcsCourseM2GuideSheet) akS79S0100000_7.l0).getContext();
        ((PcsCourseM2GuideSheet) akS79S0100000_7.l0).getClass();
        iActionHandlerService.handle(context, "aweme://outreach?operation=open_or_install&open_schema=snssdkotl259%3A%2F%2F&install_schema=https%3A%2F%2Fplay.google.com%2Fd%3Fid%3Dcom.ss.android.tt.creator&app_id=com.nc.tiktok.usmain&is_mini_card=true&outreach_type=popup&outreach_intention=guide_download&outreach_key=m2_pns_popup_guide_download&outreach_landingpage_name=outer_store&outreach_to_app_id=259&enter_from=course");
    }

    public static final void LIZ$6(AkS79S0100000_7 akS79S0100000_7, View view) {
        ((RepostPanelListCell) akS79S0100000_7.l0).itemView.performClick();
        ((RepostPanelListCell) akS79S0100000_7.l0).R5("head");
    }

    public static final void LIZ$7(AkS79S0100000_7 akS79S0100000_7, View view) {
        ((RepostPanelListCell) akS79S0100000_7.l0).itemView.performClick();
        ((RepostPanelListCell) akS79S0100000_7.l0).R5("nickname");
    }

    public static final void LIZ$8(AkS79S0100000_7 akS79S0100000_7, View view) {
        FragmentManager supportFragmentManager;
        RepostPanelListCell repostPanelListCell = (RepostPanelListCell) akS79S0100000_7.l0;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(repostPanelListCell.itemView.getContext());
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            ArrayList arrayList = new ArrayList();
            C1247510iZJ c1247510iZJ = new C1247510iZJ();
            c1247510iZJ.LIZJ = 0;
            c1247510iZJ.LIZ = repostPanelListCell.itemView.getContext().getString(2131846356);
            c1247510iZJ.LIZ(new AwS606S0100000_27(repostPanelListCell, 372));
            arrayList.add(c1247510iZJ);
            if (!arrayList.isEmpty()) {
                C1390850mIV c1390850mIV = new C1390850mIV();
                c1390850mIV.LJI(arrayList);
                c1390850mIV.LIZJ().show(supportFragmentManager, "repost_detail_panel_cell");
            }
        }
        ((RepostPanelListCell) akS79S0100000_7.l0).R5("button");
    }

    public static final void LIZ$9(AkS79S0100000_7 akS79S0100000_7, View view) {
        CharSequence text;
        C489110JGb.LIZLLL(((CourseTitleCell) akS79S0100000_7.l0).L5(), ((CourseTitleCell) akS79S0100000_7.l0).I5(), "edit_title", "click");
        int i = PcsCourseManagementContentAssemV2.LLJJJIL;
        String strLJIJI = C497740JfY.LJIJI(2131855855);
        TuxTextView tuxTextView = ((CourseTitleCell) akS79S0100000_7.l0).LLILLL;
        String strValueOf = null;
        CharSequence text2 = null;
        strValueOf = null;
        strValueOf = null;
        if (tuxTextView != null && (text = tuxTextView.getText()) != null && !a0.LJJJIL(text)) {
            TuxTextView tuxTextView2 = ((CourseTitleCell) akS79S0100000_7.l0).LLILLL;
            if (tuxTextView2 != null) {
                text2 = tuxTextView2.getText();
            }
            strValueOf = String.valueOf(text2);
        }
        ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).handleSchema(((CourseTitleCell) akS79S0100000_7.l0).getContext(), C0JCY.LIZ("sku_title", strLJIJI, "", false, strValueOf, 35, 8), new Bundle());
    }

    public AkS79S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
