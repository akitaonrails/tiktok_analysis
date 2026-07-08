package irm;

import X.AbstractViewOnClickListenerC1173120gdK;
import X.C0CHQ;
import X.C0I7D;
import X.C0LAB;
import X.C1390380mHk;
import X.C1427290nFH;
import X.C1427320nFK;
import X.C1443400nfG;
import X.C1443990ngD;
import X.C1447200nlO;
import X.C1447250nlT;
import X.C1460640o74;
import X.C1749260vca;
import X.C20684815ws;
import X.C786410Ut5;
import android.view.View;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverFragment;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.ChooseCoverActivity;
import com.ss.android.ugc.aweme.shortvideo.vechoosecover.VEChooseVideoCoverFragment;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: loaded from: classes23.dex */
public class AkS60S0200000_22 extends AbstractViewOnClickListenerC1173120gdK {
    public final int $t;
    public Object l0;
    public Object l1;

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
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(AkS60S0200000_22 akS60S0200000_22, View view) {
        C1749260vca c1749260vca;
        C0I7D editTextView;
        ((C1749260vca) akS60S0200000_22.l0).getEditTextView().setText("");
        C1427320nFK c1427320nFK = ((C1427290nFH) akS60S0200000_22.l1).LLJJJIL;
        if (c1427320nFK != null && (c1749260vca = c1427320nFK.LLILLJJLI) != null && (editTextView = c1749260vca.getEditTextView()) != null) {
            editTextView.setCursorVisible(true);
            editTextView.setFocusable(true);
            editTextView.setFocusableInTouchMode(true);
            editTextView.requestFocus();
        }
    }

    public static final void LIZ$1(AkS60S0200000_22 akS60S0200000_22, View view) {
        C0CHQ.LIZ().LIZ().LIZLLL(new AwS601S0100000_22((FTCChooseCoverFragment) akS60S0200000_22.l1, 95), !C1447200nlO.LIZ(((VideoPublishEditModel) akS60S0200000_22.l0).getVideoCoverStartTm(), ((FTCChooseCoverFragment) akS60S0200000_22.l1).LLJILJILJ / 1000.0f));
    }

    public static final void LIZ$2(AkS60S0200000_22 akS60S0200000_22, View view) {
        C1460640o74 c1460640o74 = (C1460640o74) akS60S0200000_22.l0;
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(((CharSequence) akS60S0200000_22.l1).toString());
        creativeToastBuilder.duration(3000L);
        C1390380mHk.LIZLLL(c1460640o74, 1037, creativeToastBuilder);
    }

    public static final void LIZ$3(AkS60S0200000_22 akS60S0200000_22, View view) {
        ChooseCoverActivity chooseCoverActivity = (ChooseCoverActivity) ((VEChooseVideoCoverFragment) akS60S0200000_22.l1).getActivity();
        if (chooseCoverActivity != null) {
            chooseCoverActivity.LLZZ(false);
        }
        if (C1443400nfG.LJIIIIZZ((VideoPublishEditModel) akS60S0200000_22.l0) != null) {
            C1443400nfG.LJIIIIZZ((VideoPublishEditModel) akS60S0200000_22.l0).isCoverUpload = 1;
        }
        C1443990ngD c1443990ngD = C1443990ngD.LIZ;
        VideoPublishEditModel videoPublishEditModelLJI = ((VEChooseVideoCoverFragment) akS60S0200000_22.l1).LLJLL.LJI();
        String str = ((VEChooseVideoCoverFragment) akS60S0200000_22.l1).LLLII;
        c1443990ngD.getClass();
        C1443990ngD.LJI(videoPublishEditModelLJI, str, "upload");
        VEChooseVideoCoverFragment vEChooseVideoCoverFragment = (VEChooseVideoCoverFragment) akS60S0200000_22.l1;
        vEChooseVideoCoverFragment.LLLII = "upload";
        vEChooseVideoCoverFragment.LLLIIIL = false;
    }

    public static final void LIZ$4(AkS60S0200000_22 akS60S0200000_22, View view) {
        VEChooseVideoCoverFragment vEChooseVideoCoverFragment = (VEChooseVideoCoverFragment) akS60S0200000_22.l1;
        C786410Ut5.LL(0, vEChooseVideoCoverFragment.LLILZ);
        C786410Ut5.LJZ(8, vEChooseVideoCoverFragment.LLIZ);
        vEChooseVideoCoverFragment.dS();
        vEChooseVideoCoverFragment.bS();
        ChooseCoverActivity chooseCoverActivity = (ChooseCoverActivity) vEChooseVideoCoverFragment.getActivity();
        if (chooseCoverActivity != null) {
            chooseCoverActivity.LLJJIII = "";
            if (C1447250nlT.LIZ()) {
                chooseCoverActivity.LLJJIII = "fake_path_for_screen_34";
            }
            chooseCoverActivity.LLJJIJIIJIL = null;
            chooseCoverActivity.LLJJIJI = null;
        }
        C1443990ngD c1443990ngD = C1443990ngD.LIZ;
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) akS60S0200000_22.l0;
        c1443990ngD.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("enter_from", "edit_cover_page");
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        C20684815ws.LJIILLIIL("remove_upload_cover", c0lab.LIZ);
        if (C1443400nfG.LJIIIIZZ((VideoPublishEditModel) akS60S0200000_22.l0) != null) {
            C1443400nfG.LJIIIIZZ((VideoPublishEditModel) akS60S0200000_22.l0).isCoverUpload = 0;
        }
        CoverPublishModel coverPublishModel = ((VideoPublishEditModel) akS60S0200000_22.l0).getCoverPublishModel();
        if (coverPublishModel != null) {
            coverPublishModel.setCoverFromUrl(false);
        }
        VEChooseVideoCoverFragment vEChooseVideoCoverFragment2 = (VEChooseVideoCoverFragment) akS60S0200000_22.l1;
        vEChooseVideoCoverFragment2.LLLII = "by_default";
        ChooseCoverActivity chooseCoverActivity2 = (ChooseCoverActivity) vEChooseVideoCoverFragment2.getActivity();
        if (chooseCoverActivity2 != null) {
            chooseCoverActivity2.LLJJJJJIL = null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AkS60S0200000_22(C1460640o74 c1460640o74, CharSequence charSequence, int i) {
        super(600L);
        this.$t = i;
        this.l0 = c1460640o74;
        this.l1 = charSequence;
    }

    public AkS60S0200000_22(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
