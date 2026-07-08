package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C512000K6c;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubPrivilegeDetailFullPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public class AwS29S0600000_7 extends C09AY implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

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

    public static final Object invoke$0(AwS29S0600000_7 awS29S0600000_7, Object obj) {
        C512000K6c c512000K6c = (C512000K6c) awS29S0600000_7.l0;
        c512000K6c.LIZ = (String) obj;
        ((C013C) awS29S0600000_7.l1).element = true;
        C013C c013c = (C013C) awS29S0600000_7.l2;
        C013C c013c2 = (C013C) awS29S0600000_7.l3;
        SubPrivilegeDetailFullPage subPrivilegeDetailFullPage = (SubPrivilegeDetailFullPage) awS29S0600000_7.l4;
        Function0 function0 = (Function0) awS29S0600000_7.l5;
        if (!c013c.element && c013c2.element) {
            subPrivilegeDetailFullPage.LLJJL = c512000K6c;
            function0.invoke();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS29S0600000_7 awS29S0600000_7, Object obj) {
        C512000K6c c512000K6c = (C512000K6c) awS29S0600000_7.l0;
        c512000K6c.LIZIZ = (String) obj;
        ((C013C) awS29S0600000_7.l1).element = true;
        C013C c013c = (C013C) awS29S0600000_7.l2;
        C013C c013c2 = (C013C) awS29S0600000_7.l3;
        SubPrivilegeDetailFullPage subPrivilegeDetailFullPage = (SubPrivilegeDetailFullPage) awS29S0600000_7.l4;
        Function0 function0 = (Function0) awS29S0600000_7.l5;
        if (!c013c.element && c013c2.element) {
            subPrivilegeDetailFullPage.LLJJL = c512000K6c;
            function0.invoke();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AwS29S0600000_7(SubPrivilegeDetailFullPage subPrivilegeDetailFullPage, C512000K6c c512000K6c, AwS551S0100000_7 awS551S0100000_7, C013C c013c, C013C c013c2, C013C c013c3, int i) {
        super(1);
        this.$t = i;
        this.l0 = c512000K6c;
        this.l1 = c013c;
        this.l2 = c013c2;
        this.l3 = c013c3;
        this.l4 = subPrivilegeDetailFullPage;
        this.l5 = awS551S0100000_7;
    }
}
