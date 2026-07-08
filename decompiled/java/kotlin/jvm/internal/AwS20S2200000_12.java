package kotlin.jvm.internal;

import X.C09AY;
import X.C1397620mTQ;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.advertiser.AdvertiserSettingsActivity;
import com.bytedance.ies.ugc.aweme.commercialize.compliance.personalization.AdPersonalizationActivity;
import com.ss.android.ugc.aweme.compliance.api.model.ResetEntryTextData;
import defpackage.AdvertiserModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes13.dex */
public class AwS20S2200000_12 extends C09AY implements Function1 {
    public final int $t;
    public Object l2;
    public Object l3;
    public String s0;
    public String s1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AwS20S2200000_12 awS20S2200000_12, Object obj) {
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        c1397620mTQ.LIZJ(0, awS20S2200000_12.s0, new AwS378S0200000_12((AdvertiserSettingsActivity) awS20S2200000_12.l2, (AdvertiserModel) awS20S2200000_12.l3, 4));
        c1397620mTQ.LIZJ(0, awS20S2200000_12.s1, AFwS245S0000000_12.get$arr$(21));
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS20S2200000_12 awS20S2200000_12, Object obj) {
        String strValueOf;
        String strValueOf2;
        C1397620mTQ c1397620mTQ = (C1397620mTQ) obj;
        if (!TextUtils.isEmpty(((ResetEntryTextData) awS20S2200000_12.l2).withdraw)) {
            strValueOf = String.valueOf(((ResetEntryTextData) awS20S2200000_12.l2).withdraw);
        } else {
            strValueOf = awS20S2200000_12.s0;
        }
        c1397620mTQ.LIZJ(0, strValueOf, new AwS591S0100000_12((AdPersonalizationActivity) awS20S2200000_12.l3, 911));
        if (!TextUtils.isEmpty(((ResetEntryTextData) awS20S2200000_12.l2).cancel)) {
            strValueOf2 = String.valueOf(((ResetEntryTextData) awS20S2200000_12.l2).cancel);
        } else {
            strValueOf2 = awS20S2200000_12.s1;
        }
        c1397620mTQ.LIZJ(0, strValueOf2, AFwS245S0000000_12.get$arr$(155));
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S2200000_12(ResetEntryTextData resetEntryTextData, String str, String str2, AdPersonalizationActivity adPersonalizationActivity, int i) {
        super(1);
        this.$t = i;
        this.l2 = resetEntryTextData;
        this.s0 = str;
        this.s1 = str2;
        this.l3 = adPersonalizationActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS20S2200000_12(String str, String str2, AdvertiserSettingsActivity advertiserSettingsActivity, AdvertiserModel advertiserModel, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
        this.l2 = advertiserSettingsActivity;
        this.l3 = advertiserModel;
    }
}
