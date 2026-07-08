package kotlin.jvm.internal;

import X.C09AY;
import X.C0S9P;
import X.C0SCF;
import X.C0SH2;
import X.C0SLX;
import X.C0SM6;
import X.C0SPN;
import X.C118300cf;
import X.C13LP;
import X.C1434900nRY;
import X.C1697810uHb;
import X.C692820RFo;
import X.C716710S9l;
import X.C724270Sb3;
import X.C727300Sfw;
import X.C727310Sfx;
import X.EnumC311340CIi;
import X.InterfaceC1008930cMV;
import X.InterfaceC469401sC;
import Y.ARunnableS22S0101000_11;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryGalleryListViewModel;
import com.ss.android.ugc.aweme.story.publish.SocialPublishCallback;
import com.ss.android.ugc.aweme.ui.feed.commerce.PhotoAdCarouselComponent;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import com.ss.android.ugc.aweme.ui.feed.photos.assem.PhotoSwipeHintAssem;
import com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.FeedCommonBannerProtocol;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public class AwS119S0101000_11 extends C09AY implements Function1 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS119S0101000_11 awS119S0101000_11, Object obj) {
        Boolean bool = (Boolean) awS119S0101000_11.l0;
        int i = awS119S0101000_11.i1;
        obj.getClass();
        return new C692820RFo(bool, i);
    }

    public static final Object invoke$1(AwS119S0101000_11 awS119S0101000_11, Object obj) {
        Object obj2;
        InterfaceC1008930cMV interfaceC1008930cMVKp;
        C0SM6 c0sm6LJJI;
        C0S9P c0s9p = (C0S9P) obj;
        C0SCF c0scf = ((PhotoAdCarouselComponent) awS119S0101000_11.l0).LLJLLL;
        if (c0scf != null) {
            c0scf.Uy1(awS119S0101000_11.i1, c0s9p.LLILZIL);
        }
        InterfaceC1008930cMV interfaceC1008930cMVKp2 = ((PhotoAdCarouselComponent) awS119S0101000_11.l0).kp();
        if (interfaceC1008930cMVKp2 != null && (c0sm6LJJI = interfaceC1008930cMVKp2.LJJI()) != null) {
            c0sm6LJJI.LJ(awS119S0101000_11.i1);
        }
        PhotoAdCarouselComponent photoAdCarouselComponent = (PhotoAdCarouselComponent) awS119S0101000_11.l0;
        int i = awS119S0101000_11.i1;
        C724270Sb3 c724270Sb3 = photoAdCarouselComponent.LLJI;
        if (c724270Sb3 != null) {
            obj2 = c724270Sb3.LL;
        } else {
            obj2 = null;
        }
        if (AwemeExtKt.isAdTraffic(((VideoItemParams) obj2).getAweme()) && (interfaceC1008930cMVKp = photoAdCarouselComponent.kp()) != null) {
            interfaceC1008930cMVKp.LJJIJL(i);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$2(AwS119S0101000_11 awS119S0101000_11, Object obj) {
        if (((C0SPN) awS119S0101000_11.l0).LIZ.contains(Integer.valueOf(awS119S0101000_11.i1))) {
            List<InterfaceC469401sC> list = ((C0SPN) awS119S0101000_11.l0).LIZ.get(Integer.valueOf(awS119S0101000_11.i1));
            if (list != null) {
                list.add(obj);
            }
        } else {
            ((C0SPN) awS119S0101000_11.l0).LIZ.put(Integer.valueOf(awS119S0101000_11.i1), C1697810uHb.LJIILJJIL(obj));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS119S0101000_11 awS119S0101000_11, Object obj) {
        FeedContentLayoutInfo feedContentLayoutInfo = (FeedContentLayoutInfo) obj;
        int i = awS119S0101000_11.i1 - ((C118300cf) awS119S0101000_11.l0).element;
        FeedContentLayoutInfo feedContentLayoutInfo2 = feedContentLayoutInfo.initLayoutInfo;
        if (feedContentLayoutInfo2 == null) {
            feedContentLayoutInfo2 = feedContentLayoutInfo;
        }
        return FeedContentLayoutInfo.LIZ(feedContentLayoutInfo, i, 0, feedContentLayoutInfo2, 3069);
    }

    public static final Object invoke$4(AwS119S0101000_11 awS119S0101000_11, Object obj) {
        String str;
        C0SH2 c0sh2LJI = ((FeedCommonBannerProtocol) awS119S0101000_11.l0).LJI();
        if (c0sh2LJI != null) {
            int i = awS119S0101000_11.i1;
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            c0sh2LJI.LIZ(i, str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS119S0101000_11 awS119S0101000_11, Object obj) {
        String str;
        C0SH2 c0sh2LJI = ((FeedCommonBannerProtocol) awS119S0101000_11.l0).LJI();
        int i = awS119S0101000_11.i1;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        c0sh2LJI.LIZ(i, str);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS119S0101000_11 awS119S0101000_11, Object obj) {
        Aweme aweme;
        C727300Sfw c727300Sfw = (C727300Sfw) obj;
        StoryGalleryListViewModel storyGalleryListViewModel = (StoryGalleryListViewModel) awS119S0101000_11.l0;
        int i = awS119S0101000_11.i1;
        C727310Sfx c727310Sfx = (C727310Sfx) C13LP.LJJJLZIJ(i, c727300Sfw.LL);
        if (c727310Sfx != null) {
            aweme = c727310Sfx.LL;
        } else {
            aweme = null;
        }
        C727300Sfw c727300SfwLIZ = C727300Sfw.LIZ(c727300Sfw, null, i, aweme, null, null, 25);
        storyGalleryListViewModel.vQ2(c727300SfwLIZ);
        return c727300SfwLIZ;
    }

    public static final Object invoke$7(AwS119S0101000_11 awS119S0101000_11, Object obj) {
        ((SocialPublishCallback) obj).onPublishProgress(awS119S0101000_11.i1, (C1434900nRY) awS119S0101000_11.l0);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AwS119S0101000_11 awS119S0101000_11, Object obj) {
        if (obj instanceof CancellationException) {
            C716710S9l c716710S9l = ((PhotoSwipeHintAssem) awS119S0101000_11.l0).LLJL;
            if (c716710S9l != null) {
                c716710S9l.abortAnimation();
            }
            PhotoSwipeHintAssem photoSwipeHintAssem = (PhotoSwipeHintAssem) awS119S0101000_11.l0;
            C0SLX c0slx = photoSwipeHintAssem.LLJJL;
            if (c0slx != null) {
                HandlerHook.viewPostDelay(c0slx, new ARunnableS22S0101000_11(awS119S0101000_11.i1, photoSwipeHintAssem, 9), 100L);
            }
        }
        PhotoViewModelV2 photoViewModelV2Ep = ((PhotoSwipeHintAssem) awS119S0101000_11.l0).ep();
        photoViewModelV2Ep.getClass();
        photoViewModelV2Ep.setState(AFwS243S0000000_11.get$arr$(819));
        C716710S9l c716710S9l2 = ((PhotoSwipeHintAssem) awS119S0101000_11.l0).LLJL;
        if (c716710S9l2 != null) {
            c716710S9l2.LIZJ = EnumC311340CIi.IDLE;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S0101000_11(int i, C118300cf c118300cf, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c118300cf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S0101000_11(int i, C1434900nRY c1434900nRY, int i2) {
        super(1);
        this.$t = i2;
        this.i1 = i;
        this.l0 = c1434900nRY;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S0101000_11(C0SPN c0spn, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = c0spn;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S0101000_11(StoryGalleryListViewModel storyGalleryListViewModel, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = storyGalleryListViewModel;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S0101000_11(PhotoAdCarouselComponent photoAdCarouselComponent, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = photoAdCarouselComponent;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S0101000_11(PhotoSwipeHintAssem photoSwipeHintAssem, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = photoSwipeHintAssem;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S0101000_11(FeedCommonBannerProtocol feedCommonBannerProtocol, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = feedCommonBannerProtocol;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS119S0101000_11(Boolean bool, int i, int i2) {
        super(1);
        this.$t = i2;
        this.l0 = bool;
        this.i1 = i;
    }
}
