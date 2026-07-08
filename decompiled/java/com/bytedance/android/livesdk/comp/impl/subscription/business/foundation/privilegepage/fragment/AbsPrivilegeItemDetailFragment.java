package com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment;

import X.AbstractC510000JzK;
import X.C019F;
import X.C01D1;
import X.C06KE;
import X.C092O;
import X.C0IJT;
import X.C1119170fEJ;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1622206Wu;
import X.C16F5;
import X.C19719912Dl;
import X.C20736316Cj;
import X.C2097608Jq;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C474500IjA;
import X.C497740JfY;
import X.C500060JjI;
import X.C500260Jjc;
import X.C509370JyJ;
import X.C509400JyM;
import X.C509420JyO;
import X.C509430JyP;
import X.C509440JyQ;
import X.C509450JyR;
import X.C510070JzR;
import X.C510160Jza;
import X.C512300K7g;
import X.C724750Sbp;
import X.C758170Tod;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC1555100qZQ;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC724760Sbq;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.AbsPrivilegeItemDetailFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.viewmodel.PrivilegeDetailItemAssemViewModel;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.GetSubPrivilegeDetailResponse;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AbsPrivilegeItemDetailFragment extends LiveSheetFragment {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public boolean LLJLLL;
    public GetSubPrivilegeDetailResponse.Data LLJZ;
    public boolean LLJZIJLIL;
    public C16F5 LLL;
    public final AssemVMLazy LLLF;
    public C509400JyM LLLFF;
    public final C509370JyJ LLLFFI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AbsPrivilegeItemDetailFragment.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/subscription/business/foundation/privilegepage/viewmodel/PrivilegeDetailItemAssemViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public abstract String getTitle();

    public abstract String uS(AbstractC510000JzK abstractC510000JzK);

    public abstract String wS();

    public abstract void zS();

    public AbsPrivilegeItemDetailFragment() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(PrivilegeDetailItemAssemViewModel.class);
        C06KE c06ke = new C06KE(c19719912DlLIZ);
        C509450JyR c509450JyR = new C509450JyR();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c06ke, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C509420JyO(this), c509450JyR, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c06ke, new C509430JyP(this), c509450JyR, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c06ke, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C509440JyQ(this), c509450JyR, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLLF = assemVMLazy;
        this.LLLFFI = new C509370JyJ(this);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String title = getTitle();
        spannableStringBuilder.append((CharSequence) title);
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ezq, getContext())), 0, title.length(), 33);
        c1119170fEJ.LIZ(spannableStringBuilder);
        C758170Tod c758170Tod = new C758170Tod(R.attr.d32, new View.OnClickListener() { // from class: X.0JyL
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                this.LL.close(1);
                IActionHandlerService iActionHandlerService = (IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class);
                Context context = this.LL.getContext();
                C509400JyM c509400JyMYS = this.LL.yS();
                if (c509400JyMYS != null) {
                    str = c509400JyMYS.LLILZIL;
                } else {
                    str = null;
                }
                iActionHandlerService.handle(context, str);
            }
        });
        c758170Tod.LIZLLL = C20736316Cj.LIZIZ(R.attr.ezq, getContext());
        c758170Tod.LJ = true;
        c1119170fEJ.LJ = Collections.singletonList(c758170Tod);
        c1119170fEJ.LJI = false;
        return c1119170fEJ;
    }

    public final C509400JyM yS() {
        if (this.LLLFF == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C509400JyM.class, null);
            this.LLLFF = interfaceC1555100qZQLIZIZ != null ? (C509400JyM) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLLFF;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C509400JyM c509400JyMYS = yS();
        if (c509400JyMYS != null && c509400JyMYS.LLIZ) {
            return null;
        }
        C509400JyM c509400JyMYS2 = yS();
        if (c509400JyMYS2 != null && c509400JyMYS2.LLJI) {
            return null;
        }
        C500060JjI c500060JjI = new C500060JjI();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C510160Jza(C497740JfY.LJIJI(2131844418), R.style.a7h, new C092O() { // from class: X.0JyK
            @Override // X.C092O
            public final void accept(Object obj) {
                String str;
                String str2;
                String str3;
                String str4;
                C509400JyM c509400JyMYS3 = this.LIZ.yS();
                if (c509400JyMYS3 != null && !c509400JyMYS3.LLIZLLLIL) {
                    AbsPrivilegeItemDetailFragment absPrivilegeItemDetailFragment = this.LIZ;
                    if (!absPrivilegeItemDetailFragment.LLJZIJLIL) {
                        if (absPrivilegeItemDetailFragment.LLJZ != null) {
                            C509400JyM c509400JyMYS4 = absPrivilegeItemDetailFragment.yS();
                            String str5 = "";
                            if (c509400JyMYS4 == null || (str = c509400JyMYS4.LL) == null) {
                                str = "";
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            C509400JyM c509400JyMYS5 = absPrivilegeItemDetailFragment.yS();
                            if (c509400JyMYS5 == null || (str2 = c509400JyMYS5.LLILLL) == null) {
                                str2 = "";
                            }
                            linkedHashMap.put("show_entrance", str2);
                            C509400JyM c509400JyMYS6 = absPrivilegeItemDetailFragment.yS();
                            if (c509400JyMYS6 == null || (str3 = c509400JyMYS6.LLILZ) == null) {
                                str3 = "";
                            }
                            linkedHashMap.put("package_id", str3);
                            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(absPrivilegeItemDetailFragment.getContext(), C508940Jxc.LIZLLL(str, linkedHashMap));
                            absPrivilegeItemDetailFragment.close(1);
                            String strWS = absPrivilegeItemDetailFragment.wS();
                            C509400JyM c509400JyMYS7 = absPrivilegeItemDetailFragment.yS();
                            if (c509400JyMYS7 != null && (str4 = c509400JyMYS7.LLILLL) != null) {
                                str5 = str4;
                            }
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_privilege_sub_page_click");
                            c474500IjALIZ.LJJII(strWS, "page_type");
                            c474500IjALIZ.LJJII(str5, "show_entrance");
                            c474500IjALIZ.LJIL();
                            c474500IjALIZ.LIZ();
                            return;
                        }
                        return;
                    }
                }
                C509400JyM c509400JyMYS8 = this.LIZ.yS();
                if (c509400JyMYS8 == null || !c509400JyMYS8.LLIZLLLIL) {
                    return;
                }
                C766270U4b.LIZLLL(2131849256);
            }
        }));
        c500060JjI.LIZ(arrayList);
        return c500060JjI;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        AssemVMLazy assemVMLazy = this.LLLF;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFZ;
        ((PrivilegeDetailItemAssemViewModel) assemVMLazy.getValue()).LL = null;
    }

    public final void BS(CharSequence charSequence) {
        TextView textView;
        View view = getView();
        if (view != null) {
            textView = (TextView) view.findViewById(R.id.cdm);
        } else {
            textView = null;
        }
        if (charSequence.length() == 0) {
            if (textView != null) {
                C500260Jjc.LJIILIIL(textView);
            }
        } else if (textView != null) {
            C500260Jjc.LLFFF(textView);
            textView.setTextColor(C20736316Cj.LIZJ(R.attr.ezs, getView()));
            textView.setTextAlignment(4);
            textView.setText(charSequence);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.ezk, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(2, null);
        sheetOptions.dimBehindType = 1;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1554960qZC.LIZ(C1558360qeg.LJFF(this, null), new C509400JyM(), C509400JyM.class, "source_default_key");
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean zBooleanValue;
        Boolean boolLIZ;
        String string;
        boolean zBooleanValue2;
        Boolean boolLIZ2;
        boolean zBooleanValue3;
        Boolean boolLIZ3;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        C509400JyM c509400JyMYS = yS();
        String str5 = "";
        if (c509400JyMYS != null) {
            Bundle arguments = getArguments();
            if (arguments == null || (string7 = arguments.getString("room_id")) == null) {
                string7 = "";
            }
            c509400JyMYS.LLILLJJLI = string7;
        }
        C509400JyM c509400JyMYS2 = yS();
        if (c509400JyMYS2 != null) {
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (string6 = arguments2.getString("sec_user_id")) == null) {
                string6 = "";
            }
            c509400JyMYS2.LL = string6;
        }
        C509400JyM c509400JyMYS3 = yS();
        if (c509400JyMYS3 != null) {
            Bundle arguments3 = getArguments();
            if (arguments3 == null || (string5 = arguments3.getString("package_id")) == null) {
                string5 = "";
            }
            c509400JyMYS3.LLILZ = string5;
        }
        C509400JyM c509400JyMYS4 = yS();
        if (c509400JyMYS4 != null) {
            Bundle arguments4 = getArguments();
            if (arguments4 == null || (string4 = arguments4.getString("show_entrance")) == null) {
                string4 = "";
            }
            c509400JyMYS4.LLILLL = string4;
        }
        C509400JyM c509400JyMYS5 = yS();
        if (c509400JyMYS5 != null) {
            Bundle arguments5 = getArguments();
            if (arguments5 == null || (string3 = arguments5.getString("back_url")) == null) {
                string3 = "";
            }
            c509400JyMYS5.LLILZIL = string3;
        }
        C509400JyM c509400JyMYS6 = yS();
        if (c509400JyMYS6 != null) {
            Bundle arguments6 = getArguments();
            if (arguments6 == null || (string2 = arguments6.getString("creator_id")) == null) {
                string2 = "";
            }
            c509400JyMYS6.LLILZLL = string2;
        }
        C509400JyM c509400JyMYS7 = yS();
        if (c509400JyMYS7 != null) {
            Bundle arguments7 = getArguments();
            if (arguments7 != null && (boolLIZ3 = C512300K7g.LIZ(arguments7, "is_subscribing", null)) != null) {
                zBooleanValue3 = boolLIZ3.booleanValue();
            } else {
                zBooleanValue3 = false;
            }
            c509400JyMYS7.LLIZ = zBooleanValue3;
        }
        C509400JyM c509400JyMYS8 = yS();
        if (c509400JyMYS8 != null) {
            Bundle arguments8 = getArguments();
            if (arguments8 != null && (boolLIZ2 = C512300K7g.LIZ(arguments8, "preview_mode", null)) != null) {
                zBooleanValue2 = boolLIZ2.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            c509400JyMYS8.LLIZLLLIL = zBooleanValue2;
        }
        C509400JyM c509400JyMYS9 = yS();
        if (c509400JyMYS9 != null) {
            Bundle arguments9 = getArguments();
            if (arguments9 == null || (string = arguments9.getString("package_price")) == null) {
                string = "";
            }
            c509400JyMYS9.LLJ = string;
        }
        C509400JyM c509400JyMYS10 = yS();
        if (c509400JyMYS10 != null) {
            Bundle arguments10 = getArguments();
            if (arguments10 != null && (boolLIZ = C512300K7g.LIZ(arguments10, "hide_bottom_button", null)) != null) {
                zBooleanValue = boolLIZ.booleanValue();
            } else {
                zBooleanValue = false;
            }
            c509400JyMYS10.LLJI = zBooleanValue;
        }
        super.onViewCreated(view, bundle);
        AssemVMLazy assemVMLazy = this.LLLF;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLFZ;
        ((PrivilegeDetailItemAssemViewModel) assemVMLazy.getValue()).LL = this.LLLFFI;
        PrivilegeDetailItemAssemViewModel privilegeDetailItemAssemViewModel = (PrivilegeDetailItemAssemViewModel) this.LLLF.getValue();
        C509400JyM c509400JyMYS11 = yS();
        if (c509400JyMYS11 == null || (str = c509400JyMYS11.LL) == null) {
            str = "";
        }
        C509400JyM c509400JyMYS12 = yS();
        if (c509400JyMYS12 == null || (str2 = c509400JyMYS12.LLILLJJLI) == null) {
            str2 = "";
        }
        C509400JyM c509400JyMYS13 = yS();
        if (c509400JyMYS13 == null || (str3 = c509400JyMYS13.LLILLL) == null) {
            str3 = "";
        }
        C510070JzR.LIZ(str, this).LIZ(str2, true, str3, false, privilegeDetailItemAssemViewModel.LLILLJJLI, C2097608Jq.LJ(), 0L);
        zS();
        String strWS = wS();
        C509400JyM c509400JyMYS14 = yS();
        if (c509400JyMYS14 != null && (str4 = c509400JyMYS14.LLILLL) != null) {
            str5 = str4;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_privilege_sub_page_show");
        c474500IjALIZ.LJJII(strWS, "page_type");
        c474500IjALIZ.LJJII(str5, "show_entrance");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hiz, viewGroup, false);
    }
}
