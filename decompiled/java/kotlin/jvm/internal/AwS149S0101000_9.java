package kotlin.jvm.internal;

import X.C09AY;
import X.C0NDV;
import X.C1908480zlO;
import X.C19323510in;
import X.C20684815ws;
import X.C20690215xk;
import X.C2188811AlT;
import X.C2214201BlK;
import X.C2344009Gk;
import X.C259800zU;
import X.C276890AtD;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C590950NFt;
import X.C633880Ote;
import X.C786410Ut5;
import X.C814420VxA;
import X.C814730Vxf;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Looper;
import android.view.View;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.assem.music.mute.OpenOnMuteImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes10.dex */
public class AwS149S0101000_9 extends C09AY implements Function0 {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            case 6:
                return invoke$6(this);
            case 7:
                return invoke$7(this);
            case 8:
                return invoke$8(this);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this);
            case 14:
                return invoke$14(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS149S0101000_9 awS149S0101000_9) {
        C0NDV c0ndv = C0NDV.LIZ;
        String aid = ((Aweme) awS149S0101000_9.l0).getAid();
        int i = awS149S0101000_9.i1;
        c0ndv.getClass();
        if (C0NDV.LJIIJ() && !a0.LJJJIL(aid)) {
            C0NDV.LJIILIIL(new AwS16S1001000_9(aid, i, 1));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS149S0101000_9 awS149S0101000_9) {
        ((View) awS149S0101000_9.l0).getLayoutParams().height = awS149S0101000_9.i1;
        ((View) awS149S0101000_9.l0).requestLayout();
        return Unit.LIZ;
    }

    public static final Object invoke$10(AwS149S0101000_9 awS149S0101000_9) {
        String imprId;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
        c2344009Gk.LIZJ(awS149S0101000_9.i1, "skip_count");
        c2344009Gk.LJIIIIZZ("group_id", ((Aweme) awS149S0101000_9.l0).getGroupId());
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid((Aweme) awS149S0101000_9.l0));
        LogPbBean logPbBean = ((Aweme) awS149S0101000_9.l0).getLogPbBean();
        if (logPbBean != null) {
            imprId = logPbBean.getImprId();
        } else {
            imprId = null;
        }
        c2344009Gk.LJIIIIZZ("log_pb", imprId);
        c2344009Gk.LJIIIIZZ("enter_method", "homepage_hot");
        C20684815ws.LJIILLIIL("trigger_skip", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$11(AwS149S0101000_9 awS149S0101000_9) {
        String imprId;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_hot");
        c2344009Gk.LIZJ(awS149S0101000_9.i1, "skip_count");
        c2344009Gk.LJIIIIZZ("group_id", ((Aweme) awS149S0101000_9.l0).getGroupId());
        c2344009Gk.LJIIIIZZ("author_id", AwemeExtKt.getAuthorUid((Aweme) awS149S0101000_9.l0));
        LogPbBean logPbBean = ((Aweme) awS149S0101000_9.l0).getLogPbBean();
        if (logPbBean != null) {
            imprId = logPbBean.getImprId();
        } else {
            imprId = null;
        }
        c2344009Gk.LJIIIIZZ("log_pb", imprId);
        c2344009Gk.LJIIIIZZ("enter_method", "homepage_hot");
        C20684815ws.LJIILLIIL("trigger_skip_all", c2344009Gk.LIZ);
        return Unit.LIZ;
    }

    public static final Object invoke$12(AwS149S0101000_9 awS149S0101000_9) {
        boolean z;
        boolean z2;
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.br);
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(24));
            Drawable drawableLIZ = c384050F3z.LIZ(activityLJFF);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            c419910GdJ.LIZ = R.raw.icon_speaker_x_mark_fill_ltr;
            LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(c419910GdJ.LIZ(activityLJFF), drawableLIZ);
            String strLIZIZ = ((OpenOnMuteImpl) awS149S0101000_9.l0).LIZIZ(null);
            if (!Intrinsics.LJFF(strLIZIZ, "homepage_hot") && !Intrinsics.LJFF(strLIZIZ, "homepage_follow")) {
                z = false;
            } else {
                z = true;
            }
            if (awS149S0101000_9.i1 == 25) {
                z2 = true;
            } else {
                z2 = false;
            }
            C20690215xk.LIZ.getClass();
            if (C20690215xk.LJIILIIL && z2 && z && (!C276890AtD.LIZJ || !C1908480zlO.LIZIZ.LJIIIZ(false))) {
                Resources resources = activityLJFF.getResources();
                new C19323510in(1001, "click_push_unmute", new InnerPushConfig(10L, null, 0, Collections.singletonList(6), 5), new InnerPushUITemplate(0, null, 0, 0, 0, 0, null, null, null, null, null, null, null, Collections.singletonList(layerDrawableLJIILIIL), null, 48, 48, 0.0f, 0.5f, null, 20, 20, null, false, -3, 3, null, 0, 0, 2, Boolean.FALSE, 0, 0, 0, 0, 0, null, null, resources.getString(2131838810), null, 2, null, 4, resources.getString(2131838809), null, 36, 48, 4, 0, null, null, 0.5f, null, true, 0, null, null, "aweme://setting/playback", 12, null, null, null, null, null, 0), null, null, 460).LIZIZ();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$13(AwS149S0101000_9 awS149S0101000_9) {
        C633880Ote c633880Ote = C633880Ote.LIZ;
        List list = (List) awS149S0101000_9.l0;
        c633880Ote.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(((Number) it2.next()).longValue()));
        }
        Keva.getRepo("artist_new_release_highlight_repo").storeStringArray(C633880Ote.LIZJ("artist_new_released_musics"), (String[]) arrayList.toArray(new String[0]));
        C633880Ote c633880Ote2 = C633880Ote.LIZ;
        int i = awS149S0101000_9.i1 + 1;
        c633880Ote2.getClass();
        Keva.getRepo("artist_new_release_highlight_repo").storeInt(C633880Ote.LIZJ("artist_new_release_show_times"), i);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$14(AwS149S0101000_9 awS149S0101000_9) {
        T tInvoke;
        C259800zU c259800zU = (C259800zU) awS149S0101000_9.l0;
        Function0 function0 = (Function0) ((LinkedHashMap) C590950NFt.LJIIJ).get(Integer.valueOf(awS149S0101000_9.i1));
        if (function0 != null) {
            tInvoke = function0.invoke();
        } else {
            tInvoke = 0;
        }
        c259800zU.element = tInvoke;
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS149S0101000_9 awS149S0101000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(((C814730Vxf) awS149S0101000_9.l0).id);
        sbLIZ.append("] start to use intelligence, retry times: {");
        sbLIZ.append(awS149S0101000_9.i1);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$3(AwS149S0101000_9 awS149S0101000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(((C814730Vxf) awS149S0101000_9.l0).id);
        sbLIZ.append("] start to show, retry times: {");
        sbLIZ.append(awS149S0101000_9.i1);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$4(AwS149S0101000_9 awS149S0101000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(((C814730Vxf) awS149S0101000_9.l0).id);
        sbLIZ.append("] timeout, retry times: {");
        sbLIZ.append(awS149S0101000_9.i1);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$5(AwS149S0101000_9 awS149S0101000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(((C814730Vxf) awS149S0101000_9.l0).id);
        sbLIZ.append("] failed, retry times: {");
        sbLIZ.append(awS149S0101000_9.i1);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(AwS149S0101000_9 awS149S0101000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(((C814730Vxf) awS149S0101000_9.l0).id);
        sbLIZ.append("] processMessageByIntelligence.needInitPitaya1st.Round#");
        sbLIZ.append(awS149S0101000_9.i1 + 1);
        sbLIZ.append("(true) - before delay; ");
        sbLIZ.append(C786410Ut5.u3());
        sbLIZ.append(" is main? ");
        sbLIZ.append(Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3()));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static /* bridge */ /* synthetic */ Object invoke$7(AwS149S0101000_9 awS149S0101000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(((C814730Vxf) awS149S0101000_9.l0).id);
        sbLIZ.append("] processMessageByIntelligence.needInitPitaya1st.Round#");
        sbLIZ.append(awS149S0101000_9.i1 + 1);
        sbLIZ.append("(true) - after delay; ");
        sbLIZ.append(C786410Ut5.u3());
        sbLIZ.append(" is main? ");
        sbLIZ.append(Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3()));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$8(AwS149S0101000_9 awS149S0101000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(((C814730Vxf) awS149S0101000_9.l0).id);
        sbLIZ.append("] processMessageByIntelligence.needInitPitaya1st.Round#");
        sbLIZ.append(awS149S0101000_9.i1 + 1);
        sbLIZ.append("(true);");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$9(AwS149S0101000_9 awS149S0101000_9) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append('[');
        sbLIZ.append(((C814730Vxf) awS149S0101000_9.l0).id);
        sbLIZ.append("] processMessageByIntelligence.needInitPitaya1st.Round#");
        sbLIZ.append(awS149S0101000_9.i1 + 1);
        sbLIZ.append("(false);");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S0101000_9(C259800zU c259800zU, int i) {
        super(0);
        this.$t = i;
        this.l0 = c259800zU;
        this.i1 = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S0101000_9(int i, View view, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = view;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S0101000_9(int i, Aweme aweme, int i2) {
        super(0);
        this.$t = i2;
        this.i1 = i;
        this.l0 = aweme;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S0101000_9(C814730Vxf c814730Vxf, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c814730Vxf;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S0101000_9(OpenOnMuteImpl openOnMuteImpl, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = openOnMuteImpl;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS149S0101000_9(Aweme aweme, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = aweme;
        this.i1 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS149S0101000_9(List list, List<Long> list2, int i) {
        super(0);
        this.$t = i;
        this.l0 = list;
        this.i1 = list2;
    }
}
