package kotlin.jvm.internal;

import X.C09AY;
import X.C0HLS;
import X.C0HM5;
import X.C13LP;
import X.C1666000tSI;
import X.C2097608Jq;
import X.C341440Da2;
import X.C434820H3g;
import X.C439710HMb;
import X.C631370Opb;
import X.C643400PLm;
import X.C659520Ptu;
import X.InterfaceC1680500tpg;
import X.InterfaceC1680820tqC;
import X.InterfaceC1685750ty9;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.BigThumb;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir3PanelAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoKeyFrameViewModel;
import com.ss.android.ugc.aweme.socialavatar.viewmodel.v2.SocialAvatarCreationViewModelV2;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public class AwS25S0401000_6 extends C09AY implements Function2 {
    public final int $t;
    public int i4;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS25S0401000_6 awS25S0401000_6, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C1666000tSI.LIZ((InterfaceC1685750ty9) awS25S0401000_6.l0, (Function0) awS25S0401000_6.l1, (C0HM5) awS25S0401000_6.l2, (SocialAvatarCreationViewModelV2) awS25S0401000_6.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS25S0401000_6.i4 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS25S0401000_6 awS25S0401000_6, Object obj, Object obj2) {
        ((Number) obj2).intValue();
        C439710HMb.LIZ((InterfaceC1680820tqC) awS25S0401000_6.l0, (C0HLS) awS25S0401000_6.l1, (Function0) awS25S0401000_6.l2, (Function0) awS25S0401000_6.l3, (InterfaceC1680500tpg) obj, C341440Da2.LIZ(awS25S0401000_6.i4 | 1));
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS25S0401000_6 awS25S0401000_6, Object obj, Object obj2) {
        Object objLJJJLL;
        List<BigThumb> bigThumbs;
        BigThumb bigThumb;
        List<String> list;
        C643400PLm c643400PLm = (C643400PLm) obj2;
        if (Intrinsics.LJFF(obj, (View) awS25S0401000_6.l0)) {
            SearchVideoKeyFrameViewModel searchVideoKeyFrameViewModelOp = ((SearchKeyframeOptDir3PanelAssem) awS25S0401000_6.l1).op();
            View view = (View) awS25S0401000_6.l0;
            Pair[] pairArr = new Pair[4];
            boolean z = false;
            pairArr[0] = new Pair("chapters_type", "3");
            pairArr[1] = new Pair("click_chapter_rank", String.valueOf(awS25S0401000_6.i4));
            pairArr[2] = new Pair("click_chapter_title", ((C434820H3g) awS25S0401000_6.l2).LIZ.title);
            Video video = ((C659520Ptu) C631370Opb.LIZ((SearchKeyframeOptDir3PanelAssem) awS25S0401000_6.l1)).LL.getVideo();
            Float fValueOf = null;
            if (video == null || (bigThumbs = video.getBigThumbs()) == null || (bigThumb = (BigThumb) C13LP.LJJJLL(bigThumbs)) == null || (list = bigThumb.imgUrls) == null || (objLJJJLL = C13LP.LJJJLL(list)) == null) {
                objLJJJLL = "";
            }
            pairArr[3] = new Pair("click_chapter_url", objLJJJLL);
            searchVideoKeyFrameViewModelOp.xQ2("enter", view, C2097608Jq.LJIIIIZZ(pairArr));
            Integer numValueOf = Integer.valueOf(((C434820H3g) awS25S0401000_6.l2).LIZ.secondStart);
            if (numValueOf.intValue() >= 0) {
                z = true;
            }
            if (Boolean.valueOf(z).booleanValue()) {
                Float f = (Float) awS25S0401000_6.l3;
                int iIntValue = numValueOf.intValue();
                if (f != null) {
                    fValueOf = Float.valueOf((iIntValue * 1000.0f) / f.floatValue());
                }
            }
            return C643400PLm.LIZ(c643400PLm, null, false, null, fValueOf, 229375);
        }
        return c643400PLm;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS25S0401000_6(InterfaceC1680820tqC interfaceC1680820tqC, InterfaceC1680820tqC interfaceC1680820tqC2, C0HLS c0hls, Function0<Unit> function0, Function0<Unit> function02, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC1680820tqC;
        this.l1 = interfaceC1680820tqC2;
        this.l2 = c0hls;
        this.l3 = function0;
        this.i4 = function02;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS25S0401000_6(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1685750ty9 interfaceC1685750ty92, Function0<Unit> function0, C0HM5 c0hm5, SocialAvatarCreationViewModelV2 socialAvatarCreationViewModelV2, int i) {
        super(2);
        this.$t = i;
        this.l0 = interfaceC1685750ty9;
        this.l1 = interfaceC1685750ty92;
        this.l2 = function0;
        this.l3 = c0hm5;
        this.i4 = socialAvatarCreationViewModelV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS25S0401000_6(View view, SearchKeyframeOptDir3PanelAssem searchKeyframeOptDir3PanelAssem, int i, C434820H3g c434820H3g, Float f, int i2) {
        super(2);
        this.$t = i2;
        this.l0 = view;
        this.l1 = searchKeyframeOptDir3PanelAssem;
        this.i4 = i;
        this.l2 = c434820H3g;
        this.l3 = f;
    }
}
