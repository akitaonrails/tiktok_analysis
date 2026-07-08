package kotlin.jvm.internal;

import X.C09AY;
import X.C0HTT;
import X.C1387490mD5;
import X.C1394160mNq;
import X.C1589640rT8;
import X.C1618440sDa;
import X.InterfaceC494301wD;
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.feed.flexible.ability.FlexibleComponentAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.services.IExternalService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AwS0S3510000_21 extends C09AY implements Function1 {
    public final int $t;
    public Object l3;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
    public String s0;
    public String s1;
    public String s2;
    public boolean z8;

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

    public static final Object invoke$0(AwS0S3510000_21 awS0S3510000_21, Object obj) {
        C1387490mD5.LJIIJ((C0HTT) awS0S3510000_21.l4, (Aweme) awS0S3510000_21.l5, awS0S3510000_21.z8, awS0S3510000_21.s0, awS0S3510000_21.s1, awS0S3510000_21.s2, (Function0) awS0S3510000_21.l6, (IExternalService) awS0S3510000_21.l3, null, "delete_panel");
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS0S3510000_21 awS0S3510000_21, Object obj) {
        FlexibleComponentAbility flexibleComponentAbility;
        SmartRoute smartRoute = (SmartRoute) obj;
        smartRoute.withParam("enter_method", awS0S3510000_21.s0);
        smartRoute.withParam("is_story_page", C1618440sDa.LIZIZ.LJJIIJ().LJJIIJZLJL((Fragment) awS0S3510000_21.l3));
        smartRoute.withParam("is_friend_page", C1589640rT8.LIZIZ.t2((Fragment) awS0S3510000_21.l3));
        smartRoute.withParam("story type", ((Aweme) awS0S3510000_21.l4).getIsTikTokStory());
        String str = awS0S3510000_21.s1;
        if (str != null) {
            smartRoute.withParam("extra_edit_effect_uid", str);
        }
        C1394160mNq c1394160mNq = (C1394160mNq) awS0S3510000_21.l5;
        Aweme aweme = (Aweme) awS0S3510000_21.l4;
        String str2 = awS0S3510000_21.s2;
        String str3 = awS0S3510000_21.s0;
        Activity activity = (Activity) awS0S3510000_21.l6;
        InterfaceC494301wD interfaceC494301wD = (InterfaceC494301wD) awS0S3510000_21.l7;
        if (interfaceC494301wD instanceof FlexibleComponentAbility) {
            flexibleComponentAbility = (FlexibleComponentAbility) interfaceC494301wD;
        } else {
            flexibleComponentAbility = null;
        }
        boolean z = awS0S3510000_21.z8;
        c1394160mNq.getClass();
        C1394160mNq.LIZIZ(aweme, str2, str3, activity, flexibleComponentAbility, smartRoute, z);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S3510000_21(Fragment fragment, Aweme aweme, String str, C1394160mNq c1394160mNq, String str2, Activity activity, FlexibleComponentAbility flexibleComponentAbility, int i) {
        super(1);
        this.$t = i;
        this.s0 = "title_panel";
        this.l3 = fragment;
        this.l4 = aweme;
        this.s1 = str;
        this.l5 = c1394160mNq;
        this.s2 = str2;
        this.l6 = activity;
        this.l7 = flexibleComponentAbility;
        this.z8 = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S3510000_21(Context context, String str, IExternalService iExternalService, C0HTT c0htt, Aweme aweme, boolean z, String str2, String str3, Function0 function0, Function0 function02, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
        this.l3 = iExternalService;
        this.l4 = c0htt;
        this.l5 = aweme;
        this.z8 = z;
        this.s1 = str2;
        this.s2 = str3;
        this.l6 = function0;
        this.l7 = function02;
    }
}
