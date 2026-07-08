package kotlin.jvm.internal;

import X.AnonymousClass1097;
import X.C09AY;
import X.C109C;
import X.C109W;
import X.C10A6;
import X.C1219900hqm;
import X.C1390380mHk;
import X.C1440005kM;
import X.C191977108p;
import X.C191983108v;
import X.C191984108w;
import X.C20673215v0;
import X.C586090Myl;
import X.C786410Ut5;
import X.C859340XnQ;
import android.app.Activity;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.privacy.ui.PublishDefaultPermissionFragment;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes29.dex */
public class AwS9S0211000_28 extends C09AY implements Function0 {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
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
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS9S0211000_28 awS9S0211000_28) {
        List<AnchorCommonStruct> anchors;
        AnchorCommonStruct next;
        String str;
        try {
            Aweme awemeLJJJIL = ((C10A6) awS9S0211000_28.l0).LJJJIL();
            if (awemeLJJJIL != null && (anchors = awemeLJJJIL.getAnchors()) != null) {
                int i = awS9S0211000_28.i3;
                Iterator<AnchorCommonStruct> it2 = anchors.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.getType() == i) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                AnchorCommonStruct anchorCommonStruct = next;
                if (anchorCommonStruct != null) {
                    boolean z = awS9S0211000_28.z2;
                    JSONObject jSONObject = new JSONObject(anchorCommonStruct.getExtra());
                    if (z) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    jSONObject.put("is_hide", str);
                    anchorCommonStruct.setExtra(C786410Ut5.J3(jSONObject));
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ((C10A6) awS9S0211000_28.l0).LJIL().LLILZLL = true;
        C1440005kM.LIZ(new C1219900hqm());
        C1440005kM.LIZ(new C586090Myl((Aweme) awS9S0211000_28.l1));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS9S0211000_28 awS9S0211000_28) {
        return C20673215v0.LIZLLL(awS9S0211000_28.i3, (Activity) awS9S0211000_28.l0, (ViewGroup) awS9S0211000_28.l1, awS9S0211000_28.z2);
    }

    public static final Object invoke$2(AwS9S0211000_28 awS9S0211000_28) {
        C191983108v c191983108v = (C191983108v) awS9S0211000_28.l0;
        C109W c109w = (C109W) awS9S0211000_28.l1;
        c191983108v.LIZLLL(Integer.valueOf(c109w.LJIILIIL()), Integer.valueOf(awS9S0211000_28.i3), c109w.LLILLJJLI.LIZLLL, awS9S0211000_28.z2);
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS9S0211000_28 awS9S0211000_28) {
        Integer num;
        ((PublishDefaultPermissionFragment) awS9S0211000_28.l0).rS(awS9S0211000_28.i3, false);
        if (awS9S0211000_28.z2) {
            num = 2131858116;
        } else {
            PrivacySettingsRestrictionOption privacySettingsRestrictionOption = (PrivacySettingsRestrictionOption) awS9S0211000_28.l1;
            if (privacySettingsRestrictionOption != null && privacySettingsRestrictionOption.resType == 25) {
                num = 2131826725;
            }
            return Unit.LIZ;
        }
        if (num != null) {
            PublishDefaultPermissionFragment publishDefaultPermissionFragment = (PublishDefaultPermissionFragment) awS9S0211000_28.l0;
            int iIntValue = num.intValue();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.isCenterToast(C859340XnQ.LIZIZ());
            creativeToastBuilder.message(publishDefaultPermissionFragment.getString(iIntValue));
            C1390380mHk.LJ(publishDefaultPermissionFragment, 2006, creativeToastBuilder);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(AwS9S0211000_28 awS9S0211000_28) {
        C191983108v c191983108v = (C191983108v) awS9S0211000_28.l0;
        AnonymousClass1097 anonymousClass1097 = (AnonymousClass1097) awS9S0211000_28.l1;
        c191983108v.LIZLLL(anonymousClass1097.LJJI().LLILLL.getValue(), Integer.valueOf(awS9S0211000_28.i3), anonymousClass1097.LLJI.LIZLLL, awS9S0211000_28.z2);
        return Unit.LIZ;
    }

    public static final Object invoke$5(AwS9S0211000_28 awS9S0211000_28) {
        ((C191984108w) awS9S0211000_28.l0).LIZIZ(Integer.valueOf(awS9S0211000_28.i3), ((C109C) awS9S0211000_28.l1).LLILLL.LIZLLL, awS9S0211000_28.z2);
        return Unit.LIZ;
    }

    public static final Object invoke$6(AwS9S0211000_28 awS9S0211000_28) {
        C191983108v c191983108v = (C191983108v) awS9S0211000_28.l0;
        C191977108p c191977108p = (C191977108p) awS9S0211000_28.l1;
        c191983108v.LIZLLL(c191977108p.LLIZ.LLILLL.getValue(), Integer.valueOf(awS9S0211000_28.i3), c191977108p.LLJ.LIZLLL, awS9S0211000_28.z2);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0211000_28(int i, Activity activity, ViewGroup viewGroup, boolean z, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = activity;
        this.i3 = i;
        this.l1 = viewGroup;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0211000_28(C191983108v c191983108v, C191977108p c191977108p, boolean z, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c191983108v;
        this.l1 = c191977108p;
        this.z2 = z;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0211000_28(C191983108v c191983108v, AnonymousClass1097 anonymousClass1097, boolean z, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c191983108v;
        this.l1 = anonymousClass1097;
        this.z2 = z;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0211000_28(C191983108v c191983108v, C109W c109w, boolean z, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c191983108v;
        this.l1 = c109w;
        this.z2 = z;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0211000_28(C191984108w c191984108w, C109C c109c, boolean z, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c191984108w;
        this.l1 = c109c;
        this.z2 = z;
        this.i3 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0211000_28(C10A6 c10a6, Aweme aweme, int i, boolean z, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c10a6;
        this.l1 = aweme;
        this.i3 = i;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS9S0211000_28(PublishDefaultPermissionFragment publishDefaultPermissionFragment, int i, boolean z, PrivacySettingsRestrictionOption privacySettingsRestrictionOption, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = publishDefaultPermissionFragment;
        this.i3 = i;
        this.z2 = z;
        this.l1 = privacySettingsRestrictionOption;
    }
}
