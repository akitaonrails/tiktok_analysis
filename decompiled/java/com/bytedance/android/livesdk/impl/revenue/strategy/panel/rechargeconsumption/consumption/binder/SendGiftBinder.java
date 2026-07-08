package com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.consumption.binder;

import X.C013C;
import X.C019F;
import X.C01D1;
import X.C01GW;
import X.C03IJ;
import X.C03K6;
import X.C0JBO;
import X.C1134320fck;
import X.C1143850fs7;
import X.C1146870fwz;
import X.C1146980fxA;
import X.C1196320hEk;
import X.C13LE;
import X.C14K9;
import X.C16FS;
import X.C1834150xpV;
import X.C19719912Dl;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C452080Ho6;
import X.C452501pT;
import X.C497740JfY;
import X.C687700QyG;
import X.C737910Sx3;
import X.C786410Ut5;
import X.EnumC1134330fcl;
import X.InterfaceC1146704e9;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.InterfaceC451590HnJ;
import X.InterfaceC665370Q7z;
import X.InterfaceC713360RyY;
import Y.ACListenerS53S0400000_17;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.common.communication.CampaignPanelScope;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.rechargeconsumption.consumption.ConsumptionTaskViewModel;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AFwS279S0000000_33;
import kotlin.jvm.internal.AwS434S0200000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.TPClickableText;
import webcast.data.TPText;
import webcast.data.TouchPointBackground;

/* JADX INFO: loaded from: classes34.dex */
public final class SendGiftBinder extends PowerCell<C1146980fxA> implements InterfaceC713360RyY, InterfaceC1146704e9 {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZ;
    public final AssemVMLazy LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(SendGiftBinder.class, "consumeVM", "getConsumeVM()Lcom/bytedance/android/livesdk/impl/revenue/strategy/panel/rechargeconsumption/consumption/ConsumptionTaskViewModel;", 0);
        C13LE.LIZ.getClass();
        LLILZ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1146704e9
    public final void checkParentScope() {
        C687700QyG.LIZ(this, new Class[]{CampaignPanelScope.class});
    }

