package com.bytedance.android.livesdk.comp.impl.game.partnership.ui;

import X.AbstractC1177930gl5;
import X.C098200Yq;
import X.C0KYL;
import X.C1161920gLG;
import X.C1318620kQ0;
import X.C1324610kZf;
import X.C1548820qPI;
import X.C16F5;
import X.C16FS;
import X.C1819620xS4;
import X.C1884370z8V;
import X.C1886030zBB;
import X.C1886090zBH;
import X.C1886110zBJ;
import X.C1886120zBK;
import X.C189200o6;
import X.C20441214yg;
import X.C20736316Cj;
import X.C2097608Jq;
import X.C2188811AlT;
import X.C2327809Ae;
import X.C460180I2u;
import X.C497740JfY;
import X.C500260Jjc;
import X.C500980Jkm;
import X.C760370TsB;
import X.C786410Ut5;
import X.C843930X8t;
import X.InterfaceC1141530foN;
import X.InterfaceC1142670fqD;
import X.InterfaceC1541990qEH;
import X.InterfaceC19562711gH;
import X.InterfaceC420801kM;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.comp.impl.game.partnership.ui.GameShortVideoAdDetailPageDialogFragment;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS68S1000000_17;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: loaded from: classes29.dex */
public final class GameShortVideoAdDetailPageDialogFragment extends LiveDialogFragment {
    public static final float LLJLILLLLZIIL;
    public static final int LLJLL;
    public static final int LLJLLIL;
    public static final int LLJLLL;
    public static final int LLJZ;
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9KyohOWE6JTUgZygyJSBiOS4hPCspHELIOSOzw7ITViPCZ9DyQhLBw7Jzc4HyY3LSoNLQs2PCQlJR8yLyAIIC4/JyIKOy40JSAiPQ==";
    public InterfaceC420801kM LL;
    public float LLILLJJLI;
    public LiveIconView LLILLL;
    public C16FS LLILZ;
    public BottomSheetBehavior<?> LLILZIL;
    public int LLILZLL;
    public View LLIZ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLIZLLLIL;
    public C843930X8t LLJ;
    public C1318620kQ0 LLJI;
    public WebKitView LLJIJIL;
    public View LLJILJIL;
    public View LLJILJILJ;
    public ViewGroup LLJILLL;
    public View LLJJ;
    public float LLJJI;
    public float LLJJIII;
    public float LLJJIJI;
    public boolean LLJJIJIIJIL;
    public int LLJJIJIL;
    public float LLJJJJ;
    public C16F5 LLJJJJLIIL;
    public long LLJJL;
    public String LLJJJ = "";
    public String LLJJJIL = "{}";
    public String LLJJJJJIL = "";
    public final C1886120zBK LLJJLIIIJLLLLLLLZ = new InterfaceC1142670fqD() { // from class: X.0zBK
        @Override // X.InterfaceC1142670fqD
        public final void LIZ() {
        }

        @Override // X.InterfaceC1142670fqD
        public final void LIZIZ(Animatable animatable) {
        }

        @Override // X.InterfaceC1142670fqD
        public final void LIZLLL(String str, Exception exc) {
            C20441214yg.LJ("GameShortVideoAdDetailFragment", "imageLoad onLoadFailed");
        }

        @Override // X.InterfaceC1142670fqD
        public final void LIZJ(int i, int i2, String str) {
            C20441214yg.LIZIZ("GameShortVideoAdDetailFragment", "imageLoad onLoadSuccess");
        }
    };
    public final C1886030zBB LLJL = new InterfaceC1141530foN() { // from class: X.0zBB
        @Override // X.InterfaceC1141530foN
        public final void mh2(C262100zr c262100zr) {
            String strLJFF;
            boolean zLIZIZ;
            String strLJFF2;
            String strLJFF3;
            String strLJFF4;
            String strLJFF5;
            String strLJFF6;
            String strLJFF7;
            String strLJFF8;
            String strLJFF9;
            String strLJFF10;
            String strLJFF11;
            String strLJFF12;
            String strLJFF13;
            boolean z;
            int iIntValue;
            String str;
            String str2;
            String str3;
            String str4;
            String strLJFF14;
            String str5 = c262100zr.LIZ;
            String str6 = "";
            if (Intrinsics.LJFF(str5, "updateNavBarPartnershipDownloadButton")) {
                GameShortVideoAdDetailPageDialogFragment gameShortVideoAdDetailPageDialogFragment = this.LL;
                gameShortVideoAdDetailPageDialogFragment.getClass();
                InterfaceC1107590evd interfaceC1107590evd = c262100zr.LIZIZ;
                if (interfaceC1107590evd != null) {
                    zLIZIZ = C1871910yoP.LIZIZ(interfaceC1107590evd, "show", false);
                } else {
                    zLIZIZ = false;
                }
                InterfaceC1107590evd interfaceC1107590evd2 = c262100zr.LIZIZ;
                if (interfaceC1107590evd2 == null || (strLJFF2 = C1871910yoP.LJFF(interfaceC1107590evd2, "taskID", "")) == null) {
                    strLJFF2 = "";
                }
                InterfaceC1107590evd interfaceC1107590evd3 = c262100zr.LIZIZ;
                if (interfaceC1107590evd3 == null || (strLJFF3 = C1871910yoP.LJFF(interfaceC1107590evd3, "roomID", "")) == null) {
                    strLJFF3 = "";
                }
                InterfaceC1107590evd interfaceC1107590evd4 = c262100zr.LIZIZ;
                if (interfaceC1107590evd4 == null || (strLJFF4 = C1871910yoP.LJFF(interfaceC1107590evd4, "anchorID", "")) == null) {
                    strLJFF4 = "";
                }
                InterfaceC1107590evd interfaceC1107590evd5 = c262100zr.LIZIZ;
                if (interfaceC1107590evd5 == null || (strLJFF5 = C1871910yoP.LJFF(interfaceC1107590evd5, "gameID", "")) == null) {
                    strLJFF5 = "";
                }
                InterfaceC1107590evd interfaceC1107590evd6 = c262100zr.LIZIZ;
                if (interfaceC1107590evd6 == null || (strLJFF6 = C1871910yoP.LJFF(interfaceC1107590evd6, Scene.SCENE_SERVICE, "")) == null) {
                    strLJFF6 = "";
                }
                InterfaceC1107590evd interfaceC1107590evd7 = c262100zr.LIZIZ;
                if (interfaceC1107590evd7 == null || (strLJFF7 = C1871910yoP.LJFF(interfaceC1107590evd7, "deepLink", "")) == null) {
                    strLJFF7 = "";
                }
                InterfaceC1107590evd interfaceC1107590evd8 = c262100zr.LIZIZ;
                if (interfaceC1107590evd8 == null || (strLJFF8 = C1871910yoP.LJFF(interfaceC1107590evd8, "gameName", "")) == null) {
                    strLJFF8 = "";
                }
                InterfaceC1107590evd interfaceC1107590evd9 = c262100zr.LIZIZ;
                if (interfaceC1107590evd9 == null || (strLJFF9 = C1871910yoP.LJFF(interfaceC1107590evd9, "gameTagID", "")) == null) {
                    strLJFF9 = "";
                }
                InterfaceC1107590evd interfaceC1107590evd10 = c262100zr.LIZIZ;
                if (interfaceC1107590evd10 == null || (strLJFF10 = C1871910yoP.LJFF(interfaceC1107590evd10, "appID", "")) == null) {
                    strLJFF10 = "";
                }
                InterfaceC1107590evd interfaceC1107590evd11 = c262100zr.LIZIZ;
                if (interfaceC1107590evd11 == null || (strLJFF11 = C1871910yoP.LJFF(interfaceC1107590evd11, "packageName", "")) == null) {
                    strLJFF11 = "";
                }
                InterfaceC1107590evd interfaceC1107590evd12 = c262100zr.LIZIZ;
                if (interfaceC1107590evd12 == null || (strLJFF12 = C1871910yoP.LJFF(interfaceC1107590evd12, "siteID", "")) == null) {
                    strLJFF12 = "";
                }
                InterfaceC1107590evd interfaceC1107590evd13 = c262100zr.LIZIZ;
                if (interfaceC1107590evd13 == null || (strLJFF13 = C1871910yoP.LJFF(interfaceC1107590evd13, "sourceID", "")) == null) {
                    strLJFF13 = "";
                }
                InterfaceC1107590evd interfaceC1107590evd14 = c262100zr.LIZIZ;
                if (interfaceC1107590evd14 != null && (strLJFF14 = C1871910yoP.LJFF(interfaceC1107590evd14, "authorID", "")) != null) {
                    str6 = strLJFF14;
                }
                InterfaceC1107590evd interfaceC1107590evd15 = c262100zr.LIZIZ;
                if (interfaceC1107590evd15 != null && C1871910yoP.LIZLLL(interfaceC1107590evd15, "hideDownloadButton", 0) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (strLJFF9.length() == 0) {
                    strLJFF9 = strLJFF13;
                }
                Integer numLJIIJJI = C2095008Iq.LJIIJJI(strLJFF6);
                if (numLJIIJJI != null) {
                    iIntValue = numLJIIJJI.intValue();
                } else {
                    iIntValue = 99;
                }
                if (str6.length() == 0) {
                    str6 = strLJFF4;
                }
                String str7 = null;
                gameShortVideoAdDetailPageDialogFragment.LLJ = new C843930X8t(strLJFF2, strLJFF4, strLJFF5, strLJFF9, iIntValue, strLJFF7, strLJFF8, strLJFF3, strLJFF11, null, strLJFF10, false, strLJFF13, strLJFF12, str6, strLJFF12, null, null, null, 0, null, 0, null, 33491456);
                C16FS c16fs = gameShortVideoAdDetailPageDialogFragment.LLILZ;
                if (c16fs != null) {
                    C786410Ut5.LLJJJ(c16fs, 0);
                }
                ViewGroup.LayoutParams layoutParams = null;
                if (zLIZIZ) {
                    C16F5 c16f5 = gameShortVideoAdDetailPageDialogFragment.LLJJJJLIIL;
                    if (c16f5 != null) {
                        c16f5.setText(strLJFF8);
                    }
                    C16FS c16fs2 = gameShortVideoAdDetailPageDialogFragment.LLILZ;
                    if (c16fs2 != null) {
                        C786410Ut5.j5(c16fs2, 1.0f);
                    }
                    C500260Jjc.LLFFF(gameShortVideoAdDetailPageDialogFragment.LLILZ);
                    C500260Jjc.LLFFF(gameShortVideoAdDetailPageDialogFragment.LLJJJJLIIL);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (jCurrentTimeMillis - gameShortVideoAdDetailPageDialogFragment.LLJJL >= 1000) {
                        gameShortVideoAdDetailPageDialogFragment.LLJJL = jCurrentTimeMillis;
                        C843930X8t c843930X8t = gameShortVideoAdDetailPageDialogFragment.LLJ;
                        DataChannel dataChannel = gameShortVideoAdDetailPageDialogFragment.dataChannel;
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_btn_show");
                        if (c843930X8t != null) {
                            str = c843930X8t.LJIILIIL;
                        } else {
                            str = null;
                        }
                        c474500IjALIZ.LJJII(str, "item_id");
                        if (c843930X8t != null) {
                            str2 = c843930X8t.LJIIL;
                        } else {
                            str2 = null;
                        }
                        c474500IjALIZ.LJJII(str2, "page_id");
                        if (c843930X8t != null) {
                            str3 = c843930X8t.LIZJ;
                        } else {
                            str3 = null;
                        }
                        c474500IjALIZ.LJJII(str3, "game_id");
                        if (c843930X8t != null) {
                            str7 = c843930X8t.LJI;
                        }
                        c474500IjALIZ.LJJII(str7, "game_name");
                        c474500IjALIZ.LJJII("download", "btn_name");
                        c474500IjALIZ.LJJII("user", "user_type");
                        c474500IjALIZ.LJJII("user_game_detail", "page_name");
                        c474500IjALIZ.LJJII("ttcm", "source_entrance");
                        if (C0IXW.LIZLLL(dataChannel)) {
                            str4 = "ad";
                        } else {
                            str4 = "normal";
                        }
                        c474500IjALIZ.LJJII(str4, "traffic_source");
                        c474500IjALIZ.LIZ();
                    }
                } else {
                    C500260Jjc.LJIILLIIL(gameShortVideoAdDetailPageDialogFragment.LLILZ);
                    C500260Jjc.LJIILLIIL(gameShortVideoAdDetailPageDialogFragment.LLJJJJLIIL);
                }
                if (z) {
                    C16F5 c16f52 = gameShortVideoAdDetailPageDialogFragment.LLJJJJLIIL;
                    if (c16f52 != null) {
                        layoutParams = c16f52.getLayoutParams();
                    }
                    C19ME c19me = new C19ME(layoutParams);
                    c19me.endToEnd = 0;
                    c19me.startToStart = 0;
                    c19me.topToTop = 0;
                    c19me.bottomToBottom = 0;
                    C16F5 c16f53 = gameShortVideoAdDetailPageDialogFragment.LLJJJJLIIL;
                    if (c16f53 != null) {
                        C786410Ut5.y6(c16f53, c19me);
                    }
                    C500260Jjc.LJIILLIIL(gameShortVideoAdDetailPageDialogFragment.LLILZ);
                    return;
                }
                return;
            }
            if (!Intrinsics.LJFF(str5, "loadHeaderImage")) {
                return;
            }
            GameShortVideoAdDetailPageDialogFragment gameShortVideoAdDetailPageDialogFragment2 = this.LL;
            gameShortVideoAdDetailPageDialogFragment2.getClass();
            InterfaceC1107590evd interfaceC1107590evd16 = c262100zr.LIZIZ;
            if (interfaceC1107590evd16 != null && (strLJFF = C1871910yoP.LJFF(interfaceC1107590evd16, "url", "")) != null) {
                str6 = strLJFF;
            }
            gameShortVideoAdDetailPageDialogFragment2.NR(str6);
        }
    };
    public final C1886110zBJ LLJLIL = new InterfaceC19562711gH() { // from class: X.0zBJ
        @Override // X.InterfaceC19562711gH
        public final void LLF(Context context) {
            InterfaceC1541990qEH kitView;
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL.LLIZLLLIL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
                kitView.LIZ("appOnEnterForeground", null);
            }
        }

        @Override // X.InterfaceC19562711gH
        public final void LLLLIILLL(Context context) {
            InterfaceC1541990qEH kitView;
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LL.LLIZLLLIL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
                kitView.LIZ("appOnEnterBackground", null);
            }
        }
    };

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    public final void OR() {
        View view = this.LLJJ;
        if ((view != null ? view.getAlpha() : 0.0f) > 0.1f) {
            C500260Jjc.LLFFF(this.LLILLL);
            View view2 = this.LLJILJILJ;
            if (view2 != null) {
                C500260Jjc.LJIILLIIL(view2);
            }
            LiveIconView liveIconView = this.LLILLL;
            if (liveIconView != null) {
                liveIconView.setIconTint(C20736316Cj.LIZIZ(R.attr.ewy, getContext()));
                return;
            }
            return;
        }
        View view3 = this.LLJILJIL;
        if (view3 == null || view3.getAlpha() <= 0.1f) {
            View view4 = this.LLJILJILJ;
            if (view4 != null) {
                C500260Jjc.LJIILLIIL(view4);
            }
            C500260Jjc.LJIILLIIL(this.LLILLL);
            return;
        }
        C500260Jjc.LLFFF(this.LLILLL);
        View view5 = this.LLJILJILJ;
        if (view5 != null) {
            C500260Jjc.LLFFF(view5);
        }
        LiveIconView liveIconView2 = this.LLILLL;
        if (liveIconView2 != null) {
            liveIconView2.setIconTint(C497740JfY.LJFF(R.color.ac4));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C500980Jkm createParams() {
        C500980Jkm c500980Jkm = new C500980Jkm(R.layout.gaq);
        c500980Jkm.LIZIZ = 1;
        c500980Jkm.LIZJ = R.style.ahk;
        c500980Jkm.LJII = 80;
        c500980Jkm.LJIIJ = -1;
        c500980Jkm.LJIIIZ = -1;
        return c500980Jkm;
    }

    static {
        C497740JfY.LJIILL();
        LLJLILLLLZIIL = C497740JfY.LJIILL() * 0.1f;
        int iLIZIZ = ((int) C497740JfY.LIZIZ(44.0f)) * 2;
        LLJLL = iLIZIZ;
        LLJLLIL = iLIZIZ * 2;
        LLJLLL = (int) C497740JfY.LIZIZ(210.0f);
        LLJZ = (int) C497740JfY.LIZIZ(14.0f);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC420801kM interfaceC420801kM;
        super.onDestroy();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLIZLLLIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        C1548820qPI.LJIIIIZZ("updateNavBarPartnershipDownloadButton", this.LLJL);
        C1548820qPI.LJIIIIZZ("loadHeaderImage", this.LLJL);
        InterfaceC420801kM interfaceC420801kM2 = this.LL;
        if (interfaceC420801kM2 != null && !interfaceC420801kM2.isDisposed() && (interfaceC420801kM = this.LL) != null) {
            interfaceC420801kM.dispose();
        }
        this.LL = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        InterfaceC1541990qEH kitView;
        super.onPause();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLIZLLLIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) == null) {
            return;
        }
        kitView.LIZ("viewDisappeared", null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        InterfaceC1541990qEH kitView;
        super.onResume();
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLIZLLLIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) == null) {
            return;
        }
        kitView.LIZ("viewAppeared", null);
    }

    public static C1318620kQ0 MR(ViewGroup viewGroup) {
        if (viewGroup != null && viewGroup.getChildCount() != 0 && (C460180I2u.LIZ(0, viewGroup) instanceof ViewGroup)) {
            if (C460180I2u.LIZ(0, viewGroup) instanceof C1318620kQ0) {
                return (C1318620kQ0) C460180I2u.LIZ(0, viewGroup);
            }
            return MR((ViewGroup) C460180I2u.LIZ(0, viewGroup));
        }
        return null;
    }

    public final void NR(String str) {
        if (str.length() == 0) {
            return;
        }
        C1324610kZf c1324610kZfLIZLLL = C1819620xS4.LIZ().LIZLLL(this.LLJJLIIIJLLLLLLLZ);
        c1324610kZfLIZLLL.setUrl(str);
        c1324610kZfLIZLLL.LJIL = true;
        c1324610kZfLIZLLL.LJJI(this.LLJILJIL);
    }

    public final void PR(float f) {
        View childAt;
        ViewGroup viewGroup = this.LLJILLL;
        if (viewGroup != null && (childAt = viewGroup.getChildAt(0)) != null) {
            C786410Ut5.T4(childAt, f);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateHeaderCoverAlpha = ");
        sbLIZ.append(f);
        C20441214yg.LIZIZ("GameShortVideoAdDetailFragment", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        float fFloatValue;
        String string2;
        Float fLJIIIIZZ;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("lynx_schema")) == null) {
            string = "";
        }
        C760370TsB c760370TsBLIZ = C0KYL.LIZ(string);
        String strLIZIZ = c760370TsBLIZ.LIZIZ("initial_height_ratio");
        if (strLIZIZ != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(strLIZIZ)) != null) {
            fFloatValue = fLJIIIIZZ.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        this.LLJJJJ = fFloatValue;
        String strLIZIZ2 = c760370TsBLIZ.LIZIZ("header_image_url");
        if (strLIZIZ2 == null) {
            strLIZIZ2 = "";
        }
        this.LLJJJJJIL = strLIZIZ2;
        String strLIZIZ3 = c760370TsBLIZ.LIZIZ("log_extra_str");
        if (strLIZIZ3 != null) {
            str = strLIZIZ3;
        }
        if (str.length() > 0) {
            try {
                new JSONObject(str);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        c760370TsBLIZ.LJJIFFI("is_new_game_container", "1");
        if (c760370TsBLIZ.LIZJ("fallback_url") && c760370TsBLIZ.LIZJ("fallback_url")) {
            ((HashMap) c760370TsBLIZ.LIZ).remove("fallback_url");
        }
        this.LLJJJ = c760370TsBLIZ.LIZ().toString();
        float f = this.LLJJJJ;
        if (f < 0.2d) {
            f = 0.6f;
        }
        this.LLILLJJLI = C497740JfY.LJIILL() * f;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string2 = arguments2.getString("initial_data")) == null) {
            string2 = "{}";
        }
        this.LLJJJIL = string2;
        this.LL = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).registerAppEnterForeBackgroundCallback(this.LLJLIL);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        final int scrollY;
        ViewGroup.LayoutParams layoutParams;
        super.onViewCreated(view, bundle);
        this.LLJILJIL = view.findViewById(R.id.iqr);
        this.LLILLL = (LiveIconView) view.findViewById(R.id.jux);
        this.LLILZ = (C16FS) view.findViewById(R.id.g41);
        LiveIconView liveIconView = this.LLILLL;
        if (liveIconView != null) {
            C786410Ut5.g8(liveIconView, new View.OnClickListener() { // from class: X.0zBL
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    BottomSheetBehavior<?> bottomSheetBehavior = this.LL.LLILZIL;
                    if (bottomSheetBehavior != null) {
                        bottomSheetBehavior.setState(5);
                    }
                }
            });
        }
        C16FS c16fs = this.LLILZ;
        if (c16fs != null) {
            C786410Ut5.h8(c16fs, new View.OnClickListener() { // from class: X.0z5X
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str;
                    String str2;
                    final GameShortVideoAdDetailPageDialogFragment gameShortVideoAdDetailPageDialogFragment = this.LL;
                    final C843930X8t c843930X8t = gameShortVideoAdDetailPageDialogFragment.LLJ;
                    if (c843930X8t != null) {
                        C823050WQl.LIZIZ().submit(new Runnable() { // from class: X.0X8y
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C843920X8s c843920X8sJe0;
                                C1C7U.LIZ("GameShortVideoAdDetailPageDialogFragment@4ca4.initViewAndClickListener$2$1$1");
                                try {
                                    IGamePartnershipService iGamePartnershipService = (IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class);
                                    if (iGamePartnershipService != null && (c843920X8sJe0 = iGamePartnershipService.Je0()) != null) {
                                        c843920X8sJe0.LJFF(gameShortVideoAdDetailPageDialogFragment.getContext(), c843930X8t, null);
                                    }
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("GameShortVideoAdDetailPageDialogFragment@4ca4.initViewAndClickListener$2$1$1");
                            }
                        });
                        C843930X8t c843930X8t2 = gameShortVideoAdDetailPageDialogFragment.LLJ;
                        DataChannel dataChannel = gameShortVideoAdDetailPageDialogFragment.dataChannel;
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_btn_click");
                        c474500IjALIZ.LJJII("user", "user_type");
                        c474500IjALIZ.LJJII("user_game_detail", "page_name");
                        c474500IjALIZ.LJJII("ttcm", "source_entrance");
                        c474500IjALIZ.LJJII("", "item_id");
                        c474500IjALIZ.LJJII("", "campaign_id");
                        String str3 = null;
                        if (c843930X8t2 != null) {
                            str = c843930X8t2.LIZJ;
                        } else {
                            str = null;
                        }
                        c474500IjALIZ.LJJII(str, "game_id");
                        if (c843930X8t2 != null) {
                            str3 = c843930X8t2.LJI;
                        }
                        c474500IjALIZ.LJJII(str3, "game_name");
                        if (C0IXW.LIZLLL(dataChannel)) {
                            str2 = "ad";
                        } else {
                            str2 = "normal";
                        }
                        c474500IjALIZ.LJJII(str2, "traffic_source");
                        c474500IjALIZ.LJJII("download", "btn_name");
                        c474500IjALIZ.LIZ();
                    }
                }
            });
        }
        this.LLJJJJLIIL = (C16F5) view.findViewById(R.id.zsj);
        this.LLJILJILJ = view.findViewById(R.id.juz);
        View view2 = getView();
        if (view2 != null) {
            view2.setOnTouchListener(new View.OnTouchListener() { // from class: X.0zBD
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                    int x;
                    int y;
                    View viewFindViewById;
                    GameShortVideoAdDetailPageDialogFragment gameShortVideoAdDetailPageDialogFragment = this.LL;
                    BottomSheetBehavior<?> bottomSheetBehavior = gameShortVideoAdDetailPageDialogFragment.LLILZIL;
                    if (bottomSheetBehavior != null && bottomSheetBehavior.getState() == 4) {
                        if (motionEvent != null) {
                            x = (int) motionEvent.getX();
                            y = (int) motionEvent.getY();
                        } else {
                            x = 0;
                            y = 0;
                        }
                        Rect rect = new Rect();
                        View view4 = gameShortVideoAdDetailPageDialogFragment.getView();
                        if (view4 != null && (viewFindViewById = view4.findViewById(R.id.iqe)) != null) {
                            viewFindViewById.getGlobalVisibleRect(rect);
                        }
                        if (!rect.contains(x, y)) {
                            gameShortVideoAdDetailPageDialogFragment.dismiss();
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
            });
        }
        this.LLIZ = view.findViewById(R.id.kl1);
        C1884370z8V c1884370z8V = (C1884370z8V) view.findViewById(R.id.iqe);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.iqs);
        this.LLJILLL = viewGroup;
        if (viewGroup != null && (layoutParams = viewGroup.getLayoutParams()) != null) {
            layoutParams.height = LLJLLL;
        }
        this.LLJJ = view.findViewById(R.id.iq_);
        BottomSheetBehavior<?> bottomSheetBehaviorFrom = BottomSheetBehavior.from(c1884370z8V);
        this.LLILZIL = bottomSheetBehaviorFrom;
        if (bottomSheetBehaviorFrom != null) {
            bottomSheetBehaviorFrom.setHideable(true);
        }
        BottomSheetBehavior<?> bottomSheetBehavior = this.LLILZIL;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setPeekHeight((int) this.LLILLJJLI);
        }
        ViewGroup viewGroup2 = this.LLJILLL;
        if (viewGroup2 != null) {
            scrollY = viewGroup2.getScrollY();
        } else {
            scrollY = 0;
        }
        BottomSheetBehavior<?> bottomSheetBehavior2 = this.LLILZIL;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.addBottomSheetCallback(new AbstractC1177930gl5() { // from class: X.0zBC
                @Override // X.AbstractC1177930gl5
                public final void LIZJ(View view3, float f) {
                    WebKitView webKitView;
                    BottomSheetBehavior<?> bottomSheetBehavior3;
                    int peekHeight;
                    int i;
                    boolean z;
                    View view4;
                    View childAt;
                    View viewE1;
                    ViewTreeObserver viewTreeObserver;
                    InterfaceC1541990qEH kitView;
                    View viewE12;
                    InterfaceC1541990qEH kitView2;
                    InterfaceC1541990qEH kitView3;
                    final GameShortVideoAdDetailPageDialogFragment gameShortVideoAdDetailPageDialogFragment = this.LIZ;
                    View view5 = view;
                    int i2 = scrollY;
                    gameShortVideoAdDetailPageDialogFragment.LLJJI = f;
                    C1318620kQ0 c1318620kQ0 = gameShortVideoAdDetailPageDialogFragment.LLJI;
                    int i3 = 0;
                    if (c1318620kQ0 == null && gameShortVideoAdDetailPageDialogFragment.LLJIJIL == null) {
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = gameShortVideoAdDetailPageDialogFragment.LLIZLLLIL;
                        View viewE13 = null;
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null && (kitView3 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) != null) {
                            viewE1 = kitView3.e1();
                        } else {
                            viewE1 = null;
                        }
                        if (viewE1 instanceof WebKitView) {
                            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = gameShortVideoAdDetailPageDialogFragment.LLIZLLLIL;
                            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null && (kitView2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.getKitView()) != null) {
                                viewE12 = kitView2.e1();
                            } else {
                                viewE12 = null;
                            }
                            WebKitView webKitView2 = (WebKitView) viewE12;
                            gameShortVideoAdDetailPageDialogFragment.LLJIJIL = webKitView2;
                            ViewGroup.LayoutParams layoutParams2 = webKitView2.getLayoutParams();
                            if (layoutParams2 != null) {
                                layoutParams2.height = -2;
                            }
                        }
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 = gameShortVideoAdDetailPageDialogFragment.LLIZLLLIL;
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3 != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB3.getKitView()) != null) {
                            viewE13 = kitView.e1();
                        }
                        C1318620kQ0 c1318620kQ0MR = GameShortVideoAdDetailPageDialogFragment.MR((ViewGroup) viewE13);
                        gameShortVideoAdDetailPageDialogFragment.LLJI = c1318620kQ0MR;
                        if (c1318620kQ0MR != null && (viewTreeObserver = c1318620kQ0MR.getViewTreeObserver()) != null) {
                            ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.0zBE
                                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                                public final void onScrollChanged() {
                                    BottomSheetBehavior<?> bottomSheetBehavior4;
                                    C1318620kQ0 c1318620kQ02 = gameShortVideoAdDetailPageDialogFragment.LLJI;
                                    int scrollY2 = c1318620kQ02 != null ? c1318620kQ02.getScrollY() : 0;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("scrollY  ");
                                    sbLIZ.append(scrollY2);
                                    C20441214yg.LIZIZ("GameShortVideoAdDetailFragment", C2188811AlT.LIZIZ(sbLIZ));
                                    if (scrollY2 > 1 || (bottomSheetBehavior4 = gameShortVideoAdDetailPageDialogFragment.LLILZIL) == null) {
                                        return;
                                    }
                                    bottomSheetBehavior4.setDraggable(true);
                                }
                            };
                            viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
                            C2187701Ajg.LIZ(viewTreeObserver, onScrollChangedListener, ViewTreeObserver.OnScrollChangedListener.class);
                        }
                        WebKitView webKitView3 = gameShortVideoAdDetailPageDialogFragment.LLJIJIL;
                        if (webKitView3 != null) {
                            webKitView3.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: X.0zBF
                                @Override // android.view.View.OnScrollChangeListener
                                public final void onScrollChange(View view6, int i4, int i5, int i6, int i7) {
                                    BottomSheetBehavior<?> bottomSheetBehavior4;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("scrollY  ");
                                    sbLIZ.append(i5);
                                    C20441214yg.LIZIZ("GameShortVideoAdDetailFragment", C2188811AlT.LIZIZ(sbLIZ));
                                    if (i5 <= 1 && (bottomSheetBehavior4 = gameShortVideoAdDetailPageDialogFragment.LLILZIL) != null) {
                                        bottomSheetBehavior4.setDraggable(true);
                                    }
                                }
                            });
                        }
                    } else if (((c1318620kQ0 != null && c1318620kQ0.canScrollVertically(-1)) || ((webKitView = gameShortVideoAdDetailPageDialogFragment.LLJIJIL) != null && webKitView.canScrollVertically(-1))) && (bottomSheetBehavior3 = gameShortVideoAdDetailPageDialogFragment.LLILZIL) != null) {
                        bottomSheetBehavior3.setDraggable(false);
                    }
                    if (gameShortVideoAdDetailPageDialogFragment.LLILZLL <= 0) {
                        int height = view5.getHeight();
                        gameShortVideoAdDetailPageDialogFragment.LLILZLL = height;
                        float f2 = 1 - ((GameShortVideoAdDetailPageDialogFragment.LLJLLL - GameShortVideoAdDetailPageDialogFragment.LLJZ) / height);
                        BottomSheetBehavior<?> bottomSheetBehavior4 = gameShortVideoAdDetailPageDialogFragment.LLILZIL;
                        if (bottomSheetBehavior4 != null) {
                            bottomSheetBehavior4.setHalfExpandedRatio(f2);
                        }
                        gameShortVideoAdDetailPageDialogFragment.LLJJIJIL = (int) (gameShortVideoAdDetailPageDialogFragment.LLILZLL * f2);
                    }
                    BottomSheetBehavior<?> bottomSheetBehavior5 = gameShortVideoAdDetailPageDialogFragment.LLILZIL;
                    if (bottomSheetBehavior5 != null) {
                        peekHeight = bottomSheetBehavior5.getPeekHeight();
                    } else {
                        peekHeight = 0;
                    }
                    int i4 = gameShortVideoAdDetailPageDialogFragment.LLILZLL - peekHeight;
                    if (f > 0.0f) {
                        i = i4;
                    } else {
                        i = peekHeight;
                    }
                    float f3 = i * f;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("curSlideOffset");
                    sbLIZ.append(gameShortVideoAdDetailPageDialogFragment.LLJJI);
                    sbLIZ.append(", scrolledDistance =");
                    sbLIZ.append(f3);
                    C20441214yg.LIZIZ("GameShortVideoAdDetailFragment", C2188811AlT.LIZIZ(sbLIZ));
                    float f4 = GameShortVideoAdDetailPageDialogFragment.LLJLILLLLZIIL;
                    if (f3 > f4) {
                        gameShortVideoAdDetailPageDialogFragment.PR((f3 - f4) / ((gameShortVideoAdDetailPageDialogFragment.LLJJIJIL - peekHeight) - f4));
                    } else {
                        gameShortVideoAdDetailPageDialogFragment.PR(0.0f);
                    }
                    float f5 = f3 - (gameShortVideoAdDetailPageDialogFragment.LLJJIJIL - peekHeight);
                    if (f5 > 0.0f) {
                        gameShortVideoAdDetailPageDialogFragment.LLJJIJIIJIL = true;
                        float f6 = f3 - gameShortVideoAdDetailPageDialogFragment.LLJJIJI;
                        ViewGroup viewGroup3 = gameShortVideoAdDetailPageDialogFragment.LLJILLL;
                        if (viewGroup3 != null) {
                            viewGroup3.scrollBy(0, (int) f6);
                        }
                        ViewGroup viewGroup4 = gameShortVideoAdDetailPageDialogFragment.LLJILLL;
                        if (viewGroup4 != null && (childAt = viewGroup4.getChildAt(0)) != null) {
                            C786410Ut5.T4(childAt, 1.0f);
                        }
                        ViewGroup viewGroup5 = gameShortVideoAdDetailPageDialogFragment.LLJILLL;
                        if (viewGroup5 != null) {
                            int scrollY2 = viewGroup5.getScrollY();
                            if (scrollY2 <= 0) {
                                scrollY2 = 0;
                            }
                            viewGroup5.setScrollY(scrollY2);
                        }
                    } else if (gameShortVideoAdDetailPageDialogFragment.LLJJIJIIJIL) {
                        gameShortVideoAdDetailPageDialogFragment.LLJJIJIIJIL = false;
                        ViewGroup viewGroup6 = gameShortVideoAdDetailPageDialogFragment.LLJILLL;
                        if (viewGroup6 != null) {
                            viewGroup6.setScrollY(i2);
                        }
                    }
                    if (f > 0.0f) {
                        float f7 = i4 - f3;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("sendOffsetEvent offset=");
                        sbLIZ2.append(f7);
                        C20441214yg.LIZIZ("GameShortVideoAdDetailFragment", C2188811AlT.LIZIZ(sbLIZ2));
                        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 = gameShortVideoAdDetailPageDialogFragment.LLIZLLLIL;
                        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4 != null) {
                            C0J39.LIZJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB4, "gameDetailPageTopOffsetDidChange", new JSONObject().put("offset", Float.valueOf(f7)));
                        }
                    }
                    if (0.0f <= f && f <= 0.2f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (f > 0.0f && C500260Jjc.LJJJJIZL(gameShortVideoAdDetailPageDialogFragment.LLIZ) != z && (view4 = gameShortVideoAdDetailPageDialogFragment.LLIZ) != null) {
                        if (!z) {
                            i3 = 8;
                        }
                        C786410Ut5.LJLLLLLL(i3, view4);
                    }
                    if (f5 > 0.0f) {
                        float f8 = gameShortVideoAdDetailPageDialogFragment.LLILZLL - (peekHeight + f3);
                        if (f8 < GameShortVideoAdDetailPageDialogFragment.LLJLL) {
                            View view6 = gameShortVideoAdDetailPageDialogFragment.LLJJ;
                            if (view6 != null) {
                                C786410Ut5.T4(view6, 1.0f);
                            }
                        } else {
                            View view7 = gameShortVideoAdDetailPageDialogFragment.LLJJ;
                            if (view7 != null) {
                                C786410Ut5.T4(view7, 1 - (f8 / GameShortVideoAdDetailPageDialogFragment.LLJLLIL));
                            }
                        }
                    } else {
                        View view8 = gameShortVideoAdDetailPageDialogFragment.LLJJ;
                        if (view8 != null) {
                            C786410Ut5.T4(view8, 0.0f);
                        }
                    }
                    gameShortVideoAdDetailPageDialogFragment.LLJJIJI = f3;
                    gameShortVideoAdDetailPageDialogFragment.OR();
                }

                @Override // X.AbstractC1177930gl5
                public final void LIZLLL(int i, View view3) {
                    GameShortVideoAdDetailPageDialogFragment gameShortVideoAdDetailPageDialogFragment = this.LIZ;
                    if (i != 4) {
                        if (i != 5) {
                            if (i == 6) {
                                gameShortVideoAdDetailPageDialogFragment.PR(1.0f);
                                ViewGroup viewGroup3 = gameShortVideoAdDetailPageDialogFragment.LLJILLL;
                                if (viewGroup3 != null) {
                                    viewGroup3.setScrollY(0);
                                }
                            }
                        } else {
                            gameShortVideoAdDetailPageDialogFragment.dismiss();
                        }
                    } else {
                        gameShortVideoAdDetailPageDialogFragment.PR(0.0f);
                    }
                    gameShortVideoAdDetailPageDialogFragment.OR();
                }
            });
        }
        if (c1884370z8V != null) {
            c1884370z8V.setClickActionListener(new C1886090zBH(c1884370z8V, this));
        }
        View view3 = this.LLJJ;
        if (view3 != null) {
            C786410Ut5.T4(view3, 0.0f);
        }
        PR(0.0f);
        View view4 = this.LLJILJILJ;
        if (view4 != null) {
            C500260Jjc.LJIILLIIL(view4);
        }
        C500260Jjc.LJIILLIIL(this.LLILLL);
        C16FS c16fs2 = this.LLILZ;
        if (c16fs2 != null) {
            C500260Jjc.LJIILLIIL(c16fs2);
        }
        C16F5 c16f5 = this.LLJJJJLIIL;
        if (c16f5 != null) {
            C500260Jjc.LJIILLIIL(c16f5);
        }
        ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.nub);
        if (viewGroup3 != null) {
            Context context = viewGroup3.getContext();
            String str = this.LLJJJ;
            w.LIZ.getClass();
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("is_host", CardStruct.IStatusCode.DEFAULT), new Pair("action_type", w.LIZLLL()), new Pair("enter_method", w.LJIIL()), new Pair("enter_from_merge", w.LJIIIZ()), new Pair("is_landscape", CardStruct.IStatusCode.DEFAULT), new Pair("page_from", "icon"));
            String str2 = this.LLJJJIL;
            C760370TsB c760370TsBLIZ = C0KYL.LIZ(str);
            c760370TsBLIZ.LJJII(mapLJIIIIZZ);
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).DU1(context, c760370TsBLIZ.LIZ().toString(), null, true, new AwS68S1000000_17(str2, 0));
            this.LLIZLLLIL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1;
            viewGroup3.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1, new ViewGroup.LayoutParams(-1, -1));
            NR(this.LLJJJJJIL);
        }
        C1548820qPI.LIZLLL("updateNavBarPartnershipDownloadButton", this.LLJL);
        C1548820qPI.LIZLLL("loadHeaderImage", this.LLJL);
    }
}
