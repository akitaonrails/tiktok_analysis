package com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog;

import X.C0KVU;
import X.C0TZM;
import X.C1095480ec6;
import X.C1097260eey;
import X.C1143680frq;
import X.C1161920gLG;
import X.C16F5;
import X.C16G6;
import X.C1819620xS4;
import X.C1CC2;
import X.C2188811AlT;
import X.C416770GVv;
import X.C419910GdJ;
import X.C475510Ikn;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C518180KTw;
import X.C786410Ut5;
import X.InterfaceC1095170ebb;
import Y.ACListenerS152S0100000_17;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.livesetting.level.FansClubJoinPanelUpgradeSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.AbsFansClubJoinDialog;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.JoinDialogViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubJoinGiftCenterDialog extends AbsFansClubJoinDialog implements InterfaceC1095170ebb {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OiA6LCEmLWsgLDk2JGslJD8/ZiHELIOSMtJzwwJDAuZzo6ZispPis6KSkjLmEVKSs/CiMmKg8jICEUISM4Cio9PCA+DSYyJCor";
    public C16F5 LLILZLL;
    public ImageView LLIZ;
    public ImageView LLIZLLLIL;
    public ImageView LLJ;
    public long LLJI;
    public C16F5 LLJIJIL;
    public CardView LLJILJIL;
    public boolean LLJILLL;
    public final /* synthetic */ C1095480ec6 LLILZIL = new C1095480ec6();
    public final int LLJILJILJ = (C497740JfY.LJIIZILJ() * 75) / 100;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return false;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        int i = (dataChannel == null || (bool = (Boolean) dataChannel.gg0(C0TZM.class)) == null || bool.booleanValue()) ? R.style.aib : R.style.ain;
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.g68);
        c500980Jkm.LJIIIZ = this.LLJILJILJ;
        c500980Jkm.LIZJ = i;
        c500980Jkm.LJIILIIL = 48;
        c500980Jkm.LJII = 17;
        c500980Jkm.LJ = true;
        return c500980Jkm;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        DataChannel dataChannel = this.dataChannel;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJI;
        JoinDialogViewModel joinDialogViewModel = this.LLILLL;
        C518180KTw.LJJIJIL("fans_club_gift", dataChannel, jCurrentTimeMillis, joinDialogViewModel != null ? joinDialogViewModel.LLJI : false, this.LLILZ, 0L, "fan", false);
        super.onDestroy();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        Dialog dialog;
        Window window2;
        super.onStart();
        if (this.dataChannel != null && (dialog = getDialog()) != null && (window2 = dialog.getWindow()) != null) {
            window2.addFlags(Integer.MIN_VALUE);
            window2.setNavigationBarColor(-16777216);
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.width = this.LLJILJILJ;
            attributes.height = -2;
            window2.setAttributes(attributes);
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // X.InterfaceC1095170ebb
    public final void LP(int i) {
        this.LLILZIL.LL = i;
    }

    @Override // X.InterfaceC1095170ebb
    public final void Rv(Map<String, ? extends Object> map) {
        this.LLILZIL.LLILLJJLI = map;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.LLILZIL.LL = -1;
        super.onDismiss(dialogInterface);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean zLJJIIZI;
        CardView cardView;
        ImageModel imageModel;
        ViewGroup.LayoutParams layoutParams;
        super.onViewCreated(view, bundle);
        this.LLJI = System.currentTimeMillis();
        C786410Ut5.Q7((ImageView) view.findViewById(R.id.fy0), new ACListenerS152S0100000_17(this, 155));
        this.LLILZLL = (C16F5) view.findViewById(R.id.a24);
        boolean zIsFansCLubGiftLimited = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).isFansCLubGiftLimited(C475510Ikn.LJ(this));
        this.LLJILLL = zIsFansCLubGiftLimited;
        if (zIsFansCLubGiftLimited) {
            C16F5 c16f5 = this.LLILZLL;
            if (c16f5 != null) {
                C786410Ut5.l8(c16f5, new ACListenerS152S0100000_17(this, 156));
            }
        } else {
            C16F5 c16f52 = this.LLILZLL;
            if (c16f52 != null) {
                C786410Ut5.l8(c16f52, new ACListenerS152S0100000_17(this, 157));
            }
        }
        this.LLIZ = (ImageView) view.findViewById(R.id.lya);
        this.LLIZLLLIL = (ImageView) view.findViewById(R.id.ly9);
        this.LLJ = (ImageView) view.findViewById(R.id.lyb);
        this.LLJIJIL = (C16F5) view.findViewById(R.id.ho2);
        this.LLJILJIL = (CardView) view.findViewById(R.id.a26);
        int iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.ani);
        int iLJIIIZ2 = C497740JfY.LJIIIZ(R.dimen.anh);
        int i = this.LLJILJILJ;
        int i2 = (iLJIIIZ2 * i) / iLJIIIZ;
        ImageView imageView = this.LLIZ;
        if (imageView != null && (layoutParams = imageView.getLayoutParams()) != null) {
            layoutParams.width = i;
            layoutParams.height = i2;
            ImageView imageView2 = this.LLIZ;
            if (imageView2 != null) {
                C786410Ut5.c6(imageView2, layoutParams);
            }
        }
        C1143680frq.LIZLLL(this.LLIZ, "tiktok_live_new_style_fans_club_join_dialog", "join_fans_club_gift_center_top_wave_image.png");
        C1143680frq.LIZLLL(this.LLIZLLLIL, "tiktok_live_new_style_fans_club_join_dialog", "join_fans_club_gift_center_top_fan_badge_image.png");
        Gift giftFindGiftById = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).findGiftById(7934L);
        if (giftFindGiftById != null && (imageModel = giftFindGiftById.image) != null) {
            C1819620xS4.LIZ().LJIIIZ(imageModel).LJJI(this.LLJ);
        }
        boolean z = false;
        if (FansClubJoinPanelUpgradeSetting.INSTANCE.getValue() == 2 && (cardView = this.LLJILJIL) != null) {
            cardView.setCardBackgroundColor(C497740JfY.LIZLLL(R.attr.ey7, getContext()));
        }
        if (this.LLJILLL) {
            CardView cardView2 = this.LLJILJIL;
            if (cardView2 != null) {
                C786410Ut5.b5(cardView2, 0.4f);
            }
            C16F5 c16f53 = this.LLILZLL;
            if (c16f53 != null) {
                C786410Ut5.k5(c16f53, 0.4f);
            }
        }
        Context context = getContext();
        if (context != null) {
            String strK4 = C786410Ut5.k4(Locale.US, C497740JfY.LJIJI(2131841654), Arrays.copyOf(new Object[]{e3.d, 1}, 2));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strK4);
            int iLIZIZ = (int) C497740JfY.LIZIZ(14.0f);
            int iLIZIZ2 = (int) C497740JfY.LIZIZ(2.0f);
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_color_tiktok_coin;
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
            tuxIconDrawableLIZ.setBounds(0, 0, iLIZIZ, iLIZIZ);
            Drawable drawableMutate = tuxIconDrawableLIZ.mutate();
            drawableMutate.setBounds(0, 0, iLIZIZ, iLIZIZ);
            C16G6.LIZIZ(drawableMutate, C497740JfY.LJJ() ? 1 : 0);
            C416770GVv c416770GVv = new C416770GVv(drawableMutate);
            c416770GVv.LLILZ = iLIZIZ2;
            c416770GVv.LLILLL = iLIZIZ2;
            C786410Ut5.q2(spannableStringBuilder, c416770GVv, strK4.length() - 4, strK4.length() - 2, 34);
            C16F5 c16f54 = this.LLILZLL;
            if (c16f54 != null) {
                c16f54.setText(spannableStringBuilder);
            }
        }
        C518180KTw.LJIILL(Boolean.TRUE, Integer.valueOf(this.LLILZIL.LL), "show", this.LL);
        try {
            String strLIZ = C0KVU.LIZ(C500260Jjc.LJIIIIZZ(C475510Ikn.LJ(this)));
            String strLJIJJ = C497740JfY.LJIJJ(2131852386, strLIZ);
            if (strLJIJJ == null) {
                zLJJIIZI = false;
            } else {
                zLJJIIZI = a0.LJJIIZI(strLJIJJ, "'s", false);
                if (zLJJIIZI) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZ);
                    sbLIZ.append("'s");
                    strLIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            int iLJJJ = a0.LJJJ(strLJIJJ, strLIZ, 0, false, 6);
            int length = strLIZ.length() + iLJJJ;
            if (iLJJJ > 0 && zLJJIIZI && C1097260eey.LIZ() && length <= strLJIJJ.length()) {
                StringBuilder sb = new StringBuilder(strLJIJJ);
                sb.insert(length, " ");
                strLJIJJ = sb.toString();
            }
            SpannableString spannableString = new SpannableString(strLJIJJ);
            if (iLJJJ >= 0 && length <= spannableString.length()) {
                C786410Ut5.p2(spannableString, new StyleSpan(2), iLJJJ, length, 33);
                C786410Ut5.p2(spannableString, new ForegroundColorSpan(C497740JfY.LIZLLL(R.attr.ere, getContext())), iLJJJ, length, 33);
            }
            C16F5 c16f55 = this.LLJIJIL;
            if (c16f55 != null) {
                c16f55.setText(spannableString);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1CC2.LIZ("fans club join gift dialog title exception", e);
        }
        DataChannel dataChannel = this.dataChannel;
        String str = this.LL;
        Boolean boolValueOf = Boolean.valueOf(!this.LLJILLL);
        Integer numValueOf = Integer.valueOf(this.LLILZIL.LL);
        JoinDialogViewModel joinDialogViewModel = this.LLILLL;
        if (joinDialogViewModel != null) {
            z = joinDialogViewModel.LLJI;
        }
        C518180KTw.LJIILLIIL(dataChannel, "show", str, boolValueOf, "", numValueOf, z, this.LLILZ);
        C518180KTw.LJJIIJZLJL(this.dataChannel, this.LL, "fan", this.LLILZIL.LL, !this.LLJILLL, false, false);
    }
}
