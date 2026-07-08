package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0H00;
import X.C0PEM;
import X.C12ES;
import X.C13LP;
import X.C1697810uHb;
import X.C1850970yGd;
import X.C1DFH;
import X.C2097608Jq;
import X.C2107308Nj;
import X.C23250099c;
import X.C376410EpL;
import X.C472401sg;
import X.C473501sr;
import X.C631370Opb;
import X.C643400PLm;
import X.C659520Ptu;
import X.C724270Sb3;
import X.C786410Ut5;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BigThumb;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.innerflowpage.SearchKeyFramePoint;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir1Assem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.protocols.bottomanchors.keyframe.SearchKeyframeOptDir2Assem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.ISearchVideoHolderAbility;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoKeyFrameViewModel;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.resultspage.MixStudioResultsBaseAssem;
import com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public class AwS166S0400000_6 extends C09AY implements Function2 {
    public final int $t;
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
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(kotlin.jvm.internal.AwS166S0400000_6 r11, java.lang.Object r12, java.lang.Object r13) {
        /*
            r7 = r12
            X.0tpg r7 = (X.InterfaceC1680500tpg) r7
            java.lang.Number r13 = (java.lang.Number) r13
            int r0 = r13.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r7.LIZ()
            if (r0 == 0) goto L1a
            r7.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            r0 = 2131838902(0x7f1147b6, float:1.931104E38)
            java.lang.String r8 = X.C0MBB.LIZIZ(r0, r7)
            r10 = 1
            r4 = -1746271574(0xffffffff97ea02aa, float:-1.5122568E-24)
            r7.LJJIIJZLJL(r4)
            java.lang.Object r0 = r11.l0
            com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment r0 = (com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment) r0
            boolean r5 = r7.LJII(r0)
            java.lang.Object r0 = r11.l1
            android.content.Context r0 = (android.content.Context) r0
            boolean r0 = r7.LJII(r0)
            r5 = r5 | r0
            java.lang.Object r0 = r11.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r7.LJJIIJ(r0)
            r5 = r5 | r0
            java.lang.Object r3 = r11.l0
            com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment r3 = (com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment) r3
            java.lang.Object r2 = r11.l1
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r11.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r9 = r7.LJJ()
            if (r5 != 0) goto L5d
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r9 != r0) goto L67
        L5d:
            kotlin.jvm.internal.AwS250S0300000_6 r9 = new kotlin.jvm.internal.AwS250S0300000_6
            r0 = 12
            r9.<init>(r3, r2, r1, r0)
            r7.LJJIJIIJI(r9)
        L67:
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r7.LJ()
            r5 = 48
            r6 = 0
            X.C1668330tW3.LJIIIZ(r5, r6, r7, r8, r9, r10)
            r0 = 2131848580(0x7f116d84, float:1.933067E38)
            java.lang.String r8 = X.C0MBB.LIZIZ(r0, r7)
            r7.LJJIIJZLJL(r4)
            java.lang.Object r0 = r11.l0
            com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment r0 = (com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment) r0
            boolean r4 = r7.LJII(r0)
            java.lang.Object r0 = r11.l3
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r7.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r0 = r11.l2
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            boolean r0 = r7.LJJIIJ(r0)
            r4 = r4 | r0
            java.lang.Object r3 = r11.l0
            com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment r3 = (com.ss.android.ugc.profile.business.ur.socialavatar.review.SocialAvatarReviewFragment) r3
            java.lang.Object r2 = r11.l3
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            java.lang.Object r1 = r11.l2
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1
            java.lang.Object r9 = r7.LJJ()
            if (r4 != 0) goto Lb1
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r9 != r0) goto Lbb
        Lb1:
            kotlin.jvm.internal.AwS250S0300000_6 r9 = new kotlin.jvm.internal.AwS250S0300000_6
            r0 = 13
            r9.<init>(r3, r2, r1, r0)
            r7.LJJIJIIJI(r9)
        Lbb:
            kotlin.jvm.functions.Function0 r9 = (kotlin.jvm.functions.Function0) r9
            r7.LJ()
            r5 = 48
            r6 = 0
            X.C1668330tW3.LJIIIZ(r5, r6, r7, r8, r9, r10)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS166S0400000_6.invoke$0(kotlin.jvm.internal.AwS166S0400000_6, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(kotlin.jvm.internal.AwS166S0400000_6 r12, java.lang.Object r13, java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS166S0400000_6.invoke$1(kotlin.jvm.internal.AwS166S0400000_6, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(AwS166S0400000_6 awS166S0400000_6, Object obj, Object obj2) {
        boolean z;
        Object obj3;
        SearchKeyframeOptDir1Assem searchKeyframeOptDir1Assem = (SearchKeyframeOptDir1Assem) obj;
        List list = (List) obj2;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            View view = (View) awS166S0400000_6.l0;
            searchKeyframeOptDir1Assem.getClass();
            C786410Ut5.LJLLLLLL(8, view);
            ISearchVideoHolderAbility iSearchVideoHolderAbility = (ISearchVideoHolderAbility) searchKeyframeOptDir1Assem.LLJLIL.getValue();
            if (iSearchVideoHolderAbility != null) {
                iSearchVideoHolderAbility.Ri1(null);
            }
        } else {
            View view2 = (View) awS166S0400000_6.l0;
            TuxIconView tuxIconView = (TuxIconView) awS166S0400000_6.l1;
            searchKeyframeOptDir1Assem.getClass();
            C12ES.LJIILL(0, view2);
            C12ES.LJIILL(0, tuxIconView);
            C376410EpL c376410EpL = (C376410EpL) awS166S0400000_6.l2;
            C376410EpL c376410EpL2 = (C376410EpL) awS166S0400000_6.l3;
            C724270Sb3 c724270Sb3 = searchKeyframeOptDir1Assem.LLJI;
            if (c724270Sb3 != null) {
                obj3 = c724270Sb3.LL;
            } else {
                obj3 = null;
            }
            Aweme aweme = ((C659520Ptu) obj3).LL;
            List<AppCompatImageView> listLJIIJJI = C1697810uHb.LJIIJJI(c376410EpL, c376410EpL2);
            for (AppCompatImageView appCompatImageView : listLJIIJJI) {
                C12ES.LJIILL(0, appCompatImageView);
                appCompatImageView.setImageDrawable(null);
            }
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(searchKeyframeOptDir1Assem);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C472401sg(searchKeyframeOptDir1Assem, aweme, list, listLJIIJJI, null), 2);
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(searchKeyframeOptDir1Assem), null, null, new C473501sr((View) awS166S0400000_6.l0, searchKeyframeOptDir1Assem, null), 3);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS166S0400000_6 awS166S0400000_6, Object obj, Object obj2) {
        Object objLJJJLL;
        List<BigThumb> bigThumbs;
        BigThumb bigThumb;
        List<String> list;
        View view = (View) obj;
        C643400PLm c643400PLm = (C643400PLm) obj2;
        if (Intrinsics.LJFF(view, (View) awS166S0400000_6.l0)) {
            SearchVideoKeyFrameViewModel searchVideoKeyFrameViewModelOp = ((SearchKeyframeOptDir2Assem) awS166S0400000_6.l1).op();
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("chapters_type", "2");
            pairArr[1] = new Pair("is_click_abbre", CardStruct.IStatusCode.DEFAULT);
            Video video = ((C659520Ptu) C631370Opb.LIZ((SearchKeyframeOptDir2Assem) awS166S0400000_6.l1)).LL.getVideo();
            Float fValueOf = null;
            if (video == null || (bigThumbs = video.getBigThumbs()) == null || (bigThumb = (BigThumb) C13LP.LJJJLL(bigThumbs)) == null || (list = bigThumb.imgUrls) == null || (objLJJJLL = C13LP.LJJJLL(list)) == null) {
                objLJJJLL = "";
            }
            pairArr[2] = new Pair("album_url", objLJJJLL);
            searchVideoKeyFrameViewModelOp.wQ2(view, C2097608Jq.LJIIIIZZ(pairArr));
            SearchKeyFramePoint searchKeyFramePoint = (SearchKeyFramePoint) awS166S0400000_6.l2;
            if (searchKeyFramePoint != null) {
                Integer numValueOf = Integer.valueOf(searchKeyFramePoint.secondStart);
                if (numValueOf.intValue() >= 0) {
                    Float f = (Float) awS166S0400000_6.l3;
                    int iIntValue = numValueOf.intValue();
                    if (f != null) {
                        fValueOf = Float.valueOf((iIntValue * 1000.0f) / f.floatValue());
                    }
                }
            }
            return C643400PLm.LIZ(c643400PLm, null, false, null, fValueOf, 229375);
        }
        return c643400PLm;
    }

    public static final Object invoke$4(AwS166S0400000_6 awS166S0400000_6, Object obj, Object obj2) {
        Map map = (Map) obj2;
        if (((Boolean) obj).booleanValue()) {
            List list = (List) awS166S0400000_6.l0;
            String str = (String) map.get("guide_math.png");
            String str2 = "";
            if (str == null) {
                str = "";
            }
            String string = ((C1850970yGd) awS166S0400000_6.l1).getContext().getString(2131849669);
            String str3 = (String) map.get("guide_avatar.png");
            if (str3 == null) {
                str3 = "";
            }
            C0H00 c0h00 = new C0H00(str, string, str3);
            ((C013C) awS166S0400000_6.l3).element = c0h00.LIZ();
            list.add(c0h00);
            List list2 = (List) awS166S0400000_6.l0;
            String str4 = (String) map.get("guide_scenery.png");
            if (str4 == null) {
                str4 = "";
            }
            String string2 = ((C1850970yGd) awS166S0400000_6.l1).getContext().getString(2131849670);
            String str5 = (String) map.get("guide_avatar.png");
            if (str5 == null) {
                str5 = "";
            }
            C0H00 c0h002 = new C0H00(str4, string2, str5);
            ((C013C) awS166S0400000_6.l3).element = c0h002.LIZ();
            list2.add(c0h002);
            List list3 = (List) awS166S0400000_6.l0;
            String str6 = (String) map.get("guide_meal.png");
            if (str6 == null) {
                str6 = "";
            }
            String string3 = ((C1850970yGd) awS166S0400000_6.l1).getContext().getString(2131849671);
            String str7 = (String) map.get("guide_avatar.png");
            if (str7 != null) {
                str2 = str7;
            }
            C0H00 c0h003 = new C0H00(str6, string3, str2);
            ((C013C) awS166S0400000_6.l3).element = c0h003.LIZ();
            list3.add(c0h003);
            ((Function2) awS166S0400000_6.l2).invoke((List) awS166S0400000_6.l0, Boolean.valueOf(((C013C) awS166S0400000_6.l3).element));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS166S0400000_6(Context context, Fragment fragment, MixStudioResultsBaseAssem mixStudioResultsBaseAssem, Function0 function0, int i) {
        super(2);
        this.$t = i;
        this.l0 = mixStudioResultsBaseAssem;
        this.l1 = fragment;
        this.l2 = context;
        this.l3 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS166S0400000_6(View view, TuxIconView tuxIconView, C376410EpL c376410EpL, C376410EpL c376410EpL2, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = tuxIconView;
        this.l2 = c376410EpL;
        this.l3 = c376410EpL2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS166S0400000_6(View view, SearchKeyframeOptDir2Assem searchKeyframeOptDir2Assem, SearchKeyFramePoint searchKeyFramePoint, Float f, int i) {
        super(2);
        this.$t = i;
        this.l0 = view;
        this.l1 = searchKeyframeOptDir2Assem;
        this.l2 = searchKeyFramePoint;
        this.l3 = f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS166S0400000_6(SocialAvatarReviewFragment socialAvatarReviewFragment, SocialAvatarReviewFragment socialAvatarReviewFragment2, Context context, Function0<Unit> function0, Function0<Unit> function02) {
        super(2);
        this.$t = function02;
        this.l0 = socialAvatarReviewFragment;
        this.l1 = socialAvatarReviewFragment2;
        this.l2 = context;
        this.l3 = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS166S0400000_6(List list, C1850970yGd c1850970yGd, AwS284S0300000_6 awS284S0300000_6, C013C c013c, int i) {
        super(2);
        this.$t = i;
        this.l0 = list;
        this.l1 = c1850970yGd;
        this.l2 = awS284S0300000_6;
        this.l3 = c013c;
    }
}
