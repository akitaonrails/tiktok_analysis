package kotlin.jvm.internal;

import X.C09AY;
import X.C1397630mTR;
import X.C1397660mTU;
import X.C15438062q;
import X.InterfaceC1237760iJa;
import android.app.Activity;
import com.ss.android.ugc.aweme.IForceBindingAccountService;
import com.ss.android.ugc.aweme.services.ForceBindingAccountService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public class AwS0S4511000_19 extends C09AY implements Function1 {
    public final int $t;
    public int i10;
    public Object l4;
    public Object l5;
    public Object l6;
    public Object l7;
    public Object l8;
    public String s0;
    public String s1;
    public String s2;
    public String s3;
    public boolean z9;

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AwS0S4511000_19 awS0S4511000_19, Object obj) {
        C1397660mTU c1397660mTU = (C1397660mTU) obj;
        c1397660mTU.LIZJ = false;
        ForceBindingAccountService.buttonOnClickBasedOnActionType$default((ForceBindingAccountService) awS0S4511000_19.l8, (Activity) awS0S4511000_19.l4, c1397660mTU.LIZ(), awS0S4511000_19.z9, (IForceBindingAccountService.BindPromptButtonConfig) awS0S4511000_19.l5, awS0S4511000_19.s0, awS0S4511000_19.s1, awS0S4511000_19.i10, awS0S4511000_19.s2, (Integer) awS0S4511000_19.l7, (InterfaceC1237760iJa) awS0S4511000_19.l6, null, awS0S4511000_19.s3, 1024, null);
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(AwS0S4511000_19 awS0S4511000_19, Object obj) {
        C1397630mTR c1397630mTR = (C1397630mTR) obj;
        c1397630mTR.LJFF = true;
        List list = (List) awS0S4511000_19.l5;
        ForceBindingAccountService forceBindingAccountService = (ForceBindingAccountService) awS0S4511000_19.l8;
        Activity activity = (Activity) awS0S4511000_19.l4;
        boolean z = awS0S4511000_19.z9;
        String str = awS0S4511000_19.s0;
        String str2 = awS0S4511000_19.s1;
        int i = awS0S4511000_19.i10;
        String str3 = awS0S4511000_19.s2;
        Integer num = (Integer) awS0S4511000_19.l7;
        InterfaceC1237760iJa interfaceC1237760iJa = (InterfaceC1237760iJa) awS0S4511000_19.l6;
        String str4 = awS0S4511000_19.s3;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str5 = str2;
            String str6 = str;
            boolean z2 = z;
            Activity activity2 = activity;
            forceBindingAccountService.getAction(c1397630mTR, activity2, z2, (IForceBindingAccountService.BindPromptButtonConfig) it2.next(), str6, str5, i, str3, num, interfaceC1237760iJa, str4);
            arrayList.add(Unit.LIZ);
            str2 = str5;
            str = str6;
            z = z2;
            activity = activity2;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS0S4511000_19(ForceBindingAccountService forceBindingAccountService, Activity activity, boolean z, IForceBindingAccountService.BindPromptButtonConfig bindPromptButtonConfig, String str, String str2, int i, String str3, Integer num, InterfaceC1237760iJa interfaceC1237760iJa, String str4, int i2) {
        super(1);
        this.$t = i2;
        this.l8 = forceBindingAccountService;
        this.l4 = activity;
        this.z9 = z;
        this.l5 = bindPromptButtonConfig;
        this.s0 = str;
        this.s1 = str2;
        this.i10 = i;
        this.s2 = str3;
        this.l7 = num;
        this.l6 = interfaceC1237760iJa;
        this.s3 = str4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS0S4511000_19(List list, List<IForceBindingAccountService.BindPromptButtonConfig> list2, ForceBindingAccountService forceBindingAccountService, Activity activity, boolean z, String str, String str2, int i, String str3, Integer num, InterfaceC1237760iJa interfaceC1237760iJa, String str4) {
        super(1);
        this.$t = str4;
        this.l5 = list;
        this.l8 = list2;
        this.l4 = forceBindingAccountService;
        this.z9 = activity;
        this.s0 = z;
        this.s1 = str;
        this.i10 = str2;
        this.s2 = i;
        this.l7 = str3;
        this.l6 = num;
        this.s3 = interfaceC1237760iJa;
    }
}
