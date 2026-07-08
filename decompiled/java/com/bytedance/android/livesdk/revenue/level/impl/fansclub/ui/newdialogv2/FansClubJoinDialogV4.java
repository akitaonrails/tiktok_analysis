package com.bytedance.android.livesdk.revenue.level.impl.fansclub.ui.newdialogv2;

import X.C0KSH;
import X.C0KT2;
import X.C0KT5;
import X.C1095480ec6;
import X.C1097260eey;
import X.C1121570fIB;
import X.C1143680frq;
import X.C1161920gLG;
import X.C13BV;
import X.C1602160rnK;
import X.C1697810uHb;
import X.C16F5;
import X.C16FS;
import X.C1889080zG6;
import X.C1911200zpm;
import X.C1AAA;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C419270GcH;
import X.C497740JfY;
import X.C517700KSa;
import X.C518180KTw;
import X.C786410Ut5;
import X.EnumC1095410ebz;
import X.EnumC21668319r7;
import X.InterfaceC1095170ebb;
import Y.AObserverS235S0100000_33;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.gift.GiftDialogDismissEvent;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.livesdk.livesetting.level.LiveFansClubAwarenessEnhancementSetting;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.viewmodel.JoinDialogViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS712S0100000_33;

/* JADX INFO: loaded from: classes34.dex */
public final class FansClubJoinDialogV4 extends LiveSheetFragment implements InterfaceC1095170ebb {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9OiA6LCEmLWsgLDk2JGslJDHELIOS8/ZiMtJzwwJDAuZzo6ZispPis6KSkjLjlhZgMtJzwQJDAuAyA6JgElKCM8LxN4";
    public JoinDialogProxyViewModel LLJZIJLIL;
    public DataChannel LLL;
    public C419270GcH LLLFFI;
    public C16FS LLLI;
    public ImageView LLLII;
    public C16F5 LLLIIII;
    public C16F5 LLLIIIIL;
    public ImageView LLLIIIL;
    public LinearLayout LLLIIL;
    public ConstraintLayout LLLIILIL;
    public C16F5 LLLIL;
    public C16F5 LLLILZ;
    public View LLLILZJ;
    public boolean LLLILZLLLI;
    public View LLLJ;
    public final /* synthetic */ C1095480ec6 LLJLLL = new C1095480ec6();
    public String LLJZ = "";
    public EnumC1095410ebz LLLF = EnumC1095410ebz.BOTH;
    public EnumC21668319r7 LLLFF = EnumC21668319r7.UNKNOWN;
    public List<C1889080zG6> LLLFZ = C13BV.INSTANCE;
    public final long LLLIZZ = System.currentTimeMillis();

    public final C0KT5 uS() {
        EnumC1095410ebz enumC1095410ebz = this.LLLF;
        return new C0KT5(1, enumC1095410ebz == EnumC1095410ebz.ONLY_SUPER_FAN ? C0KT2.INDEPENDENT_PURCHASE_PAGE : (enumC1095410ebz == EnumC1095410ebz.ONLY_FANS_CLUB || enumC1095410ebz == EnumC1095410ebz.BOTH) ? C0KT2.JOIN_GUIDE_PAGE : C0KT2.OTHERS, this.LLJZ, LiveFansClubAwarenessEnhancementSetting.INSTANCE.isEnabled() ? 6 : 0);
    }

    public final boolean yS() {
        return ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getCommunityGift() != null && this.LLLFF == EnumC21668319r7.FANS_CLUB;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        JoinDialogViewModel joinDialogViewModel;
        MutableLiveData<Long> mutableLiveData;
        Long value;
        JoinDialogViewModel joinDialogViewModel2;
        Boolean boolValueOf;
        super.onDestroy();
        JoinDialogProxyViewModel joinDialogProxyViewModel = this.LLJZIJLIL;
        if (joinDialogProxyViewModel != null) {
            joinDialogProxyViewModel.AQ2(this.LLLF);
        }
        EnumC1095410ebz enumC1095410ebz = this.LLLF;
        EnumC1095410ebz enumC1095410ebz2 = EnumC1095410ebz.BOTH;
        if (enumC1095410ebz == enumC1095410ebz2 || enumC1095410ebz == EnumC1095410ebz.ONLY_FANS_CLUB) {
            String str = this.LLJZ;
            DataChannel dataChannel = this.LLL;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLLIZZ;
            JoinDialogProxyViewModel joinDialogProxyViewModel2 = this.LLJZIJLIL;
            boolean zBooleanValue = (joinDialogProxyViewModel2 == null || (joinDialogViewModel2 = joinDialogProxyViewModel2.LL) == null || (boolValueOf = Boolean.valueOf(joinDialogViewModel2.LLJI)) == null) ? false : boolValueOf.booleanValue();
            JoinDialogProxyViewModel joinDialogProxyViewModel3 = this.LLJZIJLIL;
            C518180KTw.LJJIJIL(str, dataChannel, jCurrentTimeMillis, zBooleanValue, "", Math.max((joinDialogProxyViewModel3 == null || (joinDialogViewModel = joinDialogProxyViewModel3.LL) == null || (mutableLiveData = joinDialogViewModel.LLIZLLLIL) == null || (value = mutableLiveData.getValue()) == null) ? 0L : value.longValue(), 0L), this.LLLFF == EnumC21668319r7.SUPER_FAN ? "superfan" : "fan", yS());
        }
        EnumC1095410ebz enumC1095410ebz3 = this.LLLF;
        if (enumC1095410ebz3 == EnumC1095410ebz.ONLY_SUPER_FAN || enumC1095410ebz3 == enumC1095410ebz2) {
            DataChannel dataChannel2 = this.LLL;
            long jCurrentTimeMillis2 = System.currentTimeMillis() - this.LLLIZZ;
            C16FS c16fs = this.LLLI;
            boolean z = c16fs != null && c16fs.LLJJIJI;
            JoinDialogProxyViewModel joinDialogProxyViewModel4 = this.LLJZIJLIL;
            C0KSH.LJII(jCurrentTimeMillis2, dataChannel2, uS().LIZIZ, z, joinDialogProxyViewModel4 == null || joinDialogProxyViewModel4.LLILLL == null);
        }
    }

