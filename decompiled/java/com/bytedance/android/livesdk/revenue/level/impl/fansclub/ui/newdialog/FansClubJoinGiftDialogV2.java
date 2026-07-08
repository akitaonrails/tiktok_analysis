package com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog;

import X.C0JBN;
import X.C1094580eae;
import X.C1094610eah;
import X.C1114730f79;
import X.C1161920gLG;
import X.C1324610kZf;
import X.C16F5;
import X.C16G6;
import X.C1819620xS4;
import X.C19MB;
import X.C19ME;
import X.C2108408Nu;
import X.C416770GVv;
import X.C497740JfY;
import X.C518180KTw;
import X.C766270U4b;
import X.C786410Ut5;
import X.C842240X2g;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.livesetting.level.FansClubPanelV2Settings;
import com.bytedance.android.livesdk.livesetting.level.FansClubPrivilegeConfigSetting;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import tikcast.api.fans.GetNonFansUserDataResponse;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes18.dex */
public final class FansClubJoinGiftDialogV2 extends FansClubJoinDialogV3 {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OiA6LCEmLWsgLDk2JGslJD8/HELIOSZiMtJzwwJDAuZzo6ZispPis6KSkjLmEVKSs/CiMmKg8jICEUISM4DSYyJCorH30=";
    public final boolean LLJLILLLLZIIL;
    public TextView LLJLL;

    public FansClubJoinGiftDialogV2() {
        this(false);
    }

    public final void bS() {
        boolean z = true;
        if (this.LLJLILLLLZIIL ? TextUtils.equals(this.LLJJJJLIIL, "click_close") : !Intrinsics.LJFF(this.LLJJJJLIIL, "other_close") && !Intrinsics.LJFF(this.LLJJJJLIIL, "click_outside_close")) {
            z = false;
        }
        if (Intrinsics.LJFF(this.LL, "watch_live_heart_me_popup") && z) {
            C766270U4b.LIZLLL(2131855417);
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment
    public final void dismiss() {
        if (!this.LLJLILLLLZIIL) {
            bS();
        }
        if (!this.LLJLILLLLZIIL && isShowing()) {
            String str = this.LLJJJJLIIL;
            if (str == null) {
                str = "other_close";
            }
            C518180KTw.LJJIIZI(this.dataChannel, str);
            this.LLJJJJLIIL = null;
        }
        super.dismiss();
    }

    @Override // com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.AbsNewFansClubJoinDialog
    public final void UR() {
        if (RR()) {
            C16F5 c16f5 = this.LLIZ;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJI(2131855416));
                return;
            }
            return;
        }
        IGiftService iGiftService = (IGiftService) C2108408Nu.LIZ.LIZIZ(IGiftService.class);
        Gift fansClubGift = iGiftService != null ? iGiftService.getFansClubGift() : null;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(u.LJJIII(u.LJJIII(C497740JfY.LJIJI(2131853135), "%@", e3.d, false), "%d", String.valueOf(fansClubGift != null ? fansClubGift.diamondCount : 1), false));
        Drawable drawableMutate = getResources().getDrawable(R.drawable.etw).mutate();
        drawableMutate.setBounds(0, 0, (int) C497740JfY.LIZIZ(14.0f), (int) C497740JfY.LIZIZ(14.0f));
        C16G6.LIZIZ(drawableMutate, C497740JfY.LJJ() ? 1 : 0);
        C786410Ut5.q2(spannableStringBuilder, new C416770GVv(drawableMutate), r6.length() - 4, r6.length() - 2, 34);
        C16F5 c16f52 = this.LLIZ;
        if (c16f52 != null) {
            c16f52.setText(spannableStringBuilder);
        }
    }

    public FansClubJoinGiftDialogV2(boolean z) {
        super(z);
        this.LLJLILLLLZIIL = z;
    }

