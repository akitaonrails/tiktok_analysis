package kotlin.jvm.internal;

import X.C09AY;
import X.C0Y3I;
import X.C0Y3O;
import X.C1163440gNi;
import X.C13LE;
import X.C627050Oid;
import X.C628830OlV;
import X.C713240RyM;
import X.C869590Y9l;
import X.InterfaceC603530Nln;
import X.InterfaceC863600XuI;
import com.ss.android.ugc.aweme.detail.prefab.DetailPageContainerAssem;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.template.TemplateDetailFragment;
import com.ss.android.ugc.aweme.template.datamodel.TemplateBannerModel;
import com.ss.android.ugc.aweme.template.datamodel.TemplateDetailModel;
import com.ss.android.ugc.aweme.template.datamodel.TemplatePugcCreatorStatisticModel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AwS7S0410000_9 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public boolean z4;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS7S0410000_9 awS7S0410000_9, Object obj) {
        ((InterfaceC603530Nln) awS7S0410000_9.l3).LIZIZ((C869590Y9l) awS7S0410000_9.l1, (Map) awS7S0410000_9.l0, (C0Y3I) awS7S0410000_9.l2, awS7S0410000_9.z4, (InterfaceC863600XuI) obj);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS7S0410000_9 awS7S0410000_9, Object obj) {
        ((InterfaceC603530Nln) awS7S0410000_9.l3).LJII((C869590Y9l) awS7S0410000_9.l1, (Set) awS7S0410000_9.l0, (C0Y3I) awS7S0410000_9.l2, awS7S0410000_9.z4, (InterfaceC863600XuI) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS7S0410000_9 awS7S0410000_9, Object obj) {
        C628830OlV c628830OlV = (C628830OlV) obj;
        c628830OlV.LL = C13LE.LIZ(DetailPageContainerAssem.class);
        c628830OlV.LLIZLLLIL = R.id.ex3;
        c628830OlV.LLJIJIL = C1163440gNi.LIZJ;
        C627050Oid.LIZ(c628830OlV, new AwS588S0100000_9((TemplateDetailModel) awS7S0410000_9.l0, 387));
        c628830OlV.LJII("content", AFwS240S0000000_9.get$arr$(622));
        TemplatePugcCreatorStatisticModel templatePugcCreatorStatisticModel = (TemplatePugcCreatorStatisticModel) awS7S0410000_9.l1;
        c628830OlV.LJII("header", new AwS6S0410000_6((TemplateDetailFragment) awS7S0410000_9.l3, (TemplateBannerModel) awS7S0410000_9.l2, (TemplateDetailModel) awS7S0410000_9.l0, templatePugcCreatorStatisticModel, awS7S0410000_9.z4, 0));
        c628830OlV.LJII(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, new AwS588S0100000_9((TemplateDetailFragment) awS7S0410000_9.l3, 389));
        c628830OlV.LJII("record", AFwS240S0000000_9.get$arr$(624));
        return Unit.LIZ;
    }

    public static final Object invoke$3(AwS7S0410000_9 awS7S0410000_9, Object obj) {
        TemplateDetailFragment templateDetailFragment = (TemplateDetailFragment) awS7S0410000_9.l0;
        C713240RyM.LIZ(templateDetailFragment, new AwS7S0410000_9(templateDetailFragment, (TemplateBannerModel) awS7S0410000_9.l3, (TemplateDetailModel) awS7S0410000_9.l1, (TemplatePugcCreatorStatisticModel) awS7S0410000_9.l2, awS7S0410000_9.z4, 2));
        return Unit.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AwS7S0410000_9(com.ss.android.ugc.aweme.template.TemplateDetailFragment r3, com.ss.android.ugc.aweme.template.datamodel.TemplateBannerModel r4, com.ss.android.ugc.aweme.template.datamodel.TemplateDetailModel r5, com.ss.android.ugc.aweme.template.datamodel.TemplatePugcCreatorStatisticModel r6, boolean r7, int r8) {
        /*
            r2 = this;
            r2.$t = r8
            int r8 = 2 - r8
            if (r8 == 0) goto L16
            r1 = r2
            r1.l0 = r3
            r1.l1 = r5
            r1.l2 = r6
            r1.l3 = r4
            r1.z4 = r7
            r0 = 1
        L12:
            r1.<init>(r0)
            return
        L16:
            r1 = r2
            r1.l0 = r5
            r1.l1 = r6
            r1.l2 = r4
            r1.z4 = r7
            r1.l3 = r3
            r0 = 1
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AwS7S0410000_9.<init>(com.ss.android.ugc.aweme.template.TemplateDetailFragment, com.ss.android.ugc.aweme.template.datamodel.TemplateBannerModel, com.ss.android.ugc.aweme.template.datamodel.TemplateDetailModel, com.ss.android.ugc.aweme.template.datamodel.TemplatePugcCreatorStatisticModel, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS7S0410000_9(InterfaceC603530Nln interfaceC603530Nln, InterfaceC603530Nln interfaceC603530Nln2, C869590Y9l c869590Y9l, Map<String, ? extends C0Y3O> map, C0Y3I c0y3i, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l3 = interfaceC603530Nln;
        this.l1 = interfaceC603530Nln2;
        this.l0 = c869590Y9l;
        this.l2 = map;
        this.z4 = c0y3i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS7S0410000_9(InterfaceC603530Nln interfaceC603530Nln, InterfaceC603530Nln interfaceC603530Nln2, C869590Y9l c869590Y9l, Set<String> set, C0Y3I c0y3i, boolean z) {
        super(1);
        this.$t = z ? 1 : 0;
        this.l3 = interfaceC603530Nln;
        this.l1 = interfaceC603530Nln2;
        this.l0 = c869590Y9l;
        this.l2 = set;
        this.z4 = c0y3i;
    }
}