    @Override // X.InterfaceC1146704e9
    public final List getParentScopes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CampaignPanelScope.class);
        return arrayList;
    }

    public SendGiftBinder() {
        AssemVMLazy assemVMLazy;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(ConsumptionTaskViewModel.class);
        Object obj = C019F.LIZ;
        AwS577S0100000_33 awS577S0100000_33 = new AwS577S0100000_33(c19719912DlLIZ, 313);
        AFwS279S0000000_33 aFwS279S0000000_33 = AFwS279S0000000_33.get$arr$(26);
        if (Intrinsics.LJFF(obj, C01D1.LIZ)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 324), awS577S0100000_33, AFwS224S0000000_33.get$arr$(44), new AwS577S0100000_33((C03K6) this, 298), new AwS577S0100000_33((C03K6) this, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 302), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 304), null, new AwS577S0100000_33((C03K6) this, 305));
        } else if (obj instanceof InterfaceC451590HnJ) {
            AwS577S0100000_33 awS577S0100000_332 = new AwS577S0100000_33((C03K6) this, 299);
            AwS577S0100000_33 awS577S0100000_333 = new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 301);
            AwS577S0100000_33 awS577S0100000_334 = new AwS577S0100000_33(c19719912DlLIZ, 303);
            C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS434S0200000_33((InterfaceC451590HnJ) obj, awS577S0100000_332, 11));
            AwS577S0100000_33 awS577S0100000_335 = new AwS577S0100000_33(c01gwLIZIZ, 306);
            AwS577S0100000_33 awS577S0100000_336 = new AwS577S0100000_33(c01gwLIZIZ, 307);
            AwS577S0100000_33 awS577S0100000_337 = new AwS577S0100000_33(c01gwLIZIZ, 309);
            AwS577S0100000_33 awS577S0100000_338 = new AwS577S0100000_33(c01gwLIZIZ, 310);
            AwS577S0100000_33 awS577S0100000_339 = new AwS577S0100000_33(c01gwLIZIZ, 311);
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C737910Sx3.LIZ;
            assemVMLazy = new AssemVMLazy(awS577S0100000_334, awS577S0100000_33, new C452080Ho6(), awS577S0100000_335, awS577S0100000_336, awS577S0100000_333, aFwS279S0000000_33, awS577S0100000_337, awS577S0100000_338, awS577S0100000_339);
        } else if (Intrinsics.LJFF(obj, obj)) {
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 312), awS577S0100000_33, AFwS224S0000000_33.get$arr$(42), new AwS577S0100000_33((C03K6) this, 314), new AwS577S0100000_33((C03K6) this, 315), new AwS577S0100000_33((HasDefaultViewModelProviderFactory) this, 316), aFwS279S0000000_33, new AwS577S0100000_33((C03K6) this, 317), null, new AwS577S0100000_33((C03K6) this, 318));
        } else {
            if (!Intrinsics.LJFF(obj, C03IJ.LIZ)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Don't support this VMScope: ");
                sbLIZ.append(obj);
                sbLIZ.append(" there");
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }
            assemVMLazy = new AssemVMLazy(new AwS577S0100000_33(c19719912DlLIZ, 319), awS577S0100000_33, AFwS224S0000000_33.get$arr$(43), new AwS577S0100000_33((C03K6) this, 320), new AwS577S0100000_33((C03K6) this, 321), new AwS577S0100000_33((C03K6) this, 322), aFwS279S0000000_33, null, null, new AwS577S0100000_33((C03K6) this, 323));
        }
        this.LL = assemVMLazy;
        this.LLILLJJLI = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(41));
        this.LLILLL = C452501pT.LIZIZ(new AwS577S0100000_33(this, 308));
    }

    @Override // X.InterfaceC713360RyY
    public final ViewModelStoreOwner LLIIIILZ() {
        return (ViewModelStoreOwner) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC713360RyY
    public final InterfaceC665370Q7z k0() {
        return C1196320hEk.LIZ(this);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        TPText tPText;
        TouchPointBackground touchPointBackground;
        C1146980fxA c1146980fxA = (C1146980fxA) interfaceC1891350zJl;
        C013C c013c = new C013C();
        GiftService giftService = GiftService.LLILLJJLI;
        Gift giftFindGiftById = giftService.findGiftById(c1146980fxA.LL);
        SpannableStringBuilder spannableStringBuilderLIZLLL = null;
        if (giftFindGiftById == null) {
            C1134320fck.LJFF(EnumC1134330fcl.TP_GIFT_NOT_FOUND, null);
            c013c.element = true;
            giftFindGiftById = giftService.findGiftById(5655L);
            if (giftFindGiftById == null) {
                return;
            }
        }
        C1146870fwz.LIZIZ(this.itemView, c1146980fxA.LLILLJJLI);
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.eq2);
        if (imageView != null) {
            C0JBO.LIZ(imageView, giftFindGiftById.image);
        }
        TextView textView = (TextView) this.itemView.findViewById(R.id.eq3);
        if (textView != null) {
            textView.setText(giftFindGiftById.name);
        }
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.eq4);
        if (textView2 != null) {
            textView2.setText(String.valueOf(giftFindGiftById.diamondCount));
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(C497740JfY.LJIIJ(R.drawable.etw), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        C16FS c16fs = (C16FS) this.itemView.findViewById(R.id.eq5);
        TPClickableText tPClickableText = c1146980fxA.LLILLL;
        if (tPClickableText != null && (touchPointBackground = tPClickableText.background) != null) {
            C14K9.LJIILLIIL(c16fs, null);
            C1146870fwz.LIZIZ(c16fs, touchPointBackground);
        }
        TPClickableText tPClickableText2 = c1146980fxA.LLILLL;
        if (tPClickableText2 != null && (tPText = tPClickableText2.text) != null) {
            spannableStringBuilderLIZLLL = C1143850fs7.LIZLLL(C1143850fs7.LIZ, tPText);
        }
        c16fs.setText(spannableStringBuilderLIZLLL);
        C786410Ut5.h8(c16fs, new ACListenerS53S0400000_17(c013c, this, c16fs, c1146980fxA, 1));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C786410Ut5.Td(C1834150xpV.LJ(C786410Ut5.ne(viewGroup.getContext())), R.layout.g2e, viewGroup, false);
    }
}