    @Override // com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubJoinDialogV3, com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.AbsNewFansClubJoinDialog
    public final void NR(View view) {
        Gift fansClubGift;
        ImageModel imageModel;
        if (C1114730f79.LIZ()) {
            this.LLJLL = (TextView) view.findViewById(R.id.tv_privilege_new_tip);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.bpo);
            ImageView imageView = (ImageView) view.findViewById(R.id.bps);
            TextView textView = (TextView) view.findViewById(R.id.bq7);
            ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.iwn);
            ImageView imageView2 = (ImageView) view.findViewById(R.id.iy1);
            TextView textView2 = (TextView) view.findViewById(R.id.j0s);
            ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.h72);
            ImageView imageView3 = (ImageView) view.findViewById(R.id.bsr);
            TextView textView3 = (TextView) view.findViewById(R.id.bst);
            ViewGroup viewGroup4 = (ViewGroup) view.findViewById(R.id.mmb);
            ImageView imageView4 = (ImageView) view.findViewById(R.id.f754mmc);
            TextView textView4 = (TextView) view.findViewById(R.id.mmg);
            aS(viewGroup, 0, imageView, textView);
            aS(viewGroup3, 1, imageView3, textView3);
            aS(viewGroup2, 2, imageView2, textView2);
            aS(viewGroup4, 3, imageView4, textView4);
            WR(view);
            WR(view);
            return;
        }
        super.NR(view);
        View viewFindViewById = view.findViewById(R.id.m05);
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(0, viewFindViewById);
            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
            List<String> listLIZ = null;
            if (this.LLILLL != null && (fansClubGift = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getFansClubGift()) != null && (imageModel = fansClubGift.image) != null) {
                listLIZ = C842240X2g.LIZ(imageModel);
            }
            C1324610kZf c1324610kZfLIZJ = c0jbnLIZ.LIZJ(listLIZ);
            c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            c1324610kZfLIZJ.LJIIIZ = R.drawable.eze;
            c1324610kZfLIZJ.LJJI(viewFindViewById);
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubJoinDialogV3
    public final void ZR(GetNonFansUserDataResponse.Data data) {
        int i;
        C16F5 c16f5 = this.LLJJIJIIJIL;
        if (c16f5 != null) {
            if (FansClubPanelV2Settings.INSTANCE.enableFansClubPanelV2()) {
                i = 2131852350;
            } else {
                i = 2131853136;
            }
            c16f5.setText(C497740JfY.LJIJI(i));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (!this.LLJLILLLLZIIL) {
            C518180KTw.LJJIIZI(this.dataChannel, "click_return");
            this.LLJJJJLIIL = null;
        }
    }

    @Override // com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.FansClubJoinDialogV3, com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialog.AbsNewFansClubJoinDialog, com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        this.LLILZ = "no_info";
        SR();
        super.onViewCreated(view, bundle);
        View view2 = this.LLJL;
        if (view2 != null) {
            C786410Ut5.LJLLLLLL(8, view2);
        }
        View view3 = this.LLJLIL;
        if (view3 != null) {
            C786410Ut5.LJLLLLLL(8, view3);
        }
        C16F5 c16f5 = this.LLJJIJIIJIL;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, 0);
        }
        if (!this.LLJLILLLLZIIL) {
            C518180KTw.LJJIJ(this.dataChannel);
        }
    }

    public final void aS(ViewGroup viewGroup, int i, ImageView imageView, TextView textView) {
        int size;
        FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig liveFansPrivilegeElementConfig;
        int size2;
        ConstraintLayout constraintLayout;
        FansClubPrivilegeConfigSetting fansClubPrivilegeConfigSetting = FansClubPrivilegeConfigSetting.INSTANCE;
        List<FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig> list = fansClubPrivilegeConfigSetting.getValue().privilegeGiftElements;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        if (i >= size) {
            if (viewGroup != null) {
                C786410Ut5.LJLZ(8, viewGroup);
                return;
            }
            return;
        }
        if (C1114730f79.LIZ() && Intrinsics.LJFF(fansClubPrivilegeConfigSetting.getValue().showNewIcon, Boolean.TRUE) && fansClubPrivilegeConfigSetting.getValue().showGiftNewIconPos == i) {
            if (viewGroup != null) {
                List<FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig> list2 = fansClubPrivilegeConfigSetting.getValue().privilegeGiftElements;
                if (list2 != null) {
                    size2 = list2.size();
                } else {
                    size2 = 0;
                }
                TextView textView2 = this.LLJLL;
                ViewGroup.LayoutParams layoutParams = null;
                if (textView2 != null) {
                    layoutParams = textView2.getLayoutParams();
                }
                if ((layoutParams instanceof C19ME) && layoutParams != null && size2 > 0) {
                    C1094580eae c1094580eae = C1094580eae.LIZ;
                    TextView textView3 = this.LLJLL;
                    c1094580eae.getClass();
                    C1094580eae.LJIIIIZZ(textView3);
                    C1094580eae.LJIILIIL(this.LLJLL);
                    TextView textView4 = this.LLJLL;
                    if (textView4 != null) {
                        C786410Ut5.LLIL(textView4, 0);
                    }
                    ViewParent parent = viewGroup.getParent();
                    if ((parent instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) parent) != null) {
                        int iLJIIIZ = (C497740JfY.LJIIIZ(R.dimen.ard) / 2) + ((int) C497740JfY.LIZIZ(9.0f));
                        C19MB c19mb = new C19MB();
                        c19mb.LJII(constraintLayout);
                        c19mb.LJI(R.id.tv_privilege_new_tip, 6);
                        c19mb.LJI(R.id.tv_privilege_new_tip, 3);
                        c19mb.LJIIIZ(R.id.tv_privilege_new_tip, 6, viewGroup.getId(), 6, iLJIIIZ);
                        c19mb.LJIIIIZZ(R.id.tv_privilege_new_tip, 3, viewGroup.getId(), 3);
                        c19mb.LIZIZ(constraintLayout);
                    }
                }
                C786410Ut5.LJLZ(0, viewGroup);
            }
        } else if (viewGroup != null) {
            C786410Ut5.LJLZ(0, viewGroup);
        }
        List<FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig> list3 = fansClubPrivilegeConfigSetting.getValue().privilegeGiftElements;
        if (list3 != null && (liveFansPrivilegeElementConfig = (FansClubPrivilegeConfigSetting.LiveFansPrivilegeElementConfig) ListProtector.get(list3, i)) != null) {
            C1094610eah.LIZ.getClass();
            C1094610eah.LIZ(imageView, textView, liveFansPrivilegeElementConfig);
        }
    }
}
