package kotlin.jvm.internal;

import X.AbstractC489590JHx;
import X.C09AY;
import X.C1159310gH3;
import X.C19677511yn;
import X.C2173691A5f;
import X.C339190DRl;
import X.EnumC742830TBx;
import Y.ARunnableS133S0100000_33;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.commercialize.model.FollowButtonData;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.album.AlbumPreviewFragment;
import com.ss.android.ugc.aweme.feed.assem.relationbtn.VideoRelationBtnAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes34.dex */
public class AwS119S0110000_33 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS119S0110000_33 awS119S0110000_33, Object obj) {
        int iIntValue;
        AwemeRawAd awemeRawAd;
        FollowButtonData followButtonData;
        Integer num;
        C1159310gH3 c1159310gH3 = (C1159310gH3) obj;
        if (Intrinsics.LJFF(((VideoRelationBtnAssem) awS119S0110000_33.l0).Gp().LL, EnumC742830TBx.AD.getValue()) && c1159310gH3.LL.LIZ.booleanValue()) {
            if (awS119S0110000_33.z1) {
                Aweme aweme = ((VideoRelationBtnAssem) awS119S0110000_33.l0).LLL;
                if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (followButtonData = awemeRawAd.getFollowButtonData()) != null && (num = followButtonData.showSeconds) != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 2;
                }
                int i = iIntValue * LSPassThroughRecordSizeConfig.DEFAULT;
                VideoRelationBtnAssem videoRelationBtnAssem = (VideoRelationBtnAssem) awS119S0110000_33.l0;
                videoRelationBtnAssem.LLLIIL = new ARunnableS133S0100000_33(videoRelationBtnAssem, 52);
                View view = videoRelationBtnAssem.LLJLLIL;
                if (view != null) {
                    HandlerHook.viewPostDelay(view, videoRelationBtnAssem.LLLIIL, i);
                }
            } else {
                VideoRelationBtnAssem videoRelationBtnAssem2 = (VideoRelationBtnAssem) awS119S0110000_33.l0;
                ARunnableS133S0100000_33 aRunnableS133S0100000_33 = new ARunnableS133S0100000_33(videoRelationBtnAssem2, 53);
                ARunnableS133S0100000_33 aRunnableS133S0100000_332 = videoRelationBtnAssem2.LLLIIL;
                if (aRunnableS133S0100000_332 != null) {
                    View view2 = videoRelationBtnAssem2.LLJLLIL;
                    if (view2 != null) {
                        HandlerHook.viewRemoveCallbacks(view2, aRunnableS133S0100000_332);
                    }
                    videoRelationBtnAssem2.LLLIIL = null;
                }
                View view3 = ((VideoRelationBtnAssem) awS119S0110000_33.l0).LLJLLIL;
                if (view3 != null) {
                    HandlerHook.viewPost(view3, aRunnableS133S0100000_33);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS119S0110000_33 awS119S0110000_33, Object obj) {
        return C2173691A5f.LIZ((C2173691A5f) obj, null, awS119S0110000_33.z1, (AbstractC489590JHx) awS119S0110000_33.l0, 0, 9);
    }

    public static final Object invoke$2(AwS119S0110000_33 awS119S0110000_33, Object obj) {
        AlbumPreviewFragment albumPreviewFragment;
        C19677511yn c19677511yn;
        if (awS119S0110000_33.z1 && (c19677511yn = (albumPreviewFragment = (AlbumPreviewFragment) awS119S0110000_33.l0).LLJJI) != null && c19677511yn.LLILZ) {
            c19677511yn.LLILZ = false;
            C339190DRl.LIZIZ(albumPreviewFragment.LLILZLL);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S0110000_33(AbstractC489590JHx abstractC489590JHx, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = abstractC489590JHx;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S0110000_33(AlbumPreviewFragment albumPreviewFragment, boolean z, int i) {
        super(1);
        this.$t = i;
        this.z1 = z;
        this.l0 = albumPreviewFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S0110000_33(VideoRelationBtnAssem videoRelationBtnAssem, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = videoRelationBtnAssem;
        this.z1 = z;
    }
}
