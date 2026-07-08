package kotlin.jvm.internal;

import X.AbstractC1622310sJp;
import X.C07Q4;
import X.C09AY;
import X.C09I6;
import X.C09I9;
import X.C1076010e6h;
import X.C1308910kAL;
import X.C1322110kVd;
import X.C13LP;
import X.C1443990ngD;
import X.C15O7;
import X.C1857690yRT;
import X.C2188811AlT;
import X.C2443809hs;
import X.C2444809i2;
import X.C2446709iL;
import X.C2448609ie;
import X.C2449709ip;
import X.C2449809iq;
import X.C2450909j1;
import X.C291001Au;
import X.C565950MHp;
import X.C698780Rb2;
import X.C699340Rbw;
import Y.ACallableS47S0210000_8;
import Y.ARunnableS72S0200000_3;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.feed.hvr.FollowingHvrLabelInFypVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.suggestfollowing.ProfileFollowingSuggestViewModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.config.PlaceholderInfoModel;
import com.ss.android.ugc.aweme.tako.botpage.components.disclaimer.ui.TakoDisclaimerWithTosFragment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes4.dex */
public class AwS439S0200000_3 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            default:
                return null;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS439S0200000_3(com.ss.android.ugc.aweme.feed.model.VideoItemParams r3, X.C2449809iq r4, int r5) {
        /*
            r2 = this;
            r2.$t = r5
            int r5 = 4 - r5
            if (r5 == 0) goto L10
            r1 = r2
            r1.l0 = r4
            r1.l1 = r3
            r0 = 2
        Lc:
            r1.<init>(r0)
            return
        L10:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r0 = 2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS439S0200000_3.<init>(com.ss.android.ugc.aweme.feed.model.VideoItemParams, X.09iq, int):void");
    }

    public static final Object invoke$0(AwS439S0200000_3 awS439S0200000_3, Object obj, Object obj2) {
        Integer numLIZ;
        Integer numLIZ2;
        PlaceholderInfoModel placeholderInfoModel = (PlaceholderInfoModel) obj;
        CharSequence charSequence = (CharSequence) obj2;
        TakoDisclaimerWithTosFragment takoDisclaimerWithTosFragment = (TakoDisclaimerWithTosFragment) awS439S0200000_3.l0;
        Map map = (Map) awS439S0200000_3.l1;
        takoDisclaimerWithTosFragment.getClass();
        int iIntValue = 0;
        int iLJJJ = a0.LJJJ(charSequence, placeholderInfoModel.transValue, 0, false, 6);
        if (C07Q4.LIZ()) {
            SpannableString spannableString = new SpannableString(charSequence);
            int length = iLJJJ + placeholderInfoModel.transValue.length();
            Context context = takoDisclaimerWithTosFragment.getContext();
            if (context != null && (numLIZ2 = C1308910kAL.LIZ(R.attr.a1n, context)) != null) {
                iIntValue = numLIZ2.intValue();
            }
            C1857690yRT.LIZJ(spannableString, iLJJJ, length, Integer.valueOf(iIntValue), takoDisclaimerWithTosFragment.LLILLL.getTypeface(), new AwS212S0300000_3(takoDisclaimerWithTosFragment, (TakoDisclaimerWithTosFragment) placeholderInfoModel, (PlaceholderInfoModel) map, (Map<String, String>) 2));
            return spannableString;
        }
        SpannableString spannableString2 = new SpannableString(charSequence);
        int length2 = iLJJJ + placeholderInfoModel.transValue.length();
        Context context2 = takoDisclaimerWithTosFragment.getContext();
        if (context2 != null && (numLIZ = C1308910kAL.LIZ(R.attr.a1n, context2)) != null) {
            iIntValue = numLIZ.intValue();
        }
        C1857690yRT.LJ(spannableString2, iLJJJ, length2, Integer.valueOf(iIntValue), takoDisclaimerWithTosFragment.LLILLL.getTypeface(), new AwS247S0300000_3(takoDisclaimerWithTosFragment, (TakoDisclaimerWithTosFragment) placeholderInfoModel, (PlaceholderInfoModel) map, (Map<String, String>) 0));
        return spannableString2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$1(AwS439S0200000_3 awS439S0200000_3, Object obj, Object obj2) {
        if (C09I9.LIZ[((C09I6) obj).ordinal()] == 2 && obj2 != null) {
            DiyPropParser.LJIILJJIL((AbstractC1622310sJp) awS439S0200000_3.l0, (Effect) awS439S0200000_3.l1, new Bitmap[]{obj2}, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS439S0200000_3 awS439S0200000_3, Object obj, Object obj2) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindSlotStrategy prepared, generation=");
        sbLIZ.append(((C698780Rb2) awS439S0200000_3.l0).LIZIZ);
        sbLIZ.append(", boundRuleCount=");
        sbLIZ.append(((List) obj).size());
        sbLIZ.append(", boundSlotIds=");
        sbLIZ.append(C13LP.LLIIII(((C699340Rbw) awS439S0200000_3.l1).LJIILIIL));
        sbLIZ.append(", shouldRebindObservers=");
        sbLIZ.append(zBooleanValue);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS439S0200000_3 awS439S0200000_3, Object obj, Object obj2) {
        Bitmap bitmap = (Bitmap) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        if (bitmap != null) {
            C1443990ngD c1443990ngD = C1443990ngD.LIZ;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) awS439S0200000_3.l0;
            C1322110kVd c1322110kVd = (C1322110kVd) awS439S0200000_3.l1;
            c1443990ngD.getClass();
            if (!bitmap.isRecycled()) {
                c1322110kVd.setImageBitmap(bitmap);
                C565950MHp.LIZ(videoPublishEditModel);
            }
            C15O7.LIZJ(new ACallableS47S0210000_8(bitmap, (VideoPublishEditModel) awS439S0200000_3.l0, zBooleanValue, 0));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AwS439S0200000_3 awS439S0200000_3, Object obj, Object obj2) {
        String aid;
        C2444809i2 c2444809i2 = (C2444809i2) ((C291001Au) obj2).LIZ;
        String str = c2444809i2.LIZIZ;
        Aweme aweme = ((VideoItemParams) awS439S0200000_3.l0).getAweme();
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (TextUtils.equals(str, aid)) {
            ((C2449809iq) awS439S0200000_3.l1).LJI();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sensor receive showState ");
            sbLIZ.append(c2444809i2.LIZ);
            sbLIZ.append(" in sensor ");
            sbLIZ.append(obj.hashCode());
            C2188811AlT.LIZIZ(sbLIZ);
            if (c2444809i2.LIZ) {
                ((C2449809iq) awS439S0200000_3.l1).LJ(true);
                C2449809iq c2449809iq = (C2449809iq) awS439S0200000_3.l1;
                c2449809iq.getClass();
                C1076010e6h.LIZJ.LIZIZ().getRelationObservable().observe(c2449809iq, (Observer) c2449809iq.LLJILJILJ.getValue());
            } else {
                ((C2449809iq) awS439S0200000_3.l1).LJ(false);
            }
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$5(AwS439S0200000_3 awS439S0200000_3, Object obj, Object obj2) {
        View view;
        C2446709iL c2446709iL = (C2446709iL) ((C291001Au) obj2).LIZ;
        ProfileFollowingSuggestViewModel profileFollowingSuggestViewModelLJII = ((C2449809iq) awS439S0200000_3.l0).LJII();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sensor receive showState ");
        sbLIZ.append(c2446709iL.LIZ);
        sbLIZ.append(" in sensor ");
        sbLIZ.append(obj.hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        profileFollowingSuggestViewModelLJII.getClass();
        Fragment fragment = ((VideoItemParams) awS439S0200000_3.l1).fragment;
        if (fragment != null && (view = fragment.getView()) != null) {
            HandlerHook.viewPost(view, new ARunnableS72S0200000_3(c2446709iL, (C2449809iq) awS439S0200000_3.l0, 52));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$6(AwS439S0200000_3 awS439S0200000_3, Object obj, Object obj2) {
        String aid;
        C2443809hs c2443809hs = (C2443809hs) ((C291001Au) obj2).LIZ;
        String str = c2443809hs.LIZIZ;
        Aweme aweme = ((VideoItemParams) awS439S0200000_3.l0).getAweme();
        String aid2 = null;
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (TextUtils.equals(str, aid)) {
            boolean z = c2443809hs.LIZ;
            FollowingHvrLabelInFypVM followingHvrLabelInFypVMLJI = ((C2449709ip) awS439S0200000_3.l1).LJI();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sensor receive showState ");
            sbLIZ.append(z);
            sbLIZ.append(", aid ");
            Aweme aweme2 = ((VideoItemParams) awS439S0200000_3.l0).getAweme();
            if (aweme2 != null) {
                aid2 = aweme2.getAid();
            }
            sbLIZ.append(aid2);
            C2188811AlT.LIZIZ(sbLIZ);
            followingHvrLabelInFypVMLJI.getClass();
            C2450909j1.LIZIZ(new C2448609ie(z, (C2449709ip) awS439S0200000_3.l1));
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS439S0200000_3(C698780Rb2 c698780Rb2, C699340Rbw c699340Rbw, int i) {
        super(2);
        this.$t = i;
        this.l0 = c698780Rb2;
        this.l1 = c699340Rbw;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS439S0200000_3(C1322110kVd c1322110kVd, VideoPublishEditModel videoPublishEditModel, int i) {
        super(2);
        this.$t = i;
        this.l0 = videoPublishEditModel;
        this.l1 = c1322110kVd;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS439S0200000_3(AbstractC1622310sJp abstractC1622310sJp, Effect effect, int i) {
        super(2);
        this.$t = i;
        this.l0 = abstractC1622310sJp;
        this.l1 = effect;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS439S0200000_3(VideoItemParams videoItemParams, C2449709ip c2449709ip, int i) {
        super(2);
        this.$t = i;
        this.l0 = videoItemParams;
        this.l1 = c2449709ip;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS439S0200000_3(TakoDisclaimerWithTosFragment takoDisclaimerWithTosFragment, TakoDisclaimerWithTosFragment takoDisclaimerWithTosFragment2, Map<String, String> map) {
        super(2);
        this.$t = map;
        this.l0 = takoDisclaimerWithTosFragment;
        this.l1 = takoDisclaimerWithTosFragment2;
    }
}
