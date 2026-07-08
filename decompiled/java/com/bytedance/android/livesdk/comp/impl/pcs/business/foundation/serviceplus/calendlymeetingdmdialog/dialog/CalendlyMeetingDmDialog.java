package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeetingdmdialog.dialog;

import X.C019F;
import X.C01D1;
import X.C03H5;
import X.C092O;
import X.C0IJT;
import X.C0JJS;
import X.C0JJT;
import X.C0JJV;
import X.C0JJW;
import X.C0JJX;
import X.C0JJZ;
import X.C0JT6;
import X.C0KPJ;
import X.C0KQ5;
import X.C0ZP4;
import X.C1138704cr;
import X.C11H2;
import X.C11H6;
import X.C11H7;
import X.C11H9;
import X.C13LE;
import X.C1554960qZC;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1622206Wu;
import X.C1770850wBP;
import X.C19474211Gy;
import X.C19719912Dl;
import X.C20441214yg;
import X.C20736316Cj;
import X.C2095008Iq;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C338490DOt;
import X.C451460Hn6;
import X.C451620HnM;
import X.C451650HnP;
import X.C452070Ho5;
import X.C474500IjA;
import X.C489600JHy;
import X.C497740JfY;
import X.C500060JjI;
import X.C510160Jza;
import X.C723850SaN;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C987103tV;
import X.InterfaceC0148002o;
import X.InterfaceC1555100qZQ;
import X.InterfaceC1631620sYq;
import X.InterfaceC1631630sYr;
import X.InterfaceC1685420txc;
import X.InterfaceC1685430txd;
import X.InterfaceC2217241BqE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC724530SbT;
import X.InterfaceC724760Sbq;
import X.InterfaceC725050ScJ;
import X.InterfaceC736810SvH;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.comp.api.pcs.ui.loading.IPcsLoadingAbility;
import com.bytedance.android.livesdk.comp.api.pcs.ui.loading.PcsGenericLoadingVM;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.calendlymeetingdmdialog.viewmodel.CalendlyMeetingDmVM;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.ILiveHostSandbox;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class CalendlyMeetingDmDialog extends LiveSheetFragment implements InterfaceC724530SbT {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLL;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiLS4nISoiZzw2HELIOSOjMlKiojJDA/ZywyJCAiLSMqJSApPSY9LyEhLSYyJCorZys6KSkjLmEQKSkpJys/MQgpLDs6JiIIJAs6KSkjLg==";
    public final AssemVMLazy LLJLLL;
    public C0KQ5 LLJZ;
    public IPcsLoadingAbility LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CalendlyMeetingDmDialog.class, "vm", "getVm()Lcom/bytedance/android/livesdk/comp/impl/pcs/business/foundation/serviceplus/calendlymeetingdmdialog/viewmodel/CalendlyMeetingDmVM;", 0);
        C13LE.LIZ.getClass();
        LLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    public CalendlyMeetingDmDialog() {
        AssemVMLazy assemVMLazy;
        InterfaceC724760Sbq interfaceC724760Sbq = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(CalendlyMeetingDmVM.class);
        C0JJT c0jjt = new C0JJT(c19719912DlLIZ);
        C0JJZ c0jjz = new C0JJZ();
        if (Intrinsics.LJFF(interfaceC724760Sbq, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0jjt, new C452070Ho5(), new C1622206Wu(this, true), new C338490DOt(this, true), new C0JJV(this), c0jjz, new C451460Hn6(this, true), new C451620HnM(this, true), new C987103tV(this, true));
        } else if (interfaceC724760Sbq instanceof InterfaceC451590HnJ) {
            assemVMLazy = C451650HnP.LIZ(this, (InterfaceC451590HnJ) interfaceC724760Sbq, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0jjt, new C0JJW(this), c0jjz, null, null, null);
        } else {
            if (!Intrinsics.LJFF(interfaceC724760Sbq, interfaceC724760Sbq)) {
                throw new IllegalArgumentException("Do not support this scope here.");
            }
            assemVMLazy = new AssemVMLazy(C724750Sbp.LJIIJ(this, c19719912DlLIZ), c0jjt, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new C0JJX(this), c0jjz, new C451460Hn6(this, false), new C451620HnM(this, false), new C987103tV(this, false));
        }
        this.LLJLLL = assemVMLazy;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C500060JjI cS() {
        C500060JjI c500060JjI = new C500060JjI();
        c500060JjI.LIZJ = 1;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C510160Jza(C497740JfY.LJIJI(2131851497), R.style.a7h, new C092O() { // from class: X.0KQ4
            @Override // X.C092O
            public final void accept(Object obj) {
                final String str;
                long j;
                String str2;
                String str3;
                String str4;
                Context context = this.LIZ.getContext();
                if (context != null) {
                    this.LIZ.yS("click", "add");
                    C0KQ5 c0kq5US = this.LIZ.uS();
                    String str5 = "";
                    if (c0kq5US == null || (str = c0kq5US.LL) == null) {
                        str = "";
                    }
                    C0KQ5 c0kq5US2 = this.LIZ.uS();
                    long j2 = 0;
                    if (c0kq5US2 != null) {
                        j = c0kq5US2.LLILZ;
                    } else {
                        j = 0;
                    }
                    final long j3 = j * 1000;
                    C0KQ5 c0kq5US3 = this.LIZ.uS();
                    if (c0kq5US3 != null) {
                        j2 = c0kq5US3.LLILZIL;
                    }
                    final long j4 = j2 * 1000;
                    Object[] objArr = new Object[3];
                    C0KQ5 c0kq5US4 = this.LIZ.uS();
                    if (c0kq5US4 == null || (str2 = c0kq5US4.LL) == null) {
                        str2 = "";
                    }
                    objArr[0] = str2;
                    C0KQ5 c0kq5US5 = this.LIZ.uS();
                    if (c0kq5US5 == null || (str3 = c0kq5US5.LLILLJJLI) == null) {
                        str3 = "";
                    }
                    objArr[1] = str3;
                    C0KQ5 c0kq5US6 = this.LIZ.uS();
                    if (c0kq5US6 != null && (str4 = c0kq5US6.LLILZLL) != null) {
                        str5 = str4;
                    }
                    objArr[2] = str5;
                    final String strLJIJJ = C497740JfY.LJIJJ(2131851504, objArr);
                    Object obj2 = new Object(str, j3, j4, strLJIJJ) { // from class: X.0KQ7
                    };
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("buildInsertIntent, params: ");
                    sbLIZ.append(obj2);
                    C20441214yg.LIZIZ("CalendlyCalendarUtils", C2188811AlT.LIZIZ(sbLIZ));
                    Intent intent = new Intent("android.intent.action.INSERT");
                    intent.setData(CalendarContract.Events.CONTENT_URI);
                    intent.putExtra("title", str);
                    intent.putExtra("description", strLJIJJ);
                    intent.putExtra("beginTime", j3);
                    intent.putExtra("endTime", j4);
                    ((ILiveHostSandbox) C1161920gLG.LIZJ(ILiveHostSandbox.class)).appendDataFlowId(intent, 1207964929);
                    if (intent.resolveActivity(context.getPackageManager()) != null) {
                        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
                        C1701330uNH.LIZ(intent, context);
                        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0TNJrjFT+VGtwrDPgFrNfxjCwZSePE4qAkAHkvhoPDXzszdkRe7BLFK2FcFSkfC7J5KYFAWiynCiJtLNMvjq+yOz9+YqFgP9bhoUsbsFawUO466ZRFE8vDgFHWR2F", null));
                    }
                }
            }
        }));
        c500060JjI.LIZ(arrayList);
        return c500060JjI;
    }

    public final C0KQ5 uS() {
        if (this.LLJZ == null) {
            InterfaceC1555100qZQ interfaceC1555100qZQLIZIZ = C1554960qZC.LIZIZ(C1558360qeg.LJFF(this, null), "source_default_key", C0KQ5.class, null);
            this.LLJZ = interfaceC1555100qZQLIZIZ != null ? (C0KQ5) interfaceC1555100qZQLIZIZ.getSource() : null;
        }
        return this.LLJZ;
    }

    public final CalendlyMeetingDmVM wS() {
        AssemVMLazy assemVMLazy = this.LLJLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLL;
        return (CalendlyMeetingDmVM) assemVMLazy.getValue();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.fx1, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(12.0f);
        sheetOptions.draggable = false;
        sheetOptions.dimBehindType = 1;
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        String string2;
        long jLongValue;
        long jLongValue2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12;
        Long lLJIILIIL;
        String string13;
        Long lLJIILIIL2;
        String string14;
        Long lLJIILIIL3;
        super.onCreate(bundle);
        wS().LL = C1558360qeg.LJFF(this, null);
        InterfaceC665370Q7z interfaceC665370Q7zLJFF = C1558360qeg.LJFF(this, null);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("title")) == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("user_name")) == null) {
            string2 = "";
        }
        Bundle arguments3 = getArguments();
        long jLongValue3 = 0;
        if (arguments3 != null && (string14 = arguments3.getString("duration")) != null && (lLJIILIIL3 = C2095008Iq.LJIILIIL(string14)) != null) {
            jLongValue = lLJIILIIL3.longValue();
        } else {
            jLongValue = 0;
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null && (string13 = arguments4.getString("start_timestamp")) != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(string13)) != null) {
            jLongValue2 = lLJIILIIL2.longValue();
        } else {
            jLongValue2 = 0;
        }
        Bundle arguments5 = getArguments();
        if (arguments5 != null && (string12 = arguments5.getString("end_timestamp")) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(string12)) != null) {
            jLongValue3 = lLJIILIIL.longValue();
        }
        Bundle arguments6 = getArguments();
        if (arguments6 == null || (string3 = arguments6.getString("contact_number")) == null) {
            string3 = "";
        }
        Bundle arguments7 = getArguments();
        if (arguments7 == null || (string4 = arguments7.getString("email")) == null) {
            string4 = "";
        }
        Bundle arguments8 = getArguments();
        if (arguments8 == null || (string5 = arguments8.getString("event_id")) == null) {
            string5 = "";
        }
        Bundle arguments9 = getArguments();
        if (arguments9 == null || (string6 = arguments9.getString("from_user_id")) == null) {
            string6 = "";
        }
        Bundle arguments10 = getArguments();
        if (arguments10 == null || (string7 = arguments10.getString("to_user_id")) == null) {
            string7 = "";
        }
        Bundle arguments11 = getArguments();
        if (arguments11 == null || (string8 = arguments11.getString("user_type")) == null) {
            string8 = "";
        }
        Bundle arguments12 = getArguments();
        if (arguments12 == null || (string9 = arguments12.getString("sku_id")) == null) {
            string9 = "";
        }
        Bundle arguments13 = getArguments();
        if (arguments13 == null || (string10 = arguments13.getString("event_template_id")) == null) {
            string10 = "";
        }
        Bundle arguments14 = getArguments();
        if (arguments14 != null && (string11 = arguments14.getString("show_entrance")) != null) {
            str = string11;
        }
        C1554960qZC.LIZ(interfaceC665370Q7zLJFF, new C0KQ5(string, string2, jLongValue, jLongValue2, jLongValue3, string3, string4, string5, string6, string7, string8, string9, string10, str), C0KQ5.class, "source_default_key");
        wS();
        hashCode();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LiveIconView liveIconView;
        View viewFindViewById;
        super.onViewCreated(view, bundle);
        View view2 = getView();
        PcsGenericLoadingVM pcsGenericLoadingVMDj1 = null;
        if (view2 != null && (viewFindViewById = view2.findViewById(R.id.cdn)) != null) {
            viewFindViewById.setBackgroundColor(C20736316Cj.LIZIZ(R.attr.ezl, getContext()));
        }
        View view3 = getView();
        if (view3 != null && (liveIconView = (LiveIconView) view3.findViewById(R.id.ltj)) != null) {
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0JJU
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    this.LL.yS("click", "close");
                    this.LL.close(1);
                }
            });
        }
        C723850SaN.LIZ(this, false, null, new C1138704cr(this), 3);
        IPcsLoadingAbility iPcsLoadingAbility = (IPcsLoadingAbility) C1558520qew.LIZ(C1558360qeg.LJFF(this, null), IPcsLoadingAbility.class, null);
        if (iPcsLoadingAbility != null) {
            pcsGenericLoadingVMDj1 = iPcsLoadingAbility.dj1(C489600JHy.LIZ, false);
        }
        this.LLJZIJLIL = pcsGenericLoadingVMDj1;
        C736680Sv4.LJIIIIZZ(this, wS(), new C2217381BqS() { // from class: X.0JJa
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C489890JJb) obj).LL;
            }
        }, null, new C0JJS(this), 6);
        yS("show", "");
    }

    public final void yS(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_service_plus_calendly_booking_card_detail_page");
        C0KQ5 c0kq5US = uS();
        String str12 = null;
        if (c0kq5US != null) {
            str3 = c0kq5US.LLJ;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "from_user_id");
        C0KQ5 c0kq5US2 = uS();
        if (c0kq5US2 != null) {
            str12 = c0kq5US2.LLJI;
        }
        c474500IjALIZ.LJJII(str12, "to_user_id");
        String strValueOf = String.valueOf(currentUserId);
        C0KQ5 c0kq5US3 = uS();
        String str13 = "";
        if (c0kq5US3 == null || (str4 = c0kq5US3.LLJ) == null) {
            str4 = "";
        }
        if (Intrinsics.LJFF(strValueOf, str4)) {
            str5 = "audience";
        } else {
            str5 = "anchor";
        }
        c474500IjALIZ.LJJII(str5, "user_type");
        C0KQ5 c0kq5US4 = uS();
        String str14 = CardStruct.IStatusCode.DEFAULT;
        if (c0kq5US4 == null || (str6 = c0kq5US4.LLJILJIL) == null) {
            str6 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str6, "sku_id");
        C0KQ5 c0kq5US5 = uS();
        if (c0kq5US5 == null || (str7 = c0kq5US5.LLJILJILJ) == null) {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str7, "event_template_id");
        if (str.length() > 0) {
            c474500IjALIZ.LJJII(str, "action_type");
        }
        if (str2.length() > 0) {
            c474500IjALIZ.LJJII(str2, "click_position");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        C0KQ5 c0kq5US6 = uS();
        if (c0kq5US6 == null || (str8 = c0kq5US6.LLJ) == null) {
            str8 = "";
        }
        sbLIZ.append(str8);
        sbLIZ.append('_');
        C0KQ5 c0kq5US7 = uS();
        if (c0kq5US7 != null && (str11 = c0kq5US7.LLJI) != null) {
            str13 = str11;
        }
        sbLIZ.append(str13);
        sbLIZ.append('_');
        C0KQ5 c0kq5US8 = uS();
        if (c0kq5US8 == null || (str9 = c0kq5US8.LLJILJIL) == null) {
            str9 = CardStruct.IStatusCode.DEFAULT;
        }
        sbLIZ.append(str9);
        sbLIZ.append('_');
        C0KQ5 c0kq5US9 = uS();
        if (c0kq5US9 == null || (str10 = c0kq5US9.LLJILJILJ) == null) {
            str10 = CardStruct.IStatusCode.DEFAULT;
        }
        sbLIZ.append(str10);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("hasBeenInsertedMapKey: ");
        sbLIZ2.append(strLIZIZ);
        C20441214yg.LIZIZ("CalendlyMeetingDmDialog", C2188811AlT.LIZIZ(sbLIZ2));
        C0JT6<Map<String, Boolean>> c0jt6 = C0KPJ.vf;
        Map<String, Boolean> mapLIZ = c0jt6.LIZ();
        if (mapLIZ == null) {
            mapLIZ = C2097608Jq.LJ();
        }
        Boolean bool = mapLIZ.get(strLIZIZ);
        Boolean bool2 = Boolean.TRUE;
        boolean zLJFF = Intrinsics.LJFF(bool, bool2);
        if (Intrinsics.LJFF(str, "show") || (Intrinsics.LJFF(str, "click") && (Intrinsics.LJFF(str2, "add") || Intrinsics.LJFF(str2, "close")))) {
            if (zLJFF) {
                str14 = "1";
            }
            c474500IjALIZ.LJJII(str14, "has_clicked");
        }
        if (Intrinsics.LJFF(str, "click") && Intrinsics.LJFF(str2, "add")) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapLIZ);
            linkedHashMap.put(strLIZIZ, bool2);
            c0jt6.LIZJ(linkedHashMap);
        }
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g_7, viewGroup, false);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
