package kotlin.jvm.internal;

import X.C013C;
import X.C09AY;
import X.C0XUD;
import X.C0XUE;
import X.InterfaceC1740440vOM;
import X.InterfaceC824510WWb;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.oneclicklogin.storage.EncryptedLoginMethod;
import com.ss.android.ugc.aweme.ecommerce.ug.popup.view.ShopTabOverlayActivity;
import com.ss.android.ugc.aweme.services.ClearCredScene;
import com.ss.android.ugc.aweme.services.ClearLoginCredentialsService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes14.dex */
public class AwS291S0300000_13 extends C09AY implements Function2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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

    public static final Object invoke$0(AwS291S0300000_13 awS291S0300000_13, Object obj, Object obj2) {
        if (((Boolean) obj).booleanValue()) {
            InterfaceC824510WWb interfaceC824510WWb = (InterfaceC824510WWb) awS291S0300000_13.l0;
            if (interfaceC824510WWb != null) {
                interfaceC824510WWb.LJI();
            }
            String str = ShopTabOverlayActivity._pnsPageId;
            final InterfaceC824510WWb interfaceC824510WWb2 = (InterfaceC824510WWb) awS291S0300000_13.l0;
            final C013C c013c = (C013C) awS291S0300000_13.l2;
            final Function2 function2 = (Function2) awS291S0300000_13.l1;
            ShopTabOverlayActivity.LLILLJJLI = new InterfaceC1740440vOM() { // from class: X.0WWa
                @Override // X.InterfaceC1740440vOM
                public final void LIZIZ() {
                    InterfaceC824510WWb interfaceC824510WWb3 = interfaceC824510WWb2;
                    if (interfaceC824510WWb3 != null) {
                        interfaceC824510WWb3.LJ(true);
                    }
                }

                @Override // X.InterfaceC1740440vOM
                public final void LIZ(String str2, boolean z) {
                    InterfaceC824510WWb interfaceC824510WWb3;
                    if (z && (interfaceC824510WWb3 = interfaceC824510WWb2) != null) {
                        interfaceC824510WWb3.LIZ(true);
                    }
                    c013c.element = z;
                    function2.invoke(Boolean.valueOf(z), str2);
                }

                @Override // X.InterfaceC1740440vOM
                public final void LIZJ(String str2, String str3) {
                    InterfaceC824510WWb interfaceC824510WWb3 = interfaceC824510WWb2;
                    if (interfaceC824510WWb3 != null) {
                        interfaceC824510WWb3.LJFF(str2, str3, true);
                    }
                }

                @Override // X.InterfaceC1740440vOM
                public final void LIZLLL(String str2, String str3) {
                    InterfaceC824510WWb interfaceC824510WWb3 = interfaceC824510WWb2;
                    if (interfaceC824510WWb3 != null) {
                        interfaceC824510WWb3.LIZLLL(str2, str3, true);
                    }
                }
            };
        } else {
            ((Function2) awS291S0300000_13.l1).invoke(Boolean.FALSE, obj2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(AwS291S0300000_13 awS291S0300000_13, Object obj, Object obj2) {
        List<EncryptedLoginMethod> list = (List) obj;
        List list2 = (List) obj2;
        if (((List) awS291S0300000_13.l0).isEmpty() && (!list.isEmpty())) {
            ClearLoginCredentialsService clearLoginCredentialsService = ClearLoginCredentialsService.INSTANCE;
            if (clearLoginCredentialsService.shouldTryClearOclCredentials()) {
                C0XUD.LIZ.getClass();
                C0XUD.LJ(clearLoginCredentialsService.getUpdatedLoginMethodList(C0XUD.LIZ(list, true), ClearCredScene.CLEAR_OCL), null);
            } else {
                C0XUD.LIZJ.LIZIZ(list);
            }
        }
        if (((List) awS291S0300000_13.l1).isEmpty()) {
            boolean z = false;
            if (list2 != null && (!list2.isEmpty())) {
                C0XUD.LIZ.getClass();
                List<BaseLoginMethod> listLIZ = C0XUD.LIZ(list2, false);
                if (!((ArrayList) listLIZ).isEmpty()) {
                    ClearLoginCredentialsService clearLoginCredentialsService2 = ClearLoginCredentialsService.INSTANCE;
                    if (clearLoginCredentialsService2.shouldTryClearHLCredentials()) {
                        listLIZ = clearLoginCredentialsService2.getUpdatedLoginMethodList(listLIZ, ClearCredScene.CLEAR_HL);
                        z = true;
                    }
                }
                C0XUE.LIZ.LJII(listLIZ, !z);
            }
        }
        ((Function1) awS291S0300000_13.l2).invoke(list);
        return Unit.LIZ;
    }

    public static final Object invoke$2(AwS291S0300000_13 awS291S0300000_13, Object obj, Object obj2) {
        if (((Boolean) obj).booleanValue()) {
            InterfaceC824510WWb interfaceC824510WWb = (InterfaceC824510WWb) awS291S0300000_13.l0;
            if (interfaceC824510WWb != null) {
                interfaceC824510WWb.LJI();
            }
            String str = ShopTabOverlayActivity._pnsPageId;
            final InterfaceC824510WWb interfaceC824510WWb2 = (InterfaceC824510WWb) awS291S0300000_13.l0;
            final C013C c013c = (C013C) awS291S0300000_13.l2;
            final Function2 function2 = (Function2) awS291S0300000_13.l1;
            ShopTabOverlayActivity.LLILLJJLI = new InterfaceC1740440vOM() { // from class: X.0WWc
                @Override // X.InterfaceC1740440vOM
                public final void LIZIZ() {
                    InterfaceC824510WWb interfaceC824510WWb3 = interfaceC824510WWb2;
                    if (interfaceC824510WWb3 != null) {
                        interfaceC824510WWb3.LJ(true);
                    }
                }

                @Override // X.InterfaceC1740440vOM
                public final void LIZ(String str2, boolean z) {
                    InterfaceC824510WWb interfaceC824510WWb3;
                    if (z && (interfaceC824510WWb3 = interfaceC824510WWb2) != null) {
                        interfaceC824510WWb3.LIZ(true);
                    }
                    c013c.element = z;
                    function2.invoke(Boolean.valueOf(z), str2);
                }

                @Override // X.InterfaceC1740440vOM
                public final void LIZJ(String str2, String str3) {
                    InterfaceC824510WWb interfaceC824510WWb3 = interfaceC824510WWb2;
                    if (interfaceC824510WWb3 != null) {
                        interfaceC824510WWb3.LJFF(str2, str3, true);
                    }
                }

                @Override // X.InterfaceC1740440vOM
                public final void LIZLLL(String str2, String str3) {
                    InterfaceC824510WWb interfaceC824510WWb3 = interfaceC824510WWb2;
                    if (interfaceC824510WWb3 != null) {
                        interfaceC824510WWb3.LIZLLL(str2, str3, true);
                    }
                }
            };
        } else {
            ((Function2) awS291S0300000_13.l1).invoke(Boolean.FALSE, obj2);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS291S0300000_13(InterfaceC824510WWb interfaceC824510WWb, InterfaceC824510WWb interfaceC824510WWb2, Function2<? super Boolean, ? super String, Unit> function2, C013C c013c) {
        super(2);
        this.$t = c013c;
        this.l0 = interfaceC824510WWb;
        this.l1 = interfaceC824510WWb2;
        this.l2 = function2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AwS291S0300000_13(List list, List<EncryptedLoginMethod> list2, List<? extends BaseLoginMethod> list3, Function1<? super List<EncryptedLoginMethod>, Unit> function1) {
        super(2);
        this.$t = function1;
        this.l0 = list;
        this.l1 = list2;
        this.l2 = list3;
    }
}
