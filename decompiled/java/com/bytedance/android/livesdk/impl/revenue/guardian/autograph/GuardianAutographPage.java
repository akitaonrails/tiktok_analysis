package com.bytedance.android.livesdk.impl.revenue.guardian.autograph;

import X.C011Z;
import X.C0IJT;
import X.C1117670fBt;
import X.C1119920fFW;
import X.C1143680frq;
import X.C11S5;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C16F5;
import X.C16FS;
import X.C1701940uOG;
import X.C1819620xS4;
import X.C20441214yg;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C422250Gh5;
import X.C474500IjA;
import X.C480460Ism;
import X.C497740JfY;
import X.C516201zk;
import X.C786410Ut5;
import X.InterfaceC1080960eEg;
import Y.ACListenerS141S0100000_6;
import Y.ACListenerS152S0100000_17;
import Y.AfS153S0200000_17;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.impl.revenue.guardian.api.GuardianApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes18.dex */
public final class GuardianAutographPage extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9ISg8JWEhLTMpJzo2HELIOSZiI5KD03ISQiZy4mPCorOy4jIGsLPC4hLCwtJw4mPCorOy4jIBUtLio=";
    public DataChannel LLJLLL;
    public C1117670fBt LLJZ;
    public String LLJZIJLIL = "";
    public View LLL;
    public C1324720kZq LLLF;
    public C1324720kZq LLLFF;
    public C1324720kZq LLLFFI;
    public C422250Gh5 LLLFZ;
    public View LLLI;
    public LiveIconView LLLII;
    public C16F5 LLLIIII;
    public C16F5 LLLIIIIL;
    public C16F5 LLLIIIL;
    public C16FS LLLIIL;
    public C16FS LLLIILIL;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final int getThemeOverlay(Context context) {
        return C011Z.LIZ.LJ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(1, null);
        sheetOptions.cornerRadius = C497740JfY.LJIIIZ(R.dimen.aqn);
        return sheetOptions;
    }

    public final void uS(boolean z) {
        Context context;
        int iLIZIZ;
        int i;
        View view = getView();
        if (view != null && (context = view.getContext()) != null) {
            View view2 = this.LLLI;
            if (view2 != null) {
                view2.setEnabled(z);
            }
            C16F5 c16f5 = this.LLLIIIIL;
            if (c16f5 != null) {
                if (z) {
                    i = 8;
                } else {
                    i = 0;
                }
                C786410Ut5.LLJJJJ(c16f5, i);
            }
            if (z) {
                iLIZIZ = C20736316Cj.LIZIZ(R.attr.ezq, context);
            } else {
                iLIZIZ = C20736316Cj.LIZIZ(R.attr.ezy, context);
            }
            LiveIconView liveIconView = this.LLLII;
            if (liveIconView != null) {
                liveIconView.setIconTint(iLIZIZ);
            }
            C16F5 c16f52 = this.LLLIIII;
            if (c16f52 != null) {
                c16f52.setTextColor(iLIZIZ);
            }
            C16FS c16fs = this.LLLIILIL;
            if (c16fs != null) {
                c16fs.setEnabled(z);
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        SpannableString spannableString;
        Context context;
        super.onViewCreated(view, bundle);
        this.LLL = view.findViewById(R.id.j9b);
        this.LLLF = (C1324720kZq) view.findViewById(R.id.j99);
        this.LLLFF = (C1324720kZq) view.findViewById(R.id.j9_);
        this.LLLFFI = (C1324720kZq) view.findViewById(R.id.j9c);
        this.LLLFZ = (C422250Gh5) view.findViewById(R.id.j9d);
        this.LLLI = view.findViewById(R.id.j94);
        this.LLLII = (LiveIconView) view.findViewById(R.id.j95);
        this.LLLIIII = (C16F5) view.findViewById(R.id.j96);
        this.LLLIIIIL = (C16F5) view.findViewById(R.id.j9e);
        this.LLLIIIL = (C16F5) view.findViewById(R.id.j98);
        this.LLLIIL = (C16FS) view.findViewById(R.id.j92);
        this.LLLIILIL = (C16FS) view.findViewById(R.id.j9i);
        float fLIZIZ = (int) C497740JfY.LIZIZ(999.0f);
        C16FS c16fs = this.LLLIIL;
        List urls = null;
        if ((c16fs instanceof InterfaceC1080960eEg) && c16fs != null) {
            c16fs.setRadius(fLIZIZ);
        }
        C16FS c16fs2 = this.LLLIILIL;
        if ((c16fs2 instanceof InterfaceC1080960eEg) && c16fs2 != null) {
            c16fs2.setRadius(fLIZIZ);
        }
        View view2 = this.LLL;
        if (view2 != null) {
            C1143680frq.LJFF(view2, "tiktok_live_revenue_guardian", "ttlive_guardian_autograph_gallery_frame.png", ImageView.ScaleType.CENTER_CROP, null);
        }
        C1324720kZq c1324720kZq = this.LLLFF;
        if (c1324720kZq != null) {
            C1143680frq.LJFF(c1324720kZq, "tiktok_live_revenue_guardian", "ttlive_guardian_autograph_avatar_frame.png", ImageView.ScaleType.CENTER_CROP, null);
        }
        C1324720kZq c1324720kZq2 = this.LLLF;
        if (c1324720kZq2 != null) {
            ImageModel avatarThumb = UserService.getInstance().user().getCurrentUser().getAvatarThumb();
            if (avatarThumb != null) {
                urls = avatarThumb.getUrls();
            }
            C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(urls);
            c1324610kZfLIZJ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
            int width = c1324720kZq2.getWidth();
            int height = c1324720kZq2.getHeight();
            c1324610kZfLIZJ.LJ = width;
            c1324610kZfLIZJ.LJFF = height;
            c1324610kZfLIZJ.LJIIIZ = R.drawable.ela;
            c1324610kZfLIZJ.LJJI(c1324720kZq2);
        }
        C422250Gh5 c422250Gh5 = this.LLLFZ;
        if (c422250Gh5 != null) {
            c422250Gh5.setOnAutographContentChanged(new AwS418S0200000_17(this, c422250Gh5, 86));
            uS(c422250Gh5.LIZJ());
            View view3 = this.LLLI;
            if (view3 != null) {
                C786410Ut5.I7(new ACListenerS141S0100000_6(c422250Gh5, 126), view3);
            }
        }
        C1117670fBt c1117670fBt = this.LLJZ;
        if (c1117670fBt != null) {
            AwS596S0100000_17 awS596S0100000_17 = new AwS596S0100000_17(this, 161);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadSavedAutograph: queryGuardianAutograph userId=");
            sbLIZ.append(c1117670fBt.LIZJ);
            sbLIZ.append(" anchorId=");
            sbLIZ.append(c1117670fBt.LIZ);
            C20441214yg.LJIIIZ("GuardianAutographPresenter", C2188811AlT.LIZIZ(sbLIZ));
            C480460Ism.LIZ().getClass();
            ((GuardianApi) C480460Ism.LIZLLL(GuardianApi.class)).queryGuardianAutograph(String.valueOf(c1117670fBt.LIZJ), String.valueOf(c1117670fBt.LIZ)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS153S0200000_17(awS596S0100000_17, c1117670fBt, 24), new C516201zk(awS596S0100000_17, 251));
        }
        C16F5 c16f5 = this.LLLIIIL;
        if (c16f5 != null) {
            String strLJIJJ = C497740JfY.LJIJJ(2131852753, C497740JfY.LJIJI(2131852670));
            View view4 = getView();
            if (view4 != null && (context = view4.getContext()) != null) {
                String strLJIJI = C497740JfY.LJIJI(2131852670);
                int iLJJJ = a0.LJJJ(strLJIJJ, strLJIJI, 0, false, 6);
                int length = strLJIJI.length();
                int length2 = strLJIJJ.length();
                if (iLJJJ < 0) {
                    spannableString = new SpannableString(strLJIJJ);
                } else {
                    int i = length + iLJJJ;
                    spannableString = new SpannableString(strLJIJJ);
                    C1119920fFW.LJ(context, spannableString, 0, iLJJJ, 17, 7, 400);
                    C1119920fFW.LJ(context, spannableString, iLJJJ, i, 17, 7, 500);
                    C1119920fFW.LJ(context, spannableString, i, length2, 17, 7, 400);
                    C786410Ut5.p2(spannableString, new ClickableSpan() { // from class: X.018X
                        @Override // android.text.style.ClickableSpan
                        public final void onClick(View view5) {
                            C760370TsB c760370TsBLIZJ = C0KYL.LIZJ("https://www.tiktok.com/community-guidelines/overview");
                            c760370TsBLIZJ.LJJ((int) C497740JfY.LJJI(C465640INu.LIZIZ(view5.getContext())), EnumC760350Ts9.DP);
                            c760370TsBLIZJ.LJIIIZ(73, EnumC760350Ts9.PERCENT);
                            c760370TsBLIZJ.LJIIIIZZ("bottom");
                            String string = c760370TsBLIZJ.LIZ().toString();
                            IHybridContainerService iHybridContainerService = (IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class);
                            if (iHybridContainerService != null) {
                                iHybridContainerService.YC1(view5.getContext(), string, null);
                            }
                        }

                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public final void updateDrawState(TextPaint textPaint) {
                            textPaint.setUnderlineText(false);
                        }
                    }, iLJJJ, i, 17);
                }
            } else {
                spannableString = new SpannableString(strLJIJJ);
            }
            c16f5.setText(spannableString);
            c16f5.setLinksClickable(true);
            c16f5.setMovementMethod(LinkMovementMethod.getInstance());
            c16f5.setHighlightColor(0);
        }
        C16FS c16fs3 = this.LLLIIL;
        if (c16fs3 != null) {
            C786410Ut5.h8(c16fs3, new ACListenerS152S0100000_17(this, 148));
        }
        C16FS c16fs4 = this.LLLIILIL;
        if (c16fs4 != null) {
            C786410Ut5.h8(c16fs4, new ACListenerS152S0100000_17(this, 149));
        }
        DataChannel dataChannel = this.LLJLLL;
        String str = this.LLJZIJLIL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_guardian_sign_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "enter_from");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.gos, viewGroup, false);
    }
}
