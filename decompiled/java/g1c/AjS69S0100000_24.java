package g1c;

import X.AbstractC848400XPy;
import X.AbstractViewOnClickListenerC420730Ged;
import X.C0XPD;
import X.C0XQ7;
import X.C1581170rFT;
import X.C1620940sHc;
import X.C1743890vTv;
import X.C1743900vTw;
import X.C1910890zpH;
import X.C19EG;
import X.C2097608Jq;
import X.C724240Sb0;
import X.C734140Sqy;
import X.C844470XAv;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.ECLivePlayBackFragment;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.ECLivePlaybackViewModel;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.assem.ECLivePlaybackAuthorAssem;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.assem.ECLivePlaybackLiveButtonAssem;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.playback.assem.ECLivePlaybackPageStateAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.cell.SchoolPostCell;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS425S0200000_24;
import kotlin.jvm.internal.AwS568S0100000_24;
import org.json.JSONException;

/* JADX INFO: loaded from: classes25.dex */
public class AjS69S0100000_24 extends AbstractViewOnClickListenerC420730Ged {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC420730Ged
    public final void LIZ(View view) throws JSONException {
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
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AjS69S0100000_24(Object obj, int i) {
        super(700L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AjS69S0100000_24 ajS69S0100000_24, View view) {
        Aweme aweme;
        if (view != null) {
            ((SchoolPostCell) ajS69S0100000_24.l0).V5().LIZ("SchoolPostCell", "clicked digg");
            SchoolPostCell schoolPostCell = (SchoolPostCell) ajS69S0100000_24.l0;
            C734140Sqy c734140Sqy = schoolPostCell.LLJILJILJ;
            if (c734140Sqy != null) {
                C1581170rFT item = schoolPostCell.getItem();
                Integer numValueOf = null;
                if (item != null) {
                    aweme = item.LL;
                } else {
                    aweme = null;
                }
                C1581170rFT item2 = ((SchoolPostCell) ajS69S0100000_24.l0).getItem();
                if (item2 != null) {
                    numValueOf = Integer.valueOf(item2.LLILZ);
                }
                if (c734140Sqy.LJ) {
                    ((C1910890zpH) c734140Sqy.LJIIIZ.getValue()).LIZ("SchoolPostCell", "toggleDigg, is digging, stopped");
                } else {
                    c734140Sqy.LIZIZ(aweme, numValueOf);
                }
            }
        }
    }

    public static final void LIZ$1(AjS69S0100000_24 ajS69S0100000_24, View view) {
        if (view != null) {
            ((SchoolPostCell) ajS69S0100000_24.l0).P5("click_card_name");
        }
    }

    public static final void LIZ$2(AjS69S0100000_24 ajS69S0100000_24, View view) {
        if (view != null) {
            ((SchoolPostCell) ajS69S0100000_24.l0).P5("click_card_head");
        }
    }

    public static final void LIZ$3(AjS69S0100000_24 ajS69S0100000_24, View view) {
        if (view != null) {
            ((SchoolPostCell) ajS69S0100000_24.l0).P5("click_card_head");
        }
    }

    public static final void LIZ$4(AjS69S0100000_24 ajS69S0100000_24, View view) {
        if (view != null) {
            ((ECLivePlayBackFragment) ajS69S0100000_24.l0).UR(1004, C2097608Jq.LJIIIIZZ(new Pair("click_area", "close"), new Pair("click_type", "click")));
        }
    }

    public static final void LIZ$5(AjS69S0100000_24 ajS69S0100000_24, View view) {
        Map<String, Object> mapLJ;
        if (view != null) {
            C1743890vTv c1743890vTv = C1743890vTv.LIZ;
            C1743900vTw c1743900vTw = ((ECLivePlayBackFragment) ajS69S0100000_24.l0).VR().LLILLJJLI;
            if (c1743900vTw != null) {
                mapLJ = c1743900vTw.LJ();
            } else {
                mapLJ = C2097608Jq.LJ();
            }
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("click_area", "other_area"), new Pair("click_type", "click"));
            ConstraintLayout constraintLayout = ((ECLivePlayBackFragment) ajS69S0100000_24.l0).LLIZLLLIL;
            c1743890vTv.getClass();
            C1743890vTv.LIZIZ(1005, mapLJ, mapLJIIIIZZ, constraintLayout);
        }
    }

    public static final void LIZ$6(AjS69S0100000_24 ajS69S0100000_24, View view) throws JSONException {
        if (view != null) {
            C1743890vTv c1743890vTv = C1743890vTv.LIZ;
            C19EG c19egLIZ = C724240Sb0.LIZ((ECLivePlaybackAuthorAssem) ajS69S0100000_24.l0);
            AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24((ECLivePlaybackAuthorAssem) ajS69S0100000_24.l0, 1795);
            c1743890vTv.getClass();
            if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                C0XPD.LIZIZ(c19egLIZ, "video_playback", "video_playback_follow_btn", null, new C1620940sHc(awS568S0100000_24, 3));
            } else {
                awS568S0100000_24.invoke();
            }
        }
    }

    public static final void LIZ$7(AjS69S0100000_24 ajS69S0100000_24, View view) {
        if (view != null) {
            C1743890vTv c1743890vTv = C1743890vTv.LIZ;
            C19EG c19egLIZ = C724240Sb0.LIZ((ECLivePlaybackLiveButtonAssem) ajS69S0100000_24.l0);
            AwS425S0200000_24 awS425S0200000_24 = new AwS425S0200000_24((ECLivePlaybackLiveButtonAssem) ajS69S0100000_24.l0, view, 82);
            c1743890vTv.getClass();
            if (!((AbstractC848400XPy) C0XQ7.LJFF()).isLogin()) {
                C0XPD.LIZIZ(c19egLIZ, "video_playback", "video_playback_live_btn", null, new C1620940sHc(awS425S0200000_24, 3));
            } else {
                awS425S0200000_24.invoke();
            }
        }
    }

    public static final void LIZ$8(AjS69S0100000_24 ajS69S0100000_24, View view) {
        Map<String, Object> mapLJ;
        if (view != null) {
            C19EG c19egLIZ = C724240Sb0.LIZ((ECLivePlaybackPageStateAssem) ajS69S0100000_24.l0);
            if (c19egLIZ != null) {
                c19egLIZ.finish();
            }
            C1743890vTv c1743890vTv = C1743890vTv.LIZ;
            C1743900vTw c1743900vTw = ((ECLivePlaybackPageStateAssem) ajS69S0100000_24.l0).Go().LLILLJJLI;
            if (c1743900vTw != null) {
                mapLJ = c1743900vTw.LJ();
            } else {
                mapLJ = C2097608Jq.LJ();
            }
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("click_area", "close"), new Pair("click_type", "click"));
            View viewLJJIJL = ((ECLivePlaybackPageStateAssem) ajS69S0100000_24.l0).LJJIJL();
            c1743890vTv.getClass();
            C1743890vTv.LIZIZ(1004, mapLJ, mapLJIIIIZZ, viewLJJIJL);
        }
    }

    public static final void LIZ$9(AjS69S0100000_24 ajS69S0100000_24, View view) {
        if (view != null) {
            ECLivePlaybackViewModel eCLivePlaybackViewModelGo = ((ECLivePlaybackPageStateAssem) ajS69S0100000_24.l0).Go();
            C844470XAv.LIZ.getClass();
            eCLivePlaybackViewModelGo.vQ2(C844470XAv.LIZ());
        }
    }
}
