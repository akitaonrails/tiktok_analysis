package com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.view;

import X.C0HTI;
import X.C0IPC;
import X.C1324720kZq;
import X.C1821460xV2;
import X.C1821560xVC;
import X.C1911200zpm;
import X.C19EH;
import X.C497740JfY;
import X.C786410Ut5;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.livesdk.comp.api.pcs.data.model.thirdpartylink.PcsThirdPartyLinkData;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.thirdpartylink.view.PcsThirdPartyLinkFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes28.dex */
public final class PcsThirdPartyLinkDialog extends LiveSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZz8wO2suPDw6JiA/OmE1JzAiLS4nHELIOSISoiZzw2OjMlKiojJDA/Zzs7ITcoOS4hPDwgICE4ZjMlLDh9GCY/HSc6OiEcKD0nMQklJyQXISQgJig=";
    public PcsThirdPartyLinkData LLJLLL;
    public C1324720kZq LLJZ;
    public Drawable LLJZIJLIL;
    public Drawable LLL;
    public boolean LLLF;
    public View LLLFF;
    public LiveIconView LLLFFI;
    public LiveIconView LLLFZ;
    public boolean LLLI;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C0IPC.LIZ();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment
    public final /* synthetic */ boolean isLight(Context context) {
        return true;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void sl() {
        PcsThirdPartyLinkFragment pcsThirdPartyLinkFragmentUS = uS();
        if (pcsThirdPartyLinkFragmentUS == null || !pcsThirdPartyLinkFragmentUS.OR()) {
            C1911200zpm.LIZIZ(this);
        }
    }

    public final PcsThirdPartyLinkFragment uS() {
        Fragment fragmentLJJJJZ = getChildFragmentManager().LJJJJZ(R.id.xtg);
        if (fragmentLJJJJZ instanceof PcsThirdPartyLinkFragment) {
            return (PcsThirdPartyLinkFragment) fragmentLJJJJZ;
        }
        return null;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final void LJJJI(float f) {
        boolean z;
        Drawable drawable;
        Context context;
        C1324720kZq c1324720kZq;
        if (this.LLJZ == null && (context = getContext()) != null) {
            View view = getView();
            if (view != null) {
                c1324720kZq = (C1324720kZq) view.findViewById(R.id.g81);
            } else {
                c1324720kZq = null;
            }
            this.LLJZ = c1324720kZq;
            C0HTI c0hti = new C0HTI();
            c0hti.LIZ = R.drawable.f8l;
            this.LLJZIJLIL = c0hti.LIZ(context);
            C0HTI c0hti2 = new C0HTI();
            c0hti2.LIZ = R.drawable.f8k;
            this.LLL = c0hti2.LIZ(context);
        }
        if (f > 0.8f) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.LLLF) {
            this.LLLF = z;
            C1324720kZq c1324720kZq2 = this.LLJZ;
            if (c1324720kZq2 != null) {
                if (z) {
                    drawable = this.LLL;
                } else {
                    drawable = this.LLJZIJLIL;
                }
                c1324720kZq2.setImageDrawable(drawable);
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptions = new SheetOptions();
        sheetOptions.LIZ(7, null);
        sheetOptions.cornerRadius = (int) C497740JfY.LIZIZ(28.0f);
        return sheetOptions;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        PcsThirdPartyLinkData pcsThirdPartyLinkData;
        super.onCreate(bundle);
        if (this.LLJLLL == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                pcsThirdPartyLinkData = (PcsThirdPartyLinkData) arguments.getParcelable("third_party_link_data");
            } else {
                pcsThirdPartyLinkData = null;
            }
            this.LLJLLL = pcsThirdPartyLinkData;
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewParent parent;
        ViewGroup viewGroup;
        LiveIconView liveIconView;
        super.onViewCreated(view, bundle);
        Fragment fragmentLJJJJZ = getChildFragmentManager().LJJJJZ(R.id.xtg);
        LiveIconView liveIconView2 = null;
        if (!(fragmentLJJJJZ instanceof PcsThirdPartyLinkFragment)) {
            fragmentLJJJJZ = null;
        }
        if (fragmentLJJJJZ == null) {
            PcsThirdPartyLinkFragment pcsThirdPartyLinkFragmentLIZ = C1821560xVC.LIZ(PcsThirdPartyLinkFragment.LLILZLL, this.LLJLLL, true, false, 4);
            C19EH c19ehLJIIJ = getChildFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.xtg, pcsThirdPartyLinkFragmentLIZ, null);
            c19ehLJIIJ.LJIIL();
        }
        View view2 = getView();
        if (view2 != null) {
            parent = view2.getParent();
        } else {
            parent = null;
        }
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.fzb, viewGroup, false);
            this.LLLFF = viewTd;
            if (viewTd != null) {
                liveIconView = (LiveIconView) viewTd.findViewById(R.id.p14);
            } else {
                liveIconView = null;
            }
            this.LLLFFI = liveIconView;
            View view3 = this.LLLFF;
            if (view3 != null) {
                liveIconView2 = (LiveIconView) view3.findViewById(R.id.p1w);
            }
            this.LLLFZ = liveIconView2;
            viewGroup.addView(this.LLLFF, new FrameLayout.LayoutParams(-1, -2, 80));
            View view4 = this.LLLFF;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(8, view4);
            }
            LiveIconView liveIconView3 = this.LLLFFI;
            if (liveIconView3 != null) {
                C786410Ut5.g8(liveIconView3, new View.OnClickListener() { // from class: X.0xV3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        PcsThirdPartyLinkFragment pcsThirdPartyLinkFragmentUS = this.LL.uS();
                        if (pcsThirdPartyLinkFragmentUS == null) {
                            return;
                        }
                        C1821830xVd c1821830xVd = pcsThirdPartyLinkFragmentUS.NR().LLILZIL;
                        if (c1821830xVd != null) {
                            c1821830xVd.invoke();
                        }
                        C1821500xV6.LIZ("click", "backward", pcsThirdPartyLinkFragmentUS.NR().wQ2());
                    }
                });
            }
            LiveIconView liveIconView4 = this.LLLFZ;
            if (liveIconView4 != null) {
                C786410Ut5.g8(liveIconView4, new View.OnClickListener() { // from class: X.0xV4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view5) {
                        PcsThirdPartyLinkFragment pcsThirdPartyLinkFragmentUS = this.LL.uS();
                        if (pcsThirdPartyLinkFragmentUS == null) {
                            return;
                        }
                        C1821840xVe c1821840xVe = pcsThirdPartyLinkFragmentUS.NR().LLILZLL;
                        if (c1821840xVe != null) {
                            c1821840xVe.invoke();
                        }
                        C1821500xV6.LIZ("click", "forward", pcsThirdPartyLinkFragmentUS.NR().wQ2());
                    }
                });
            }
            PcsThirdPartyLinkFragment pcsThirdPartyLinkFragmentUS = uS();
            if (pcsThirdPartyLinkFragmentUS != null) {
                pcsThirdPartyLinkFragmentUS.LLILZIL = new C1821460xV2(this);
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.hga, viewGroup, false);
    }
}
