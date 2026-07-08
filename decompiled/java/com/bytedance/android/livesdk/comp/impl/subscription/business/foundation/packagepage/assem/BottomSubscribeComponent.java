package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem;

import X.C019F;
import X.C0HZQ;
import X.C0KGE;
import X.C0KGU;
import X.C0KGY;
import X.C0KHK;
import X.C0KI4;
import X.C13LE;
import X.C1554960qZC;
import X.C1558520qew;
import X.C1637806bA;
import X.C16F5;
import X.C16FS;
import X.C19719912Dl;
import X.C2217381BqS;
import X.C259800zU;
import X.C497740JfY;
import X.C513680KCo;
import X.C513700KCq;
import X.C514840KHa;
import X.C515350KIz;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem.BottomSubscribeComponent;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.SubPackagePageAssemVM;
import com.bytedance.android.livesdk.livesetting.subscription.LiveGiftSubTermsCheckboxSetting;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: loaded from: classes8.dex */
public final class BottomSubscribeComponent extends UISlotAssem {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJLIL;
    public final AssemVMLazy LLJJI;
    public C513700KCq LLJJIII;
    public ViewGroup LLJJIJI;
    public C16FS LLJJIJIIJIL;
    public C0HZQ LLJJIJIL;
    public C16F5 LLJJJ;
    public ViewGroup LLJJJIL;
    public boolean LLJJJJ;
    public long LLJJJJJIL;
    public long LLJJJJLIIL;
    public Boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public ObjectAnimator LLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(BottomSubscribeComponent.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/foundation/packagepage/viewmodel/SubPackagePageAssemVM;", 0);
        C13LE.LIZ.getClass();
        LLJLIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public BottomSubscribeComponent() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(SubPackagePageAssemVM.class);
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C0KHK(c19719912DlLIZ), new C515350KIz(), null, true);
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.hna;
    }

    public final C513700KCq ip() {
        if (this.LLJJIII == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558520qew.LJIIL(this), "source_default_key", C513700KCq.class, null);
            this.LLJJIII = interfaceC1555100qZQLIZIZ != null ? (C513700KCq) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJJIII;
    }

    public final SubPackagePageAssemVM kp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJLIL;
        return (SubPackagePageAssemVM) assemVMLazy.getValue();
    }

    public final C513680KCo hp() {
        C513700KCq c513700KCqIp = ip();
        if (c513700KCqIp != null) {
            return c513700KCqIp.LLILLJJLI;
        }
        return null;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        ObjectAnimator objectAnimator = this.LLJL;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            objectAnimator.removeAllListeners();
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [T, X.0KGY] */
    /* JADX WARN: Type inference failed for: r0v16, types: [T, X.0KI4] */
    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        this.LLJJIJI = (ViewGroup) view.findViewById(R.id.why);
        this.LLJJIJIIJIL = (C16FS) view.findViewById(R.id.whz);
        this.LLJJIJIL = (C0HZQ) view.findViewById(R.id.wgw);
        this.LLJJJ = (C16F5) view.findViewById(R.id.wgx);
        this.LLJJJIL = (ViewGroup) view.findViewById(R.id.xj2);
        final C16FS c16fs = this.LLJJIJIIJIL;
        if (c16fs != null) {
            c16fs.setRadius((int) C497740JfY.LIZIZ(8.0f));
            C786410Ut5.h8(c16fs, new View.OnClickListener() { // from class: X.0KGD
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Map linkedHashMap;
                    String str;
                    String str2;
                    long j;
                    String str3;
                    String str4;
                    String str5;
                    String str6;
                    String str7;
                    C513670KCn c513670KCn;
                    BottomSubscribeComponent bottomSubscribeComponent = this.LL;
                    SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo = (SubscriptionProductDetailWithTemplateInfo) bottomSubscribeComponent.withState(bottomSubscribeComponent.kp(), new C514990KHp());
                    if (subscriptionProductDetailWithTemplateInfo == null) {
                        return;
                    }
                    C513700KCq c513700KCqIp = this.LL.ip();
                    if (c513700KCqIp == null || (linkedHashMap = c513700KCqIp.LLILZIL) == null) {
                        linkedHashMap = new LinkedHashMap();
                    }
                    C513680KCo c513680KCoHp = this.LL.hp();
                    String str8 = null;
                    if (c513680KCoHp != null) {
                        str = c513680KCoHp.LJI;
                    } else {
                        str = null;
                    }
                    TemplateInfo templateInfo = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                    BottomSubscribeComponent bottomSubscribeComponent2 = this.LL;
                    boolean z = bottomSubscribeComponent2.LLJJJJ;
                    C513680KCo c513680KCoHp2 = bottomSubscribeComponent2.hp();
                    if (c513680KCoHp2 != null) {
                        str2 = c513680KCoHp2.LJIIJJI;
                    } else {
                        str2 = null;
                    }
                    C0KDR.LJIIJ(str, linkedHashMap, templateInfo, z, str2);
                    boolean zBooleanValue = false;
                    if (!this.LL.LLJJJJ) {
                        C766270U4b.LIZLLL(2131854934);
                        LiveGiftSubTermsCheckboxSetting liveGiftSubTermsCheckboxSetting = LiveGiftSubTermsCheckboxSetting.INSTANCE;
                        if (liveGiftSubTermsCheckboxSetting.getValue() == liveGiftSubTermsCheckboxSetting.getSHAKE()) {
                            BottomSubscribeComponent bottomSubscribeComponent3 = this.LL;
                            bottomSubscribeComponent3.getClass();
                            float fLIZIZ = (int) C497740JfY.LIZIZ(12.0f);
                            float f = -fLIZIZ;
                            bottomSubscribeComponent3.LLJL = ObjectAnimator.ofFloat(bottomSubscribeComponent3.LLJJJIL, "translationX", 0.0f, f, fLIZIZ, f, fLIZIZ, 0.0f).setDuration(200L);
                            ObjectAnimator objectAnimator = bottomSubscribeComponent3.LLJL;
                            if (objectAnimator != null) {
                                C786410Ut5.Pd(objectAnimator);
                            }
                            C0KEG.LIZ(bottomSubscribeComponent3.getContext());
                            return;
                        }
                        return;
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C513700KCq c513700KCqIp2 = this.LL.ip();
                    if (c513700KCqIp2 != null && (c513670KCn = c513700KCqIp2.LLILLL) != null) {
                        j = c513670KCn.LJIIJJI;
                    } else {
                        C513700KCq c513700KCqIp3 = this.LL.ip();
                        if (c513700KCqIp3 != null) {
                            j = c513700KCqIp3.LLJILJIL;
                        } else {
                            j = 0;
                        }
                    }
                    long j2 = jCurrentTimeMillis - j;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LL.LLJJJJJIL;
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    BottomSubscribeComponent bottomSubscribeComponent4 = this.LL;
                    long j3 = jCurrentTimeMillis3 - bottomSubscribeComponent4.LLJJJJLIIL;
                    C513680KCo c513680KCoHp3 = bottomSubscribeComponent4.hp();
                    if (c513680KCoHp3 != null) {
                        str3 = c513680KCoHp3.LJI;
                    } else {
                        str3 = null;
                    }
                    TemplateInfo templateInfo2 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                    Boolean bool = this.LL.LLJJL;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    }
                    C513680KCo c513680KCoHp4 = this.LL.hp();
                    if (c513680KCoHp4 != null) {
                        str8 = c513680KCoHp4.LJIIJJI;
                    }
                    C0KDR.LJIIJJI(str3, linkedHashMap, templateInfo2, j2, j3, zBooleanValue, jCurrentTimeMillis2, str8);
                    BottomSubscribeComponent bottomSubscribeComponent5 = this.LL;
                    bottomSubscribeComponent5.getClass();
                    bottomSubscribeComponent5.kp().setState(new C0KHX(C0KGF.LIZ(bottomSubscribeComponent5.kp().getState(), null, null, null, null, null, EnumC513810KDb.PAY_INPROGRESS, null, 447)));
                    C513680KCo c513680KCoHp5 = this.LL.hp();
                    if (c513680KCoHp5 != null && (str7 = c513680KCoHp5.LJIIJJI) != null) {
                        linkedHashMap.put("group_id", str7);
                    }
                    SubPackagePageAssemVM subPackagePageAssemVMKp = this.LL.kp();
                    Context context = c16fs.getContext();
                    C513680KCo c513680KCoHp6 = this.LL.hp();
                    String str9 = "";
                    if (c513680KCoHp6 == null || (str4 = c513680KCoHp6.LIZIZ) == null) {
                        str4 = "";
                    }
                    C513680KCo c513680KCoHp7 = this.LL.hp();
                    if (c513680KCoHp7 == null || (str5 = c513680KCoHp7.LJFF) == null) {
                        str5 = "";
                    }
                    this.LL.getClass();
                    C513680KCo c513680KCoHp8 = this.LL.hp();
                    if (c513680KCoHp8 != null && (str6 = c513680KCoHp8.LJIIJ) != null) {
                        str9 = str6;
                    }
                    EnumC513390KBl enumC513390KBl = EnumC513390KBl.PACKAGE_PAGE;
                    final C514970KHn c514970KHn = new C514970KHn(subPackagePageAssemVMKp);
                    C0KJJ.LIZIZ(subPackagePageAssemVMKp.LLILZ, context, subscriptionProductDetailWithTemplateInfo, str4, str5, new C0KMQ() { // from class: X.0KIS
                        @Override // X.C0KMQ
                        public final void onFail(int i, String str10) {
                            c514970KHn.invoke(new C0KIP("", "", i, str10));
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Subscribe Pay Error Code: ");
                            sbLIZ.append(i);
                            C20441214yg.LIZIZ("SubPackageNative", C2188811AlT.LIZIZ(sbLIZ));
                        }

                        @Override // X.C0KMQ
                        public final void LIZ(C0KJK c0kjk, String str10, String str11, C515420KJg c515420KJg) {
                            String str12;
                            SubscribeBadge subscribeBadge;
                            Function1<C0KIP, Unit> function1 = c514970KHn;
                            if (c0kjk == null || (str12 = c0kjk.LJI) == null) {
                                str12 = "";
                            }
                            function1.invoke(new C0KIP(str12, str10, 1, str11));
                            String str13 = null;
                            if (c515420KJg != null) {
                                subscribeBadge = c515420KJg.LIZ;
                            } else {
                                subscribeBadge = null;
                            }
                            C0KIT.LIZ(c0kjk, subscribeBadge);
                            if (c515420KJg != null) {
                                str13 = c515420KJg.LIZIZ;
                            }
                            C0KIT.LIZIZ(str13);
                        }
                    }, linkedHashMap, str9, false, enumC513390KBl, false, 3328);
                }
            });
        }
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0KIB
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0KGF) obj).LLILLJJLI;
            }
        }, null, new C514840KHa(this), 6);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0KIG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0KGF) obj).LLILZIL;
            }
        }, null, new C0KGE(this), 6);
        C259800zU c259800zU = new C259800zU();
        C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = new C0KGY(this, c259800zU);
        c259800zU.element = new C0KI4(c259800zU2);
        C736680Sv4.LJIIIIZZ(this, kp(), new C2217381BqS() { // from class: X.0KII
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C0KGF) obj).LLIZ;
            }
        }, null, new C0KGU(this, c259800zU2), 6);
    }
}
