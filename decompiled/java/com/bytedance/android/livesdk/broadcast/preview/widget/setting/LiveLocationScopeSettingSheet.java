package com.bytedance.android.livesdk.broadcast.preview.widget.setting;

import X.AbstractC1098790ehR;
import X.C0IJT;
import X.C0PEM;
import X.C0UKZ;
import X.C1119170fEJ;
import X.C1119920fFW;
import X.C1161920gLG;
import X.C11NZ;
import X.C11S5;
import X.C16F5;
import X.C1749280vcc;
import X.C1841350y17;
import X.C1DFH;
import X.C20736316Cj;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C474500IjA;
import X.C475510Ikn;
import X.C480460Ism;
import X.C497740JfY;
import X.C500260Jjc;
import X.C752110Ter;
import X.C752790Tfx;
import X.C758170Tod;
import X.C766270U4b;
import X.C786410Ut5;
import Y.AUListenerS262S0100000_12;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveLocationScopeSettingSheet;
import com.bytedance.android.livesdk.dataChannel.LocationSwitchType;
import com.bytedance.android.livesdk.livesetting.broadcast.HostAddLocationDistanceConfigSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.HostAddLocationSetting;
import com.bytedance.android.livesdk.location.LocationSettingsAPI;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import tikcast.api.anchor.AnchorLocationSettingsUpdateRequest;
import tikcast.api.anchor.AnchorLocationSettingsUpdateResponse;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveLocationScopeSettingSheet extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KjcjKCswKTY4Zz8hLTMlLDHELIOSh9PywoLionZjYpPTs6JiJiBSYlLQkjKi4nISoiGiw8OCAfLDsnISsrGic2LTE=";
    public int LLJLLL;
    public int LLJZ;
    public C1841350y17 LLJZIJLIL;
    public C1841350y17 LLL;
    public C1841350y17 LLLF;
    public ViewGroup LLLFFI;
    public ViewGroup LLLFZ;
    public ViewGroup LLLI;
    public ViewGroup LLLII;
    public C1749280vcc LLLIIII;
    public ViewGroup LLLIIIIL;
    public C16F5 LLLIIIL;
    public C16F5 LLLIIL;
    public ValueAnimator LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public final AwS591S0100000_12 LLLFF = new AwS591S0100000_12(this, 407);
    public String LLLILZJ = "";
    public String LLLILZLLLI = "";

    public final void BS() {
        C500260Jjc.LLFFF(this.LLLIIIIL);
        C500260Jjc.LJIILIIL(this.LLLIIIL);
        C500260Jjc.LLFFF(this.LLLIIL);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 4);
        valueAnimatorOfInt.setDuration(1200L);
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setRepeatMode(1);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS262S0100000_12(this, 19));
        this.LLLIILIL = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131854903));
        c1119170fEJ.LJI = false;
        if (this.LLLIL) {
            ArrayList arrayList = new ArrayList();
            C758170Tod c758170TodVR = VR();
            if (c758170TodVR != null) {
                arrayList.add(c758170TodVR);
            }
            c1119170fEJ.LJ = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        C758170Tod c758170TodUR = UR();
        if (c758170TodUR != null) {
            arrayList2.add(c758170TodUR);
        }
        c1119170fEJ.LJFF = arrayList2;
        return c1119170fEJ;
    }

    public final void uS() {
        if (!((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).yU0()) {
            ES(((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Pm2(), ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Fq1());
            return;
        }
        C500260Jjc.LJIILLIIL(this.LLLII);
        C500260Jjc.LLFFF(this.LLLIIII);
        C1749280vcc c1749280vcc = this.LLLIIII;
        if (c1749280vcc != null) {
            c1749280vcc.LJ();
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C752110Ter(this, null), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        ValueAnimator valueAnimator = this.LLLIILIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).IG2(this.LLJZ);
        if (this.LLJZ != this.LLJLLL) {
            C480460Ism.LIZ().getClass();
            LocationSettingsAPI locationSettingsAPI = (LocationSettingsAPI) C480460Ism.LIZLLL(LocationSettingsAPI.class);
            AnchorLocationSettingsUpdateRequest anchorLocationSettingsUpdateRequest = new AnchorLocationSettingsUpdateRequest();
            anchorLocationSettingsUpdateRequest.f91switch = this.LLJZ;
            C11NZ<AnchorLocationSettingsUpdateResponse> c11nzUpdateLocationSettings = locationSettingsAPI.updateLocationSettings(anchorLocationSettingsUpdateRequest);
            if (c11nzUpdateLocationSettings != null) {
                c11nzUpdateLocationSettings.LJL(C11S5.LIZ()).LJJLJ();
            }
            DataChannel dataChannelLJ = C475510Ikn.LJ(this);
            if (dataChannelLJ != null) {
                dataChannelLJ.zW(LocationSwitchType.class, Integer.valueOf(this.LLJZ));
            }
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_location_setting_granularity");
        c474500IjALIZ.LJIJJLI(C475510Ikn.LJ(this));
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLJZ), "result");
        c474500IjALIZ.LJJII(this.LLLILZJ, "enter_from");
        c474500IjALIZ.LJJII(this.LLLILZLLLI, "enter_method");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.ezn, context);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(0, null);
        if (this.LLLILZ) {
            sheetOptions.dimBehindType = 1;
        }
        return sheetOptions;
    }

    public final boolean wS(int i) {
        boolean zIsLocationPermissionGranted;
        Context context = getContext();
        if (context == null) {
            return false;
        }
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null) {
            zIsLocationPermissionGranted = iHostAppContext.isLocationPermissionGranted(context);
        } else {
            zIsLocationPermissionGranted = false;
        }
        if (zIsLocationPermissionGranted) {
            String strFq1 = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Fq1();
            if (strFq1.length() == 0) {
                BS();
                return false;
            }
            zS(strFq1);
            return false;
        }
        yS(Integer.valueOf(i));
        return true;
    }

    public final void yS(Integer num) {
        C500260Jjc.LJIILIIL(this.LLLIIII);
        C500260Jjc.LLFFF(this.LLLII);
        C1841350y17 c1841350y17 = this.LLJZIJLIL;
        if (c1841350y17 != null) {
            c1841350y17.setChecked(true);
        }
        C500260Jjc.LJIILIIL(this.LLLIIIIL);
        if (getContext() != null) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C752790Tfx(this, num, null), 2);
        }
    }

    public final void zS(String str) {
        C500260Jjc.LLFFF(this.LLLIIIIL);
        C16F5 c16f5 = this.LLLIIL;
        if (c16f5 != null) {
            C500260Jjc.LJIILIIL(c16f5);
        }
        ValueAnimator valueAnimator = this.LLLIILIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C16F5 c16f52 = this.LLLIIIL;
        if (c16f52 != null) {
            C500260Jjc.LLFFF(c16f52);
        }
        C16F5 c16f53 = this.LLLIIIL;
        if (c16f53 != null) {
            c16f53.setText(C497740JfY.LJIJJ(2131854895, str));
        }
    }

    public final void ES(int i, String str) {
        C500260Jjc.LJIILIIL(this.LLLIIII);
        C500260Jjc.LLFFF(this.LLLII);
        this.LLJLLL = i;
        this.LLJZ = i;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    C1841350y17 c1841350y17 = this.LLJZIJLIL;
                    if (c1841350y17 != null) {
                        c1841350y17.setChecked(true);
                    }
                    C500260Jjc.LJIILIIL(this.LLLIIIIL);
                    return;
                }
                C1841350y17 c1841350y172 = this.LLLF;
                if (c1841350y172 != null) {
                    c1841350y172.setChecked(true);
                }
                if (str.length() > 0) {
                    zS(str);
                    return;
                } else {
                    BS();
                    return;
                }
            }
            C1841350y17 c1841350y173 = this.LLL;
            if (c1841350y173 != null) {
                c1841350y173.setChecked(true);
            }
            if (str.length() > 0) {
                zS(str);
                return;
            } else {
                BS();
                return;
            }
        }
        C1841350y17 c1841350y174 = this.LLJZIJLIL;
        if (c1841350y174 != null) {
            c1841350y174.setChecked(true);
        }
        C500260Jjc.LJIILIIL(this.LLLIIIIL);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LiveBottomSheetBehavior<View> liveBottomSheetBehavior = this.LLJILLL;
        if (liveBottomSheetBehavior != null) {
            liveBottomSheetBehavior.LJJIIZI = R.id.eu1;
            liveBottomSheetBehavior.LJFF();
        }
        this.LLLII = (ViewGroup) view.findViewById(R.id.eu1);
        this.LLLIIII = (C1749280vcc) view.findViewById(R.id.w28);
        this.LLLIIIIL = (ViewGroup) view.findViewById(R.id.noa);
        this.LLLIIIL = (C16F5) view.findViewById(R.id.no9);
        this.LLLIIL = (C16F5) view.findViewById(R.id.nog);
        this.LLJZIJLIL = (C1841350y17) view.findViewById(R.id.jm8);
        this.LLL = (C1841350y17) view.findViewById(R.id.v_0);
        this.LLLF = (C1841350y17) view.findViewById(R.id.v_5);
        C1841350y17 c1841350y17 = this.LLJZIJLIL;
        if (c1841350y17 != null) {
            c1841350y17.setInterceptToggleListener(new AwS556S0100000_12(this, 756));
        }
        C1841350y17 c1841350y172 = this.LLL;
        if (c1841350y172 != null) {
            c1841350y172.setInterceptToggleListener(new AwS556S0100000_12(this, 745));
        }
        C1841350y17 c1841350y173 = this.LLLF;
        if (c1841350y173 != null) {
            c1841350y173.setInterceptToggleListener(new AwS556S0100000_12(this, 746));
        }
        TextView textView = (TextView) view.findViewById(R.id.v_7);
        if (textView != null) {
            HostAddLocationDistanceConfigSetting hostAddLocationDistanceConfigSetting = HostAddLocationDistanceConfigSetting.INSTANCE;
            textView.setText(C497740JfY.LJIIL(2131755925, hostAddLocationDistanceConfigSetting.getValue(), Integer.valueOf(hostAddLocationDistanceConfigSetting.getValue())));
        }
        this.LLLFFI = (ViewGroup) view.findViewById(R.id.jm7);
        this.LLLFZ = (ViewGroup) view.findViewById(R.id.v9z);
        this.LLLI = (ViewGroup) view.findViewById(R.id.v_4);
        ViewGroup viewGroup = this.LLLFFI;
        if (viewGroup != null) {
            C500260Jjc.LJLIIIL(500L, viewGroup, new AwS591S0100000_12(this, 810));
        }
        ViewGroup viewGroup2 = this.LLLFZ;
        if (viewGroup2 != null) {
            C500260Jjc.LJLIIIL(500L, viewGroup2, new AwS591S0100000_12(this, 811));
        }
        ViewGroup viewGroup3 = this.LLLI;
        if (viewGroup3 != null) {
            C500260Jjc.LJLIIIL(500L, viewGroup3, new AwS591S0100000_12(this, 812));
        }
        TextView textView2 = (TextView) view.findViewById(R.id.desc);
        String strLJIJI = C497740JfY.LJIJI(2131854901);
        String strLJIJI2 = C497740JfY.LJIJI(2131854902);
        if (strLJIJI != null) {
            int length = strLJIJI.length();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLJIJI);
            sbLIZ.append(' ');
            sbLIZ.append(strLJIJI2);
            SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
            C1119920fFW.LJ(getContext(), spannableString, length, spannableString.length(), 17, 8, 500);
            C786410Ut5.p2(spannableString, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ezs, getContext())), length, spannableString.length(), 17);
            C786410Ut5.p2(spannableString, new AbstractC1098790ehR() { // from class: X.0Tfy
                @Override // X.AbstractC431510Gw1
                public final void LIZ() {
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                }

                @Override // X.AbstractC1098790ehR
                public final void LIZIZ(View view2) {
                    FragmentManager fragmentManager;
                    DataChannel dataChannelLJ = C475510Ikn.LJ(this.LLILZIL);
                    if (dataChannelLJ != null && (fragmentManager = (FragmentManager) dataChannelLJ.gg0(C748880TZe.class)) != null) {
                        LiveLocationScopeSettingSheet liveLocationScopeSettingSheet = this.LLILZIL;
                        ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).l61(fragmentManager, liveLocationScopeSettingSheet.LLLILZJ, liveLocationScopeSettingSheet.LLLILZLLLI);
                    }
                }
            }, length, spannableString.length(), 17);
            if (textView2 != null) {
                textView2.setLinksClickable(true);
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                textView2.setHighlightColor(0);
                textView2.setText(spannableString);
            }
        }
        IHostAppContext iHostAppContext = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
        if (iHostAppContext != null && iHostAppContext.isLocationPermissionGranted(view.getContext())) {
            if (C0UKZ.LLJJJJJIL.LIZIZ().booleanValue()) {
                if (HostAddLocationSetting.INSTANCE.isV1()) {
                    C1841350y17 c1841350y174 = this.LLJZIJLIL;
                    if (c1841350y174 != null) {
                        c1841350y174.setChecked(false);
                    }
                    C1841350y17 c1841350y175 = this.LLLF;
                    if (c1841350y175 != null) {
                        c1841350y175.setChecked(true);
                    }
                    this.LLJZ = 3;
                } else {
                    C1841350y17 c1841350y176 = this.LLJZIJLIL;
                    if (c1841350y176 != null) {
                        c1841350y176.setChecked(false);
                    }
                    C1841350y17 c1841350y177 = this.LLL;
                    if (c1841350y177 != null) {
                        c1841350y177.setChecked(true);
                    }
                    this.LLJZ = 2;
                }
                C500260Jjc.LJIILIIL(this.LLLIIII);
                C500260Jjc.LLFFF(this.LLLII);
                String strFq1 = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Fq1();
                if (strFq1.length() > 0) {
                    zS(strFq1);
                } else {
                    BS();
                }
            } else {
                uS();
            }
            IHostAppContext iHostAppContext2 = (IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class);
            if (iHostAppContext2 == null || !iHostAppContext2.isLocationServiceEnabled(getContext())) {
                C766270U4b.LIZLLL(2131854888);
            }
        } else {
            yS(null);
        }
        C0UKZ.LLJJJJJIL.LJFF(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View dS(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
        /*
            r4 = this;
            android.os.Bundle r1 = r4.getArguments()
            r3 = 0
            if (r1 == 0) goto L58
            java.lang.String r0 = "show_back_arrow"
            boolean r0 = r1.getBoolean(r0)
        Ld:
            r4.LLLIL = r0
            android.os.Bundle r1 = r4.getArguments()
            if (r1 == 0) goto L56
            java.lang.String r0 = "enable_dim"
            boolean r1 = r1.getBoolean(r0, r3)
            r0 = 1
            if (r1 != r0) goto L56
        L1e:
            r4.LLLILZ = r0
            android.os.Bundle r2 = r4.getArguments()
            java.lang.String r1 = ""
            if (r2 == 0) goto L31
            java.lang.String r0 = "enter_from"
            java.lang.String r0 = r2.getString(r0, r1)
            if (r0 == 0) goto L31
            r1 = r0
        L31:
            r4.LLLILZJ = r1
            android.os.Bundle r2 = r4.getArguments()
            java.lang.String r1 = "nearby_live_take_page"
            if (r2 == 0) goto L44
            java.lang.String r0 = "enter_method"
            java.lang.String r0 = r2.getString(r0, r1)
            if (r0 == 0) goto L44
            r1 = r0
        L44:
            r4.LLLILZLLLI = r1
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r1 = X.C786410Ut5.ne(r0)
            r0 = 2131569002(0x7f0d296a, float:1.8763618E38)
            android.view.View r0 = X.C786410Ut5.Td(r1, r0, r6, r3)
            return r0
        L56:
            r0 = 0
            goto L1e
        L58:
            r0 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveLocationScopeSettingSheet.dS(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