    @Override // X.InterfaceC1095170ebb
    public final void LP(int i) {
        this.LLJLLL.LL = i;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        if (C1097260eey.LIZIZ()) {
            return C20736316Cj.LIZIZ(R.attr.exe, context);
        }
        return C1911200zpm.LIZ(context);
    }

    @Override // X.InterfaceC1095170ebb
    public final void Rv(Map<String, ? extends Object> map) {
        this.LLJLLL.LLILLJJLI = map;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(16.0f);
        sheetOptions.draggable = false;
        return sheetOptions;
    }

    public final void wS(boolean z) {
        int i;
        View view = this.LLLILZJ;
        if (view != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, view);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        if ((Intrinsics.LJFF(this.LLJZ, "fans_club_gift") || Intrinsics.LJFF(this.LLJZ, "gift_banner")) && !this.LLLILZLLLI) {
            C1121570fIB c1121570fIB = new C1121570fIB((User) null);
            c1121570fIB.LIZJ = "fans_club_join";
            DataChannel dataChannel = this.LLL;
            if (dataChannel != null) {
                dataChannel.LC0(SendGiftEvent.class, c1121570fIB);
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View contentView;
        View contentView2;
        DataChannel dataChannel;
        MutableLiveData<C1AAA> mutableLiveData;
        View contentView3;
        View viewFindViewById;
        super.onViewCreated(view, bundle);
        if (C1097260eey.LIZIZ() && (viewFindViewById = view.findViewById(R.id.dyl)) != null) {
            viewFindViewById.setClipToOutline(true);
            viewFindViewById.setBackgroundResource(R.drawable.drm);
        }
        C419270GcH c419270GcH = (C419270GcH) view.findViewById(R.id.wz4);
        this.LLLFFI = c419270GcH;
        if (c419270GcH != null) {
            c419270GcH.setDataChannel(this.LLL);
            c419270GcH.setContentView(view.findViewById(R.id.ex3));
        }
        EnumC1095410ebz enumC1095410ebz = this.LLLF;
        EnumC1095410ebz enumC1095410ebz2 = EnumC1095410ebz.ONLY_SUPER_FAN;
        if (enumC1095410ebz == enumC1095410ebz2) {
            float fLIZIZ = (int) C497740JfY.LIZIZ(16.0f);
            C419270GcH c419270GcH2 = this.LLLFFI;
            if (c419270GcH2 != null && (contentView3 = c419270GcH2.getContentView()) != null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setColor(ColorStateList.valueOf(ColorProtector.parseColor("#FEF7EA")));
                gradientDrawable.setCornerRadii(new float[]{fLIZIZ, fLIZIZ, fLIZIZ, fLIZIZ, 0.0f, 0.0f, 0.0f, 0.0f});
                contentView3.setBackground(gradientDrawable);
            }
        }
        this.LLLI = (C16FS) view.findViewById(R.id.a24);
        ViewGroup.LayoutParams layoutParams = null;
        this.LLLFZ = C1697810uHb.LJIIJJI(new C1889080zG6((LinearLayout) view.findViewById(R.id.en6), (ImageView) view.findViewById(R.id.en7), (C16F5) view.findViewById(R.id.en8), view.findViewById(R.id.en5)), new C1889080zG6((LinearLayout) view.findViewById(R.id.en_), (ImageView) view.findViewById(R.id.ena), (C16F5) view.findViewById(R.id.enc), view.findViewById(R.id.en9)), new C1889080zG6((LinearLayout) view.findViewById(R.id.uh_), (ImageView) view.findViewById(R.id.uha), (C16F5) view.findViewById(R.id.uhc), view.findViewById(R.id.uhb)), new C1889080zG6((LinearLayout) view.findViewById(R.id.bpo), (ImageView) view.findViewById(R.id.bps), (C16F5) view.findViewById(R.id.bq7), null), new C1889080zG6((LinearLayout) view.findViewById(R.id.h72), (ImageView) view.findViewById(R.id.bsr), (C16F5) view.findViewById(R.id.bst), null), new C1889080zG6((LinearLayout) view.findViewById(R.id.mmb), (ImageView) view.findViewById(R.id.f754mmc), (C16F5) view.findViewById(R.id.mmg), null), new C1889080zG6((LinearLayout) view.findViewById(R.id.iwn), (ImageView) view.findViewById(R.id.iy1), (C16F5) view.findViewById(R.id.j0s), null));
        this.LLLIIL = (LinearLayout) view.findViewById(R.id.bpo);
        this.LLLIILIL = (ConstraintLayout) view.findViewById(R.id.l52);
        this.LLLIL = (C16F5) view.findViewById(R.id.enb);
        view.findViewById(R.id.user_info_background);
        this.LLLII = (ImageView) view.findViewById(R.id.user_profile);
        this.LLLIIII = (C16F5) view.findViewById(R.id.hnw);
        this.LLLIIIIL = (C16F5) view.findViewById(R.id.wpm);
        this.LLLIIIL = (ImageView) view.findViewById(R.id.bpm);
        this.LLLILZ = (C16F5) view.findViewById(R.id.ho2);
        this.LLLILZJ = view.findViewById(R.id.nnp);
        this.LLLJ = view.findViewById(R.id.hc6);
        C786410Ut5.I7(new AbS712S0100000_33(this, 13), view.findViewById(R.id.hbk));
        View viewFindViewById2 = view.findViewById(R.id.user_info_container_shadow);
        if (viewFindViewById2 != null) {
            C1143680frq.LJ(viewFindViewById2, "tiktok_live_new_style_fans_club_join_dialog", "ttlive_bg_fans_club_user_info_shadow.png", ImageView.ScaleType.FIT_XY);
        }
        C16F5 c16f5 = this.LLLIIII;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJI(2131853137));
        }
        C16F5 c16f52 = this.LLLIIIIL;
        if (c16f52 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(C497740JfY.LJIJI(2131856589));
            sbLIZ.append(']');
            C517700KSa.LIZLLL(c16f52, C497740JfY.LJIJJ(2131852353, C2188811AlT.LIZIZ(sbLIZ)), 82, C20736316Cj.LIZIZ(R.attr.ezs, getContext()), new AwS577S0100000_33(this, 4044));
        }
        JoinDialogProxyViewModel joinDialogProxyViewModel = this.LLJZIJLIL;
        if (joinDialogProxyViewModel != null && (mutableLiveData = joinDialogProxyViewModel.LLIZ) != null) {
            mutableLiveData.observe(getViewLifecycleOwner(), new AObserverS235S0100000_33(this, 57));
        }
        EnumC1095410ebz enumC1095410ebz3 = this.LLLF;
        if (enumC1095410ebz3 != EnumC1095410ebz.ONLY_FANS_CLUB && enumC1095410ebz3 != enumC1095410ebz2) {
            C419270GcH c419270GcH3 = this.LLLFFI;
            if (c419270GcH3 != null) {
                int visibility = c419270GcH3.getVisibility();
                c419270GcH3.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c419270GcH3);
            }
            C16F5 c16f53 = this.LLLILZ;
            if (c16f53 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c16f53.getLayoutParams();
                marginLayoutParams.topMargin = (int) C497740JfY.LIZIZ(4.0f);
                C786410Ut5.y6(c16f53, marginLayoutParams);
            }
        } else {
            C419270GcH c419270GcH4 = this.LLLFFI;
            if (c419270GcH4 != null) {
                int visibility2 = c419270GcH4.getVisibility();
                c419270GcH4.setVisibility(8);
                C1602160rnK.LIZIZ(visibility2, 8, c419270GcH4);
            }
            C16F5 c16f54 = this.LLLILZ;
            if (c16f54 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c16f54.getLayoutParams();
                marginLayoutParams2.topMargin = (int) C497740JfY.LIZIZ(32.0f);
                C786410Ut5.y6(c16f54, marginLayoutParams2);
            }
            C419270GcH c419270GcH5 = this.LLLFFI;
            if (c419270GcH5 != null && (contentView = c419270GcH5.getContentView()) != null) {
                C419270GcH c419270GcH6 = this.LLLFFI;
                if (c419270GcH6 != null && (contentView2 = c419270GcH6.getContentView()) != null) {
                    layoutParams = contentView2.getLayoutParams();
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams3.topMargin = (int) C497740JfY.LIZIZ(0.0f);
                C786410Ut5.W5(contentView, marginLayoutParams3);
            }
        }
        JoinDialogProxyViewModel joinDialogProxyViewModel2 = this.LLJZIJLIL;
        if (joinDialogProxyViewModel2 != null) {
            joinDialogProxyViewModel2.BQ2(this.LLLF, uS());
        }
        if ((Intrinsics.LJFF(this.LLJZ, "fans_club_gift") || Intrinsics.LJFF(this.LLJZ, "gift_banner")) && (dataChannel = this.LLL) != null) {
            dataChannel.LC0(GiftDialogDismissEvent.class, Boolean.FALSE);
        }
        this.LLLILZLLLI = false;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.g67, viewGroup, false);
    }
}
