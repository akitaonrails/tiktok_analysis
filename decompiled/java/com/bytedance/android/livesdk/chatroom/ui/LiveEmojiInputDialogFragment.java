package com.bytedance.android.livesdk.chatroom.ui;

import X.AbstractC1114240f6M;
import X.AbstractC1115080f7i;
import X.C098200Yq;
import X.C0DRA;
import X.C0IGR;
import X.C0IJT;
import X.C0J3Y;
import X.C0WZX;
import X.C1081010eEl;
import X.C1085120eLO;
import X.C1110390f09;
import X.C1114250f6N;
import X.C1114260f6O;
import X.C1114290f6R;
import X.C1114370f6Z;
import X.C1114670f73;
import X.C1114680f74;
import X.C1114950f7V;
import X.C1114970f7X;
import X.C1114980f7Y;
import X.C1115060f7g;
import X.C1115090f7j;
import X.C1115140f7o;
import X.C1115150f7p;
import X.C1124870fNV;
import X.C1148170fz5;
import X.C1161920gLG;
import X.C1300480jwk;
import X.C1338270kvh;
import X.C1389600mGU;
import X.C14K9;
import X.C1685300txQ;
import X.C16F5;
import X.C16FS;
import X.C181500mr;
import X.C189200o6;
import X.C19EG;
import X.C19EH;
import X.C19GS;
import X.C19ME;
import X.C1CC2;
import X.C1EOY;
import X.C20441214yg;
import X.C20586115gx;
import X.C20736316Cj;
import X.C20743516Fd;
import X.C2104308Mf;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2685012d;
import X.C416610GVf;
import X.C418350Gan;
import X.C474500IjA;
import X.C476750Imn;
import X.C476760Imo;
import X.C484660IzY;
import X.C497740JfY;
import X.C500260Jjc;
import X.C501600Jlm;
import X.C508920Jxa;
import X.C513310KBd;
import X.C520890Kbn;
import X.C755520TkM;
import X.C766270U4b;
import X.C784440Upu;
import X.C786410Ut5;
import X.C800330VaR;
import X.EnumC1110450f0F;
import X.EnumC1114820f7I;
import X.EnumC1134120fcQ;
import X.EnumC584890Mwp;
import X.InterfaceC1106030et7;
import X.InterfaceC1107790evx;
import X.InterfaceC1112060f2q;
import X.InterfaceC1114610f6x;
import X.InterfaceC1115130f7n;
import X.InterfaceC1115250f7z;
import X.InterfaceC1115260f80;
import X.InterfaceC1115270f81;
import X.InterfaceC1115280f82;
import X.InterfaceC1115310f85;
import X.InterfaceC19323110ij;
import X.InterfaceC500940Jki;
import X.RunnableC1115110f7l;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import X.ViewOnLayoutChangeListenerC1151610g4d;
import Y.ACListenerS152S0100000_17;
import Y.ARunnableS117S0100000_17;
import Y.ARunnableS22S1100000_17;
import Y.ARunnableS86S0200000_17;
import Y.ARunnableS94S0000000_17;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.LiveCommentPanelShowDirectTimeThresholdSetting;
import com.bytedance.android.LiveCommentSendButtonOptSetting;
import com.bytedance.android.live.LiveCommentInnerHintSizeOptSetting;
import com.bytedance.android.live.LiveCommentPanelOpenOptV2Setting;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.notify.ILiveNotifyService;
import com.bytedance.android.live.publicscreen.api.IPublicScreenService;
import com.bytedance.android.livesdk.chatroom.model.ChatResult;
import com.bytedance.android.livesdk.chatroom.model.InputAttrs;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.dataChannel.IsLiveStudioMonitorChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.increase.IncreaseSDKTriggerEvent;
import com.bytedance.android.livesdk.livesetting.comment.LiveCommentInputDialogDismissFixSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubPrivilegeConfigSetting;
import com.bytedance.android.livesdk.livesetting.level.FansClubSendEmoteEventsSettings;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveCommentDrawableEmojiSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.performance.emote.EmoteFixTextHelper;
import com.bytedance.android.livesdk.performance.emote.EmotePerformanceTrackerViewModel;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdk.utils.KeyBoardUtil;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LayeredElementConfiguration;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public final class LiveEmojiInputDialogFragment extends ControllableDialogFragment implements InterfaceC19323110ij, InterfaceC1115250f7z, C0IGR, InterfaceC1107790evx {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiA/LSR9Ky0tPT08HELIOSJyhiPCZ9BCw6LAo+Jy8lACEjPTEIIC4/JyIKOy40JSAiPQ==";
    public int LL;
    public boolean LLILLJJLI;
    public DataChannel LLILLL;
    public InterfaceC1115130f7n LLILZ;
    public InterfaceC1115260f80 LLILZIL;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public EnumC1114820f7I LLJI = EnumC1114820f7I.Keyboard;
    public String LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public long LLJJI;
    public boolean LLJJIII;
    public String LLJJIJI;
    public String LLJJIJIIJIL;
    public String LLJJIJIL;
    public List<EmoteWithIndex> LLJJJ;
    public boolean LLJJJIL;
    public EmotePerformanceTrackerViewModel LLJJJJ;
    public MeasureLinearLayout LLJJJJJIL;
    public InterfaceC1114610f6x LLJJJJLIIL;
    public View LLJJL;
    public LiveIconView LLJJLIIIJLLLLLLLZ;
    public LiveIconView LLJL;
    public LiveIconView LLJLIL;
    public C20586115gx LLJLILLLLZIIL;
    public C16F5 LLJLL;
    public TextView LLJLLIL;
    public View LLJLLL;
    public View LLJZ;
    public View LLJZIJLIL;
    public C1085120eLO LLL;
    public C1115150f7p LLLF;
    public LinearLayout LLLFF;
    public ViewPager LLLFFI;
    public AbstractC1115080f7i LLLFZ;
    public EmoteFixTextHelper LLLI;
    public C1115060f7g LLLII;
    public C1114290f6R LLLIIII;
    public LinearLayout LLLIIIIL;
    public C1114970f7X LLLIIIL;
    public LiveIconView LLLIIL;
    public LiveIconView LLLIILIL;
    public boolean LLLIL;
    public long LLLILZ;
    public Boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public int LLLIZZ;
    public int LLLJ;
    public final int LLLJIL;
    public final int LLLJL;
    public boolean LLLL;
    public boolean LLLLII;
    public boolean LLLLIIIILLL;
    public JSONObject LLLLIIL;
    public final List<AbstractC1115080f7i> LLLLIILL;
    public boolean LLLLIILLL;
    public InterfaceC1115280f82 LLLLIL;
    public ValueAnimator LLLLILI;
    public BPEAHandler LLLLJ;
    public C1115090f7j LLLLJI;
    public int LLLLL;
    public int LLLLLIL;
    public boolean LLLLLILLIL;
    public Room LLLLLJIL;
    public String LLLLLJLJLL;
    public String LLLLLL;
    public C20743516Fd LLLLLLIL;
    public Boolean LLLLLLJ;
    public Boolean LLLLLLL;
    public Boolean LLLLLLLLL;
    public final ACListenerS152S0100000_17 LLLLLLLLLL;
    public final C1114950f7V LLLLLLLZIL;
    public final C1114980f7Y LLLLLLZ;
    public boolean LLLLLLZZ;

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment
    public final boolean isSheet() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (this.LLIZLLLIL || this.LLJI == EnumC1114820f7I.Panel) {
            this.LLJLILLLLZIIL.requestFocus();
        }
        if (this.LLJI == EnumC1114820f7I.Keyboard && this.LLIZ && this.LLJLILLLLZIIL != null) {
            HandlerHook.viewPostDelay(this.LLJLILLLLZIIL, new RunnableC1115110f7l(this, 200L, 1, 7), 200L);
        }
    }

    public final void wS() {
        this.LLLLLLIL = null;
        if (!C513310KBd.LIZ(this.LLJILJILJ, (Room) this.LLILLL.gg0(RoomChannel.class))) {
            this.LLJL.setIconAttr(R.attr.efc);
        } else {
            this.LLJL.setIconAttr(R.attr.duz);
            this.LLLLLLIL = this.LLJL.getIcon();
        }
    }

    public final int PR() {
        View view = this.LLJZ;
        return (view == null || view.getMeasuredHeight() == 0) ? (int) C497740JfY.LIZIZ(60.0f) : this.LLJZ.getMeasuredHeight();
    }

    public final void RR() {
        if (!this.LLILLJJLI || this.LLJLILLLLZIIL == null) {
            return;
        }
        KeyBoardUtil.LIZJ(getContext(), this.LLJLILLLLZIIL);
    }

    public final void bS() {
        C20586115gx c20586115gx;
        if (this.LLLI == null || (c20586115gx = this.LLJLILLLLZIIL) == null || C2204961BRm.LLLII(c20586115gx, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null)) == null) {
            return;
        }
        this.LLLLII = true;
        if (this.LLLI.LJIIIIZZ(this.LLJLILLLLZIIL, 100)) {
            C766270U4b.LJIIJJI(getString(2131841268));
        }
        this.LLLLII = false;
    }

    public final void iS() {
        if (this.LLJILLL) {
            return;
        }
        this.LLJI = EnumC1114820f7I.Panel;
        this.LLLFZ = this.LLLIIII;
        this.LLJLILLLLZIIL.setShowSoftInputOnFocus(true);
        if (this.LLJ) {
            int iIndexOf = ((ArrayList) this.LLLLIILL).indexOf(this.LLLFZ);
            if (iIndexOf != -1) {
                cS(iIndexOf, "");
                this.LLLFFI.setCurrentItem(iIndexOf, false);
            }
        }
        HandlerHook.viewPost(this.LLJLILLLLZIIL, new ARunnableS86S0200000_17(this, this.LLJI, 15));
    }

    public final void mS() {
        if (this.LLJILLL) {
            return;
        }
        this.LLJI = EnumC1114820f7I.Keyboard;
        boolean zIsEmpty = TextUtils.isEmpty(C2204961BRm.LLLIIII(this.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null)));
        yS(zIsEmpty);
        if (!zIsEmpty) {
            this.LLJLIL.setClickable(true);
        }
        HandlerHook.viewPost(this.LLJLILLLLZIIL, new ARunnableS86S0200000_17(this, this.LLJI, 15));
    }

    public final void oS() {
        C20586115gx c20586115gx = this.LLJLILLLLZIIL;
        if (c20586115gx != null) {
            c20586115gx.setText(this.LLJJIJI);
            if (TextUtils.isEmpty(this.LLJJIJI)) {
                return;
            }
            this.LLJLILLLLZIIL.setSelection(this.LLJJIJI.length());
        }
    }

    @Override // X.C0IGR
    public final boolean onBackPressed() {
        if (this.LLLLJI == null || !isAdded()) {
            return false;
        }
        MR();
        return true;
    }

    public final void zS() {
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() && this.LLLLJ != null && this.LLJLLL != null && (this.LLLF.getLayoutParams() instanceof C19ME)) {
            C19ME c19me = (C19ME) this.LLLF.getLayoutParams();
            c19me.bottomToTop = -1;
            int y = (int) this.LLJLLL.getY();
            if (this.LLLLLLZZ) {
                y -= (int) C497740JfY.LIZIZ(36.0f);
            }
            ((ViewGroup.MarginLayoutParams) c19me).height = y;
            C1115150f7p c1115150f7p = this.LLLF;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1115150f7p);
            c1115150f7p.setLayoutParams(c19me);
            this.LLLF.invalidate();
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0f7Y] */
    public LiveEmojiInputDialogFragment() {
        Boolean bool = Boolean.FALSE;
        this.LLLILZJ = bool;
        this.LLLILZLLLI = false;
        this.LLLIZZ = 0;
        this.LLLJIL = (int) C497740JfY.LIZIZ(218.0f);
        this.LLLJL = (int) C497740JfY.LIZIZ(235.0f);
        this.LLLL = false;
        this.LLLLII = false;
        this.LLLLIIIILLL = true;
        this.LLLLIILL = new ArrayList();
        this.LLLLL = 0;
        this.LLLLLIL = 0;
        this.LLLLLILLIL = true;
        this.LLLLLJLJLL = "";
        this.LLLLLL = "";
        this.LLLLLLIL = null;
        this.LLLLLLJ = bool;
        this.LLLLLLL = bool;
        this.LLLLLLLLL = bool;
        this.LLLLLLLLLL = new ACListenerS152S0100000_17(this, 24);
        this.LLLLLLLZIL = new C1114950f7V(this);
        this.LLLLLLZ = new InterfaceC1115270f81() { // from class: X.0f7Y
            @Override // X.InterfaceC1114320f6U
            public final void LIZJ() {
                this.LIZ.ZR(1);
            }

            @Override // X.InterfaceC1114320f6U
            public final void LJ(AbstractC1115080f7i abstractC1115080f7i) {
            }

            @Override // X.InterfaceC1114330f6V
            public final void LIZIZ() {
                this.LIZ.LLJLILLLLZIIL.dispatchKeyEvent(new KeyEvent(0, 67));
            }

            @Override // X.InterfaceC1114320f6U
            public final void LIZ() {
                boolean zLJI = MethodIDManager.LJI(72081);
                this.LIZ.MR();
                if (zLJI) {
                    MethodIDManager.LJ();
                }
            }

            @Override // X.InterfaceC1114330f6V
            public final void LIZLLL(C1115500f8O c1115500f8O) throws Throwable {
                C20586115gx c20586115gx;
                Bitmap bitmap;
                if (c1115500f8O instanceof C1115490f8N) {
                    C1115490f8N c1115490f8N = (C1115490f8N) c1115500f8O;
                    String str = c1115490f8N.LLILLJJLI;
                    LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = this.LIZ;
                    int iLJI = liveEmojiInputDialogFragment.LLLI.LJI(C2204961BRm.LLLII(liveEmojiInputDialogFragment.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null)), null) + 2;
                    this.LIZ.getClass();
                    if (iLJI > 100) {
                        C766270U4b.LJIIJJI(this.LIZ.getString(2131841268));
                        return;
                    }
                    int selectionStart = this.LIZ.LLJLILLLLZIIL.getSelectionStart();
                    LiveEmojiInputDialogFragment liveEmojiInputDialogFragment2 = this.LIZ;
                    liveEmojiInputDialogFragment2.LLLLII = true;
                    liveEmojiInputDialogFragment2.LLLI.LIZ(selectionStart, c1115490f8N.LLILLJJLI);
                    this.LIZ.WR(str);
                    C1115360f8A c1115360f8A = C1115380f8C.LIZ;
                    C20586115gx c20586115gx2 = this.LIZ.LLJLILLLLZIIL;
                    if (LiveCommentDrawableEmojiSetting.INSTANCE.getValue() && (bitmap = c1115490f8N.LL) != null) {
                        C2204961BRm.LLJILLL(c20586115gx2, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CV0UZlslQr3F3R5tjPHDq9c5Gz18UPhNqxUvSQ=", null)).setSpan(C1115380f8C.LIZIZ(selectionStart, c1115490f8N.LLILLJJLI.length() + selectionStart, new BitmapDrawable(c20586115gx2.getResources(), bitmap), c1115490f8N.LLILLJJLI), selectionStart, c1115490f8N.LLILLJJLI.length() + selectionStart, 33);
                    }
                    this.LIZ.LLLLII = false;
                    return;
                }
                if (c1115500f8O == null || c1115500f8O.previewEmoji == null || (c20586115gx = this.LIZ.LLJLILLLLZIIL) == null || C2204961BRm.LLLIIII(c20586115gx, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null)) == null) {
                    return;
                }
                LiveEmojiInputDialogFragment liveEmojiInputDialogFragment3 = this.LIZ;
                int iLJI2 = liveEmojiInputDialogFragment3.LLLI.LJI(C2204961BRm.LLLII(liveEmojiInputDialogFragment3.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null)), null) + c1115500f8O.previewEmoji.length();
                this.LIZ.getClass();
                if (iLJI2 > 100) {
                    C766270U4b.LJIIJJI(this.LIZ.getString(2131841268));
                    return;
                }
                if (TextUtils.isEmpty(c1115500f8O.previewEmoji)) {
                    return;
                }
                LiveEmojiInputDialogFragment liveEmojiInputDialogFragment4 = this.LIZ;
                liveEmojiInputDialogFragment4.LLLLII = true;
                this.LIZ.LLLI.LIZ(liveEmojiInputDialogFragment4.LLJLILLLLZIIL.getSelectionStart(), c1115500f8O.previewEmoji);
                this.LIZ.WR(c1115500f8O.previewEmoji);
                this.LIZ.LLLLII = false;
            }
        };
        this.LLLLLLZZ = false;
    }

    public final void MR() {
        boolean zLJI = MethodIDManager.LJI(72081);
        if (this.LLILLJJLI) {
            try {
                RR();
                C1114680f74.LIZ("trigger close keyboard");
                if (isAdded()) {
                    if (this.LLJJJJ == null) {
                        this.LLJJJJ = C508920Jxa.LIZ(getContext(), "live_room_sub_emote_input_page");
                    }
                    EmotePerformanceTrackerViewModel emotePerformanceTrackerViewModel = this.LLJJJJ;
                    if (emotePerformanceTrackerViewModel != null) {
                        emotePerformanceTrackerViewModel.LLILLL = System.currentTimeMillis();
                        this.LLJJJJ.xQ2();
                    }
                    dismissAllowingStateLoss();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1CC2.LIZ("LiveEmojiInputDialogFragment", e);
            }
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final InputAttrs OR() {
        Bundle arguments = getArguments();
        if (arguments == null) {
            return null;
        }
        arguments.setClassLoader(InputAttrs.class.getClassLoader());
        return (InputAttrs) arguments.getParcelable("live.intent.extra.INPUT_ATTRS");
    }

    public final void VR() {
        boolean zLJI = MethodIDManager.LJI(72046);
        C1114680f74.LIZ("Dialog onDismiss");
        C1EOY c1eoy = C1EOY.LIZ;
        C1300480jwk c1300480jwkLIZIZ = c1eoy.LIZIZ("panel_comment_period");
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.stop();
        }
        C1300480jwk c1300480jwkLIZIZ2 = c1eoy.LIZIZ("panel_comment_close");
        if (c1300480jwkLIZIZ2 != null) {
            c1300480jwkLIZIZ2.LIZJ(null);
        }
        this.LLL = new C1085120eLO(0, 0, false);
        C784440Upu.LIZ().LIZIZ(this.LLL);
        this.LLILLJJLI = false;
        if (this.LLILZ != null) {
            InputAttrs inputAttrs = new InputAttrs();
            inputAttrs.isBroadcaster = this.LLJILJILJ;
            inputAttrs.isUserBanned = this.LLJILLL;
            inputAttrs.isUserBannedWholeLive = this.LLJJ;
            inputAttrs.mutedDuration = this.LLJJI;
            inputAttrs.isDanmuOpen = this.LLJILJIL;
            inputAttrs.input = "";
            inputAttrs.emoteFixTextHelperForText = this.LLLI;
            if (OR() != null) {
                inputAttrs.replyInfo = OR().replyInfo;
                inputAttrs.copyInfo = OR().copyInfo;
                inputAttrs.mCommentMethod = OR().mCommentMethod;
            }
            inputAttrs.canSendDanmu = this.LLJJIII;
            inputAttrs.trackInfo = this.LLLLIIL;
            this.LLILZ.Rc(inputAttrs);
        }
        if (C2204961BRm.LLLII(this.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null)) != null) {
            this.LLLLII = true;
            C2204961BRm.LLLII(this.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null)).clear();
        }
        TextView textView = this.LLJLLIL;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
        this.LLILZ = null;
        this.LLILZLL = false;
        this.LLIZ = false;
        this.LLJ = false;
        this.LLJI = EnumC1114820f7I.Keyboard;
        this.LLJILJIL = false;
        this.LLJILLL = false;
        this.LLJJ = false;
        this.LLJJI = -1L;
        this.LLJJIII = false;
        this.LLJJIJI = "";
        this.LLLILZJ = Boolean.FALSE;
        this.LLLIZZ = 0;
        this.LLLLII = false;
        this.LLLLIIIILLL = false;
        this.LLLL = false;
        ((ArrayList) this.LLLLIILL).clear();
        this.LLLLIILLL = false;
        this.LLLLIL = null;
        ViewPager viewPager = this.LLLFFI;
        if (viewPager != null) {
            viewPager.setAdapter(null);
        }
        C500260Jjc.LJIILIIL(this.LLJZIJLIL);
        C500260Jjc.LJIILIIL(this.LLJLL);
        MeasureLinearLayout measureLinearLayout = this.LLJJJJJIL;
        if (measureLinearLayout != null) {
            measureLinearLayout.setCanSaveState(false);
        }
        this.LLL = null;
        this.LLLLJI = null;
        this.LLLILZLLLI = false;
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void aS() {
        C20586115gx c20586115gx;
        if (isAdded() && (c20586115gx = this.LLJLILLLLZIIL) != null) {
            if (this.LLJILLL) {
                c20586115gx.setText("");
                this.LLJLLIL.setText(2131842825);
                this.LLJLILLLLZIIL.setEnabled(false);
                return;
            }
            c20586115gx.setTextSize(1, 17.0f);
            if (this.LLJILJIL) {
                this.LLJLLIL.setText(2131851988);
            } else if (TextUtils.isEmpty(this.LLJIJIL)) {
                this.LLJLLIL.setText(2131842707);
            } else {
                this.LLJLLIL.setText(this.LLJIJIL);
            }
            this.LLJLILLLLZIIL.setEnabled(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        Boolean bool = Boolean.FALSE;
        this.LLLLLLL = bool;
        this.LLLLLLLLL = bool;
        this.LLLLLJLJLL = "";
        this.LLLLLL = "";
        this.LLIZLLLIL = false;
        this.LLILLJJLI = false;
        BPEAHandler bPEAHandler = this.LLLLJ;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        InterfaceC1114610f6x interfaceC1114610f6x = this.LLJJJJLIIL;
        if (interfaceC1114610f6x != null) {
            interfaceC1114610f6x.onDestroy();
            this.LLJJJJLIIL = null;
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.ControllableDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        View view;
        Window window;
        Window window2;
        View decorView;
        View decorView2;
        View decorView3;
        C19EG c19eg;
        Window window3;
        View decorView4;
        View viewFindViewById;
        super.onDestroyView();
        C1115090f7j c1115090f7j = this.LLLLJI;
        if (c1115090f7j != null) {
            C19EG c19eg2 = c1115090f7j.LIZ;
            if (c19eg2 != null && !c19eg2.isFinishing()) {
                if (c1115090f7j.LJI && (c19eg = c1115090f7j.LIZ) != null && (window3 = c19eg.getWindow()) != null && (decorView4 = window3.getDecorView()) != null && (viewFindViewById = decorView4.findViewById(android.R.id.navigationBarBackground)) != null) {
                    C786410Ut5.LJLLLLLL(0, viewFindViewById);
                }
                C19EG c19eg3 = c1115090f7j.LIZ;
                if (c19eg3 != null) {
                    Window window4 = c19eg3.getWindow();
                    if (window4 != null) {
                        window4.setSoftInputMode(c1115090f7j.LIZLLL);
                    }
                    Window window5 = c19eg3.getWindow();
                    if (window5 != null && (decorView3 = window5.getDecorView()) != null) {
                        decorView3.setSystemUiVisibility(c1115090f7j.LJFF);
                    }
                    Window window6 = c19eg3.getWindow();
                    if (window6 != null && (decorView2 = window6.getDecorView()) != null) {
                        C14K9.LJIJJ(decorView2, null);
                    }
                    Window window7 = c19eg3.getWindow();
                    if (window7 != null && (decorView = window7.getDecorView()) != null) {
                        Rect rect = c1115090f7j.LIZIZ;
                        decorView.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    if (Build.VERSION.SDK_INT >= 30 && (window2 = c19eg3.getWindow()) != null) {
                        C0DRA.LIZ(window2, c1115090f7j.LJ);
                    }
                    if (c1115090f7j.LIZJ && (window = c19eg3.getWindow()) != null) {
                        window.setFlags(1024, 1024);
                    }
                }
            }
            VR();
        }
        View view2 = this.LLJJL;
        if (view2 == null || (view = this.LLJZ) == null) {
            return;
        }
        C786410Ut5.LJJL(view2, (LinearLayout) view);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        C19EG activity = getActivity();
        if (activity != null && C500260Jjc.LJJII(activity.getRequestedOrientation())) {
            MR();
        } else {
            if (this.LLJILJILJ) {
                return;
            }
            this.LLIZLLLIL = true;
            if (this.LLJI == EnumC1114820f7I.Keyboard) {
                this.LLIZ = this.LLILZLL;
            }
        }
    }

    public static boolean SR(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                if (str.length() <= 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void UR(EmoteModel emoteModel) {
        int i;
        AbstractC1114240f6M next;
        if (emoteModel == null) {
            iS();
            this.LLJL.setIconAttr(R.attr.cjo);
            return;
        }
        if (emoteModel.emoteScene == 1) {
            kS("");
            return;
        }
        for (int i2 = 0; i2 < ((ArrayList) this.LLLLIILL).size(); i2++) {
            AbstractC1115080f7i abstractC1115080f7i = (AbstractC1115080f7i) ListProtector.get(this.LLLLIILL, i2);
            if (abstractC1115080f7i instanceof C1114290f6R) {
                cS(i2, "");
                this.LLLFFI.setCurrentItem(i2);
                C1114250f6N c1114250f6N = ((C1114290f6R) abstractC1115080f7i).LJIILIIL;
                if (c1114250f6N != null && ((i = emoteModel.emoteScene) == 2 || i == 3)) {
                    if (!c1114250f6N.LLIZ.isEmpty()) {
                        c1114250f6N.h0(emoteModel.emoteScene);
                        Iterator<AbstractC1114240f6M> it2 = c1114250f6N.LLIZ.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (next.I5() == emoteModel.emoteScene) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        AbstractC1114240f6M abstractC1114240f6M = next;
                        if (abstractC1114240f6M != null) {
                            abstractC1114240f6M.L5(emoteModel);
                        }
                    } else {
                        c1114250f6N.LLJI = emoteModel;
                    }
                }
            }
        }
    }

    public final void WR(CharSequence charSequence) throws Throwable {
        int selectionStart = this.LLJLILLLLZIIL.getSelectionStart();
        int selectionEnd = this.LLJLILLLLZIIL.getSelectionEnd();
        Editable editableLLLIIII = C2204961BRm.LLLIIII(this.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null));
        if (editableLLLIIII == null) {
            return;
        }
        if (selectionStart != selectionEnd && selectionStart >= 0 && selectionEnd <= this.LLJLILLLLZIIL.length()) {
            this.LLLI.LIZLLL(selectionStart, selectionEnd);
            C2204961BRm.LLLIIII(this.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null)).replace(selectionStart, selectionEnd, charSequence);
            int length = selectionStart + charSequence.length();
            if (length >= charSequence.length()) {
                C20586115gx c20586115gx = this.LLJLILLLLZIIL;
                c20586115gx.setSelection(c20586115gx.length());
                return;
            } else {
                this.LLJLILLLLZIIL.setSelection(length);
                return;
            }
        }
        editableLLLIIII.insert(selectionStart, charSequence);
    }

    public final void ZR(int i) {
        String str;
        long id;
        long ownerUserId;
        String str2;
        C1114250f6N c1114250f6N;
        Editable editableLLLII;
        boolean zLJI = MethodIDManager.LJI(196982);
        C1114670f73 c1114670f73 = new C1114670f73();
        c1114670f73.LIZ = i;
        InputAttrs inputAttrsOR = OR();
        if (inputAttrsOR != null) {
            c1114670f73.LIZIZ = inputAttrsOR.hasDraft;
        }
        InterfaceC1114610f6x interfaceC1114610f6x = this.LLJJJJLIIL;
        if (interfaceC1114610f6x != null) {
            c1114670f73.LIZLLL = interfaceC1114610f6x.LIZJ();
        }
        List<EmoteModel> arrayList = null;
        if (inputAttrsOR != null && (editableLLLII = C2204961BRm.LLLII(this.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null))) != null && ((C416610GVf[]) editableLLLII.getSpans(0, editableLLLII.length(), C416610GVf.class)).length > 0) {
            c1114670f73.LIZJ = true;
        }
        if (C500260Jjc.LJJJIL(this.LLILLL)) {
            ChatResult chatResult = new ChatResult();
            chatResult.setMsgId(0L);
            chatResult.setDisplayText(new Text());
            chatResult.setBackground(new ImageModel());
            if (SR(C2204961BRm.LLLIIII(this.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null)).toString()) || this.LLLI.LJ() != 0) {
                if (inputAttrsOR != null && inputAttrsOR.isQAStrengthen) {
                    this.LLLILZJ = Boolean.TRUE;
                    C2204961BRm.LLLII(this.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null)).insert(0, inputAttrsOR.inputWithEmote);
                    C2204961BRm.LLLIIII(this.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null)).toString();
                }
                chatResult.setContent(C2204961BRm.LLLIIII(this.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null)).toString());
                chatResult.setFullScreenTextColor("#FF0000");
                InterfaceC1112060f2q interfaceC1112060f2qOo = ((IPublicScreenService) C1161920gLG.LIZJ(IPublicScreenService.class)).Oo(C181500mr.LIZ(0L, chatResult, UserService.getInstance().user().LJIJJLI(), UserService.getInstance().user().getCurrentUser(), new ArrayList(), false));
                if (interfaceC1112060f2qOo != null) {
                    this.LLILZ.Sc(interfaceC1112060f2qOo, Boolean.valueOf(c1114670f73.LIZIZ));
                }
            }
            this.LLJLILLLLZIIL.setText("");
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        InterfaceC1115130f7n interfaceC1115130f7n = this.LLILZ;
        if (interfaceC1115130f7n != null) {
            interfaceC1115130f7n.Nc(this.LLLI.LJII(), c1114670f73);
            if (FansClubSendEmoteEventsSettings.INSTANCE.getValue()) {
                C1114290f6R c1114290f6R = this.LLLIIII;
                if (c1114290f6R != null && (c1114250f6N = c1114290f6R.LJIILIIL) != null) {
                    arrayList = c1114250f6N.getAllEmotesList();
                }
                DataChannel dataChannel = this.LLILLL;
                List<EmoteWithIndex> listLJFF = this.LLLI.LJFF();
                InputAttrs inputAttrsOR2 = OR();
                boolean zBooleanValue = this.LLLLLLL.booleanValue();
                if (dataChannel != null) {
                    String str3 = "comment_panel_fans_club_icon";
                    if (zBooleanValue) {
                        str = "comment_panel_fans_club_icon";
                    } else {
                        str = (String) DataChannelGlobal.LLILZ.gg0(C1148170fz5.class);
                        if (str == null) {
                            str = "comment";
                        }
                    }
                    if (a0.LJJJIL(str)) {
                        str = "comment";
                    }
                    Iterator<EmoteWithIndex> it2 = listLJFF.iterator();
                    int i2 = 0;
                    int i3 = 0;
                    while (it2.hasNext()) {
                        EmoteModel emoteModel = it2.next().emoteModel;
                        if (emoteModel != null) {
                            if (emoteModel.emoteScene == 2) {
                                i2++;
                            } else if (emoteModel.emoteScene == 3) {
                                i3++;
                            }
                        }
                    }
                    int i4 = i2 + i3;
                    if (i4 <= 0 || !TextUtils.equals(str, "comment")) {
                        str3 = str;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    List<String> list = FansClubPrivilegeConfigSetting.INSTANCE.getValue().defaultStickerIds;
                    int i5 = 0;
                    int i6 = 0;
                    for (EmoteModel emoteModel2 : arrayList) {
                        if (emoteModel2.emoteScene == 2) {
                            i5++;
                            if (list != null && !list.contains(emoteModel2.emoteId)) {
                                i6++;
                            }
                        }
                    }
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_comment_panel_send_click");
                    c474500IjALIZ.LJIJJLI(dataChannel);
                    c474500IjALIZ.LJJII(str3, "show_entrance");
                    c474500IjALIZ.LJJII(Integer.valueOf(i4), "including_fans_club_sticker_num");
                    c474500IjALIZ.LJJII(Integer.valueOf(i3), "including_super_fan_sticker_num");
                    Room room = (Room) dataChannel.gg0(RoomChannel.class);
                    if (room != null) {
                        id = room.getId();
                    } else {
                        id = 0;
                    }
                    c474500IjALIZ.LJJII(Long.valueOf(id), "room_id");
                    Room room2 = (Room) dataChannel.gg0(RoomChannel.class);
                    if (room2 != null) {
                        ownerUserId = room2.getOwnerUserId();
                    } else {
                        ownerUserId = 0;
                    }
                    c474500IjALIZ.LJJII(Long.valueOf(ownerUserId), "anchor_id");
                    C1114370f6Z.LIZ(c474500IjALIZ, dataChannel);
                    c474500IjALIZ.LJJII(Integer.valueOf(C1114370f6Z.LIZIZ(dataChannel, inputAttrsOR2)), "has_sub_tab");
                    c474500IjALIZ.LJJII(C1114370f6Z.LJIIIZ(), "subscribe_state");
                    if (C2685012d.LIZIZ()) {
                        str2 = "anchor";
                    } else {
                        str2 = "user";
                    }
                    c474500IjALIZ.LJJII(str2, "user_type");
                    c474500IjALIZ.LJJII(Integer.valueOf(i5), "fans_club_sticker_num");
                    c474500IjALIZ.LJJII(Integer.valueOf(i6), "customized_fans_club_sticker_num");
                    c474500IjALIZ.LIZ();
                }
            }
        }
        if (!UserService.getInstance().user().isLogin()) {
            if (getActivity() == null) {
                C766270U4b.LIZLLL(2131851926);
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            C19EG activity = getActivity();
            C476760Imo c476760Imo = new C476760Imo();
            c476760Imo.LIZ = C497740JfY.LJIJI(2131853570);
            c476760Imo.LIZLLL = "comment_live";
            c476760Imo.LIZJ = LSPassThroughRecordSizeConfig.DEFAULT;
            interfaceC500940JkiUser.LJIILL(activity, new C501600Jlm(c476760Imo)).LIZIZ(new C476750Imn());
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (UserService.getInstance().user().LJIJI(EnumC1134120fcQ.COMMENT)) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (this.LLJILJIL && ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).isNeedProtectMinor()) {
            C766270U4b.LIZLLL(2131853495);
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (this.LLILZ == null) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        String str4 = null;
        if (C2204961BRm.LLLIIII(this.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null)) == null) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (!SR(C2204961BRm.LLLIIII(this.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null)).toString()) && this.LLLI.LJ() == 0) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (inputAttrsOR != null && inputAttrsOR.isQAStrengthen) {
            this.LLLILZJ = Boolean.TRUE;
            C2204961BRm.LLLII(this.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null)).insert(0, inputAttrsOR.inputWithEmote);
        }
        List<EmoteWithIndex> listLJFF2 = this.LLLI.LJFF();
        if (inputAttrsOR != null && inputAttrsOR.starlingKey != null) {
            C1124870fNV c1124870fNVLIZJ = C1124870fNV.LIZJ();
            String str5 = inputAttrsOR.starlingKey;
            c1124870fNVLIZJ.getClass();
            if (TextUtils.equals(C1124870fNV.LIZIZ(str5), this.LLLI.LJII()) && listLJFF2.isEmpty()) {
                str4 = inputAttrsOR.starlingKey;
            }
        }
        this.LLILZ.Pc(this.LLLLLLL);
        InterfaceC1115130f7n interfaceC1115130f7n2 = this.LLILZ;
        String strLJII = this.LLLI.LJII();
        boolean z = this.LLJILJIL;
        int i7 = this.LLLIZZ;
        this.LLLI.getClass();
        interfaceC1115130f7n2.Tc(strLJII, str4, z, i7, new C520890Kbn(EmoteFixTextHelper.LJIIJ(listLJFF2), listLJFF2), c1114670f73, this.LLJJJJLIIL);
        this.LLLIZZ = 0;
        DataChannel dataChannel2 = this.LLILLL;
        if (dataChannel2 != null) {
            dataChannel2.LC0(IncreaseSDKTriggerEvent.class, new C484660IzY(-1, "gbl_did_send_comment"));
        }
        ((ILiveNotifyService) C1161920gLG.LIZJ(ILiveNotifyService.class)).Nu1();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void dS(int i) {
        int iMax;
        ViewGroup.LayoutParams layoutParams;
        if (this.LLLFF == null) {
            return;
        }
        if (this.LLLLIILLL) {
            iMax = Math.max(this.LLLJL, i);
        } else {
            iMax = Math.max(this.LLLJIL, i);
        }
        if (iMax != this.LLLJ && (layoutParams = this.LLLFF.getLayoutParams()) != null) {
            layoutParams.height = iMax;
            C786410Ut5.d6(this.LLLFF, layoutParams);
            this.LLLJ = iMax;
        }
    }

    public final void hS(String str) {
        C1114970f7X c1114970f7X;
        DataChannel dataChannel;
        List<? extends EmoteModel> list;
        if (this.LLJILLL) {
            return;
        }
        this.LLJI = EnumC1114820f7I.Panel;
        this.LLLFZ = this.LLLII;
        this.LLJLILLLLZIIL.setShowSoftInputOnFocus(true);
        if (this.LLJ) {
            int iIndexOf = ((ArrayList) this.LLLLIILL).indexOf(this.LLLFZ);
            if (iIndexOf != -1) {
                cS(iIndexOf, str);
                this.LLLFFI.setCurrentItem(iIndexOf, false);
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(C2204961BRm.LLLIIII(this.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null)));
        yS(zIsEmpty);
        if (!zIsEmpty) {
            this.LLJLIL.setClickable(true);
        }
        HandlerHook.viewPost(this.LLJLILLLLZIIL, new ARunnableS86S0200000_17(this, this.LLJI, 15));
        if (this.LLLIL) {
            this.LLLIILIL.setBackground(null);
            LiveIconView liveIconView = this.LLLIIL;
            liveIconView.setBackground(C800330VaR.LIZIZ(liveIconView.getContext(), R.drawable.dql));
            if (!"select_tab".equals(str) && (dataChannel = (c1114970f7X = this.LLLIIIL).LIZJ) != null && (list = c1114970f7X.LJIILJJIL) != null) {
                C1114370f6Z.LJII(dataChannel, list.size(), "show");
            }
        }
    }

    public final void kS(String str) {
        if (!this.LLLIL) {
            return;
        }
        this.LLJI = EnumC1114820f7I.Panel;
        this.LLLFZ = this.LLLIIIL;
        this.LLLIIL.setBackground(null);
        LiveIconView liveIconView = this.LLLIILIL;
        liveIconView.setBackground(C800330VaR.LIZIZ(liveIconView.getContext(), R.drawable.dql));
        this.LLJLILLLLZIIL.setShowSoftInputOnFocus(true);
        int iIndexOf = ((ArrayList) this.LLLLIILL).indexOf(this.LLLFZ);
        if (iIndexOf != -1) {
            cS(iIndexOf, str);
            this.LLLFFI.setCurrentItem(iIndexOf, false);
        }
        HandlerHook.viewPost(this.LLJLILLLLZIIL, new ARunnableS86S0200000_17(this, this.LLJI, 15));
    }

    public final void nS(int i) {
        View view = this.LLJLLL;
        if (view != null) {
            C786410Ut5.ed(view, i);
        }
        View view2 = this.LLJZIJLIL;
        if (view2 != null) {
            C786410Ut5.ed(view2, i);
        }
        zS();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        Window window;
        C20586115gx c20586115gx;
        super.onActivityCreated(bundle);
        if (this.LLLLJ == null) {
            this.LLLLJ = new BPEAHandler(Looper.getMainLooper());
        }
        if (this.LLJI == EnumC1114820f7I.Keyboard) {
            C1114680f74.LIZ("Keyboard will open");
            int delayTime = LiveCommentPanelShowDirectTimeThresholdSetting.INSTANCE.getDelayTime();
            if (delayTime > 0) {
                C786410Ut5.LJLIIL(delayTime, this.LLLLJ, new ARunnableS117S0100000_17(this, 70));
            }
            InterfaceC1115130f7n interfaceC1115130f7n = this.LLILZ;
            if (interfaceC1115130f7n != null) {
                interfaceC1115130f7n.Qc();
            }
            if (this.LLILLJJLI && (c20586115gx = this.LLJLILLLLZIIL) != null) {
                c20586115gx.requestFocus();
                KeyBoardUtil.LIZLLL(getContext(), this.LLJLILLLLZIIL);
            }
        }
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
        C786410Ut5.LJLIIL(LayeredElementConfiguration.INSTANCE.getAnimationDuration() + 1000, this.LLLLJ, new ARunnableS94S0000000_17(1));
        C786410Ut5.LJLIIL(500L, this.LLLLJ, new ARunnableS117S0100000_17(this, 51));
        zS();
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLILLJJLI = true;
        setCancelable(true);
        InputAttrs inputAttrsOR = OR();
        if (inputAttrsOR != null) {
            this.LLJILJIL = inputAttrsOR.isDanmuOpen;
            this.LLJILJILJ = inputAttrsOR.isBroadcaster;
            this.LLJILLL = inputAttrsOR.isUserBanned;
            this.LLJJ = inputAttrsOR.isUserBannedWholeLive;
            this.LLJJI = inputAttrsOR.mutedDuration;
            String str = inputAttrsOR.input;
            if (str == null) {
                str = "";
            }
            this.LLJJIJI = str;
            this.LLJJIJIIJIL = inputAttrsOR.atName;
            this.LLJJIJIL = inputAttrsOR.content;
            this.LLJJJ = inputAttrsOR.atEmoteWithIndexList;
            EmoteFixTextHelper emoteFixTextHelper = inputAttrsOR.emoteFixTextHelperForText;
            if (emoteFixTextHelper == null) {
                emoteFixTextHelper = new EmoteFixTextHelper();
            }
            this.LLLI = emoteFixTextHelper;
            this.LLJJIII = inputAttrsOR.canSendDanmu;
            this.LL = !inputAttrsOR.emoteEnabled ? 1 : 0;
            this.LLJIJIL = inputAttrsOR.hint;
            this.LLLLIIL = inputAttrsOR.trackInfo;
        } else {
            this.LLLI = new EmoteFixTextHelper();
        }
        this.LLLI.inputScene = EnumC584890Mwp.COMMENT;
        if (this.LL == 2) {
            this.LLJI = EnumC1114820f7I.Panel;
        }
        setStyle(1, R.style.ai9);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.setCanceledOnTouchOutside(this.LLJJJIL);
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.ax);
            window.setGravity(80);
            window.setLayout(-1, -2);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.addFlags(32);
            if (this.LLJI == EnumC1114820f7I.Keyboard) {
                window.setSoftInputMode(20);
            } else {
                window.setSoftInputMode(19);
            }
            window.clearFlags(2);
        }
        Window window2 = dialogOnCreateDialog.getWindow();
        if (window2 != null && (decorView = window2.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        boolean zLJI = MethodIDManager.LJI(71965);
        super.onDismiss(dialogInterface);
        VR();
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final boolean qS(final int i) {
        if (this.LLJLLL == null || this.LLJZIJLIL == null || this.LLLLIILLL) {
            return false;
        }
        if (this.LLLLILI == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.LLLLILI = valueAnimator;
            valueAnimator.setDuration(100L);
            this.LLLLILI.setFloatValues(0.0f, 1.0f);
        }
        this.LLLLILI.removeAllUpdateListeners();
        final float translationY = this.LLJLLL.getTranslationY();
        this.LLLLILI.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0f7t
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = this.LL;
                float f = translationY;
                int i2 = i;
                liveEmojiInputDialogFragment.getClass();
                liveEmojiInputDialogFragment.nS((int) (f + (((-i2) - f) * ((Float) valueAnimator2.getAnimatedValue()).floatValue())));
            }
        });
        return true;
    }

    public final void rS(String str) {
        if (!isAdded() || this.LLJILLL) {
            return;
        }
        this.LLJJIJI = str;
        oS();
        aS();
    }

    public final void uS(String str) throws Throwable {
        C20586115gx c20586115gx = this.LLJLILLLLZIIL;
        if (c20586115gx != null && C2204961BRm.LLLII(c20586115gx, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null)) != null) {
            CharacterStyle characterStyle = new CharacterStyle() { // from class: X.11vL
                @Override // android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                }
            };
            Editable editableLLLII = C2204961BRm.LLLII(this.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null));
            int iIndexOf = editableLLLII.toString().indexOf(str);
            int length = str.length() + iIndexOf;
            if (iIndexOf >= 0) {
                C786410Ut5.o2(editableLLLII, characterStyle, iIndexOf, length, 33);
            }
        }
    }

    public final void yS(boolean z) {
        C1115060f7g c1115060f7g = this.LLLII;
        if (c1115060f7g != null) {
            boolean z2 = !z;
            C16FS c16fs = c1115060f7g.LJIIIIZZ;
            if (c16fs != null) {
                c16fs.setEnabled(z2);
            }
        }
        C1114290f6R c1114290f6R = this.LLLIIII;
        if (c1114290f6R != null) {
            boolean z3 = !z;
            C16FS c16fs2 = c1114290f6R.LJIIIIZZ;
            if (c16fs2 != null) {
                c16fs2.setEnabled(z3);
            }
        }
        C1114970f7X c1114970f7X = this.LLLIIIL;
        if (c1114970f7X != null) {
            boolean z4 = !z;
            C16FS c16fs3 = c1114970f7X.LJIIIIZZ;
            if (c16fs3 != null) {
                c16fs3.setEnabled(z4);
            }
        }
        if (z) {
            LiveIconView liveIconView = this.LLJLIL;
            liveIconView.setIconTint(C20736316Cj.LIZJ(R.attr.fy4, liveIconView));
            return;
        }
        C16FS c16fs4 = this.LLLII.LJIIIIZZ;
        if (c16fs4 != null) {
            c16fs4.setEnabled(true);
        }
        LiveIconView liveIconView2 = this.LLJLIL;
        liveIconView2.setIconTint(C20736316Cj.LIZJ(R.attr.fxr, liveIconView2));
    }

    public final void NR(EmoteModel emoteModel, SpannableStringBuilder spannableStringBuilder) {
        if (this.LLLI.LJI(C2204961BRm.LLLII(this.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null)), null) + 4 > 100) {
            C766270U4b.LJIIJJI(getString(2131841268));
            return;
        }
        this.LLLLIIIILLL = false;
        int selectionStart = this.LLJLILLLLZIIL.getSelectionStart();
        this.LLLLII = true;
        WR(spannableStringBuilder);
        this.LLLLII = false;
        this.LLLI.LIZIZ(selectionStart, emoteModel);
    }

    public final void cS(int i, String str) {
        C1114290f6R c1114290f6R;
        int i2;
        if (i >= 0 && i < ((ArrayList) this.LLLLIILL).size()) {
            AbstractC1115080f7i abstractC1115080f7i = (AbstractC1115080f7i) ListProtector.get(this.LLLLIILL, i);
            boolean zIsEmpty = TextUtils.isEmpty(C2204961BRm.LLLIIII(this.LLJLILLLLZIIL, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6CJOQQvvt2bwKJpt48Bsjs7az/ZL2ydhh9gYMnahKWvCbL932kzwGA==", null)));
            yS(zIsEmpty);
            this.LLJLIL.setClickable(!zIsEmpty);
            this.LLLFZ = abstractC1115080f7i;
            this.LLJLILLLLZIIL.setShowSoftInputOnFocus(true);
            for (int i3 = 0; i3 < ((ArrayList) this.LLLLIILL).size(); i3++) {
                if (i3 != i) {
                    AbstractC1115080f7i abstractC1115080f7i2 = (AbstractC1115080f7i) ListProtector.get(this.LLLLIILL, i3);
                    if (abstractC1115080f7i2.LJFF) {
                        abstractC1115080f7i2.LJFF = false;
                        abstractC1115080f7i2.LIZLLL(str, false);
                    }
                }
            }
            if (this.LLLLLLLLL.booleanValue() && abstractC1115080f7i != null && (c1114290f6R = this.LLLIIII) != null && this.LLLFZ == c1114290f6R && abstractC1115080f7i.LJFF) {
                C1114250f6N c1114250f6N = c1114290f6R.LJIILIIL;
                if (c1114250f6N != null) {
                    c1114250f6N.LLJILJILJ = false;
                    C1114260f6O c1114260f6O = c1114250f6N.LLILZIL;
                    if (c1114260f6O != null) {
                        i2 = c1114260f6O.LJIIIIZZ;
                    } else {
                        i2 = 2;
                    }
                    c1114250f6N.i0(i2);
                }
                this.LLLLLLLLL = Boolean.FALSE;
            }
            abstractC1115080f7i.LJIIIZ = this.LLLLLLJ.booleanValue();
            if (!abstractC1115080f7i.LJFF) {
                abstractC1115080f7i.LJFF = true;
                abstractC1115080f7i.LIZLLL(str, true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e A[Catch: Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:6:0x0025, B:8:0x0029, B:11:0x0040, B:13:0x0044, B:15:0x0048, B:16:0x004c, B:10:0x003e), top: B:268:0x0025 }] */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r18, android.os.Bundle r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC19323110ij
    public final void u2(int i, boolean z) {
        boolean zQS;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (z) {
            if (!isResumed()) {
                return;
            }
            this.LLLILZ = SystemClock.uptimeMillis();
            if (this.LLLLIILLL) {
                if (i != this.LLLLL) {
                    this.LLLLL = i;
                    InterfaceC1106030et7.R7.LJFF(Integer.valueOf(i));
                }
            } else if (this.LLLLLIL != i) {
                this.LLLLLIL = i;
                InterfaceC1106030et7.S7.LJFF(Integer.valueOf(i));
            }
            dS(i);
            EnumC1114820f7I enumC1114820f7I = this.LLJI;
            EnumC1114820f7I enumC1114820f7I2 = EnumC1114820f7I.Keyboard;
            if (enumC1114820f7I != enumC1114820f7I2) {
                this.LLJI = enumC1114820f7I2;
            }
            this.LLIZ = false;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Open keyboard height ==");
            sbLIZ.append(i);
            C1114680f74.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            this.LLILZLL = true;
            this.LLJJLIIIJLLLLLLLZ.setIconAttr(R.attr.cj2);
            wS();
            if (this.LLLFF.getVisibility() != 0) {
                zQS = qS(i);
            } else {
                zQS = false;
            }
            C786410Ut5.LJZL(8, this.LLLFF);
            if (zQS) {
                if (!this.LLLLILI.isRunning()) {
                    this.LLLLILI.start();
                }
            } else {
                nS(-i);
            }
            C1085120eLO c1085120eLO = new C1085120eLO(i, PR(), true);
            C1085120eLO c1085120eLO2 = this.LLL;
            if (c1085120eLO2 == null) {
                this.LLL = c1085120eLO;
                C784440Upu.LIZ().LIZIZ(this.LLL);
            } else if (!c1085120eLO.equals(c1085120eLO2)) {
                this.LLL = c1085120eLO;
                C784440Upu.LIZ().LIZIZ(new C1081010eEl(PR(), i));
            }
            InterfaceC1115130f7n interfaceC1115130f7n = this.LLILZ;
            if (interfaceC1115130f7n != null) {
                interfaceC1115130f7n.LIZIZ();
            }
            try {
                if (!C2104308Mf.LIZ() && Build.VERSION.SDK_INT > 29) {
                    double dLJIILLIIL = (((double) i) * 1.0d) / ((double) C497740JfY.LJIILLIIL());
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("keyboard_height", C497740JfY.LJJI(i));
                    jSONObject.put("screen_height", C497740JfY.LJIILLIIL());
                    jSONObject.put("keyboard_rate", dLJIILLIIL);
                    if (dLJIILLIIL < 0.2d) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    jSONObject.put("keyboard_rate_less_than_20", z2);
                    if (dLJIILLIIL < 0.1d) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    jSONObject.put("keyboard_rate_less_than_10", z3);
                    if (dLJIILLIIL >= 0.05d) {
                        z4 = false;
                    }
                    jSONObject.put("keyboard_rate_less_than_5", z4);
                    C1CC2.LJ("ttlive_floating_keyboard", jSONObject, new JSONObject(), new JSONObject());
                    return;
                }
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C20441214yg.LJ("ttlive_floating_keyboard", e.getMessage());
                return;
            }
        }
        if (this.LLJI == EnumC1114820f7I.Panel) {
            C786410Ut5.LLJILLL(this.LLJJJJJIL, 0);
            if (this.LLLFF.getVisibility() != 0) {
                C786410Ut5.LJZL(0, this.LLLFF);
                HandlerHook.viewPost(this.LLLFF, new ARunnableS22S1100000_17(this, "comment_panel", 4));
            }
            int i2 = this.LLLJ;
            nS(0);
            this.LLL = new C1085120eLO(i2, PR(), true);
            C784440Upu.LIZ().LIZIZ(this.LLL);
            return;
        }
        C1114680f74.LIZ("close keyboard");
        if (LiveCommentInputDialogDismissFixSetting.getValue().enable && this.LLILZLL) {
            long jUptimeMillis = SystemClock.uptimeMillis() - this.LLLILZ;
            long j = LiveCommentInputDialogDismissFixSetting.getValue().delayTime;
            if (jUptimeMillis < j) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("delay_threshold", j);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("keyboard_duration", jUptimeMillis);
                    C1CC2.LJ("ttlive_keyboard_unexpected_close", jSONObject2, jSONObject3, new JSONObject());
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C20441214yg.LJ("ttlive_keyboard_unexpected_close", e2.getMessage());
                }
                C1114680f74.LIZ("Unexpected close keyboard");
                return;
            }
        }
        if (!this.LLIZ && this.LLILZLL) {
            this.LLILZLL = false;
            try {
                dismissAllowingStateLoss();
            } catch (Exception e3) {
                TryCatchGuardChecker.doCheck(e3);
                C1CC2.LIZ("LiveEmojiInputDialogFragment", e3);
            }
        }
    }

    public final void gS(FragmentManager fragmentManager, Fragment fragment, boolean z) {
        C1300480jwk c1300480jwkLIZIZ = C1EOY.LIZ.LIZIZ("panel_comment_open");
        if (c1300480jwkLIZIZ != null) {
            c1300480jwkLIZIZ.LIZJ(null);
        }
        if (z && LiveCommentPanelOpenOptV2Setting.INSTANCE.isShowAsFragment()) {
            if (fragment.getView() != null && fragment.getView().findViewById(R.id.mvs) != null) {
                this.mShowsDialog = false;
                this.LLLLJI = new C1115090f7j();
                C19EH c19ehLJIIJ = fragment.getChildFragmentManager().LJIIJ();
                c19ehLJIIJ.LIZJ(R.id.mvs, this, "INPUT");
                c19ehLJIIJ.LJIIL();
                return;
            }
            Map<String, Object> map = C1338270kvh.LIZ;
            this.mShowsDialog = true;
            showNow(fragmentManager, "INPUT");
            return;
        }
        this.mShowsDialog = true;
        showNow(fragmentManager, "INPUT");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        boolean z2;
        MeasureLinearLayout measureLinearLayout = this.LLJJJJJIL;
        if (measureLinearLayout != null) {
            if (measureLinearLayout.getParent() != null) {
                C786410Ut5.LJJJJI((ViewGroup) this.LLJJJJJIL.getParent());
            }
            z = false;
        } else {
            z = true;
        }
        this.LLLLLJIL = (Room) this.LLILLL.gg0(RoomChannel.class);
        if (z) {
            C0J3Y c0j3y = C0J3Y.LIZ;
            Context context = getContext();
            boolean zLJJJI = C500260Jjc.LJJJI((Boolean) this.LLILLL.gg0(IsLiveStudioMonitorChannel.class));
            c0j3y.getClass();
            View viewLJFF = C0J3Y.LJFF(c0j3y, R.layout.gj7, viewGroup, false, context, zLJJJI, 32);
            MeasureLinearLayout measureLinearLayout2 = (MeasureLinearLayout) viewLJFF;
            this.LLJJJJJIL = measureLinearLayout2;
            measureLinearLayout2.LLILZLL = true;
            this.LLLF = (C1115150f7p) measureLinearLayout2.findViewById(R.id.view_shadow);
            this.LLJJLIIIJLLLLLLLZ = (LiveIconView) viewLJFF.findViewById(R.id.pnx);
            this.LLJL = (LiveIconView) viewLJFF.findViewById(R.id.pod);
            this.LLJLIL = (LiveIconView) viewLJFF.findViewById(R.id.upp);
            viewLJFF.findViewById(R.id.xlh);
            C786410Ut5.g8(this.LLJLIL, new ACListenerS152S0100000_17(this, 25));
            viewLJFF.findViewById(R.id.ko4);
            this.LLJLLL = viewLJFF.findViewById(R.id.ko2);
            this.LLJZIJLIL = viewLJFF.findViewById(R.id.ko3);
            this.LLJZ = viewLJFF.findViewById(R.id.kqv);
            this.LLLIIIIL = (LinearLayout) viewLJFF.findViewById(R.id.h07);
            this.LLLIIL = (LiveIconView) viewLJFF.findViewById(R.id.pnw);
            this.LLLIILIL = (LiveIconView) viewLJFF.findViewById(R.id.po3);
            this.LLJZ.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1151610g4d(this, 7));
            C20586115gx c20586115gx = (C20586115gx) viewLJFF.findViewById(R.id.grz);
            this.LLJLILLLLZIIL = c20586115gx;
            c20586115gx.setImeOptions(268435460);
            if (LiveCommentSendButtonOptSetting.enableCommentImeSendButtonOpt()) {
                this.LLJLILLLLZIIL.setRawInputType(1);
            }
            C786410Ut5.I7(new ACListenerS152S0100000_17(this, 26), viewLJFF.findViewById(R.id.upa));
            ((ArrayList) this.LLJLILLLLZIIL.LLJIJIL).add(new InterfaceC1115310f85() { // from class: X.0f83
                @Override // X.InterfaceC1115310f85
                public final void LIZ() {
                    this.LIZ.LLLIZZ = 1;
                }
            });
            this.LLJLILLLLZIIL.addTextChangedListener(this.LLLLLLLZIL);
            this.LLJLILLLLZIIL.setOnKeyListener(new View.OnKeyListener() { // from class: X.0f7w
                @Override // android.view.View.OnKeyListener
                public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                    LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = this.LL;
                    liveEmojiInputDialogFragment.getClass();
                    if (66 != i) {
                        return false;
                    }
                    if (1 == keyEvent.getAction()) {
                        liveEmojiInputDialogFragment.ZR(0);
                    }
                    return true;
                }
            });
            TextView textView = (TextView) viewLJFF.findViewById(R.id.gs8);
            this.LLJLLIL = textView;
            if (textView instanceof C418350Gan) {
                ((C418350Gan) textView).setEnableFitSize(!LiveCommentInnerHintSizeOptSetting.isEnable());
            }
            this.LLLFF = (LinearLayout) viewLJFF.findViewById(R.id.h05);
            this.LLLFFI = (ViewPager) viewLJFF.findViewById(R.id.ks8);
            this.LLLJ = C497740JfY.LJIIIZ(R.dimen.aqz) + ((int) C497740JfY.LIZIZ(1.0f));
            C16F5 c16f5 = (C16F5) viewLJFF.findViewById(R.id.b67);
            this.LLJLL = c16f5;
            c16f5.LJJJI(R.style.a9d);
        }
        if (getDialog() != null || ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
            C786410Ut5.y8(this.LLLF, new ACListenerS152S0100000_17(this, 23));
        }
        this.LLLLLILLIL = ((Boolean) this.LLILLL.gg0(C755520TkM.class)).booleanValue();
        InterfaceC1115130f7n interfaceC1115130f7n = this.LLILZ;
        if (interfaceC1115130f7n != null) {
            interfaceC1115130f7n.LIZ();
        }
        if (LiveCommentPanelOpenOptV2Setting.INSTANCE.isShowAsFragment()) {
            Map<String, Object> map = C1338270kvh.LIZ;
            C1115150f7p c1115150f7p = this.LLLF;
            if (this.LLLLJI != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            c1115150f7p.LLILZLL = z2;
            this.LLJJJJJIL.setPadding(0, 0, 0, 0);
            this.LLJJJJJIL.LLJ = false;
        } else {
            this.LLLF.LLILZLL = false;
            this.LLJJJJJIL.LLJ = true;
        }
        if (!this.LLJJJIL) {
            this.LLLF.setActivity(getActivity());
        }
        if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad()) {
            this.LLLF.setForceDispatchTouchEvent(true);
        }
        this.LLJJJJJIL.setCanSaveState(true);
        this.LLJLILLLLZIIL.setPadding(0, 0, 0, 0);
        C1115140f7o.LIZ(this.LLJLILLLLZIIL);
        if (!this.LLJJIII) {
            this.LLJILJIL = false;
        }
        this.LLJJLIIIJLLLLLLLZ.setIconAttr(R.attr.cj2);
        wS();
        C786410Ut5.LLIL(this.LLJLLIL, 0);
        if (this.LLJI == EnumC1114820f7I.Panel) {
            C786410Ut5.LLJILLL(this.LLJJJJJIL, 0);
            C786410Ut5.LJZL(0, this.LLLFF);
            if (this.LLJI.isEmojiPanel()) {
                this.LLJJLIIIJLLLLLLLZ.setIconAttr(R.attr.cjo);
            }
            if (this.LLLLIILLL) {
                dS(InterfaceC1106030et7.R7.LIZIZ().intValue());
            } else {
                dS(InterfaceC1106030et7.S7.LIZIZ().intValue());
            }
            HandlerHook.viewPost(this.LLLFF, new ARunnableS22S1100000_17(this, "liveroom_icon", 4));
            this.LLL = new C1085120eLO(this.LLLJ, PR(), true);
            C784440Upu.LIZ().LIZIZ(this.LLL);
        } else {
            C786410Ut5.LJZL(8, this.LLLFF);
        }
        MeasureLinearLayout measureLinearLayout3 = this.LLJJJJJIL;
        C19GS c19gs = null;
        if (!(measureLinearLayout3 instanceof View)) {
            measureLinearLayout3 = null;
        }
        if (measureLinearLayout3 != null) {
            try {
                ViewTreeLifecycleOwner.set(measureLinearLayout3, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(measureLinearLayout3, this);
                measureLinearLayout3.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return measureLinearLayout3;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return measureLinearLayout3;
    }

    public final void sS(final String str, String str2, List<EmoteWithIndex> list) {
        if (this.LLJLL != null && getActivity() != null && C500260Jjc.LJJIII(getActivity().getRequestedOrientation())) {
            if (str != null && str2 != null && list != null) {
                C1110390f09 c1110390f09 = C1110390f09.LIZ;
                C1110390f09.LIZ(list, EnumC1110450f0F.REPLY_STAYTYPE, str2, getResources(), null, null, new Function1() { // from class: X.0f7s
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = this.LL;
                        String str3 = str;
                        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj;
                        C786410Ut5.LLJJJJ(liveEmojiInputDialogFragment.LLJLL, 0);
                        spannableStringBuilder.insert(0, (CharSequence) str3);
                        liveEmojiInputDialogFragment.LLJLL.setText(spannableStringBuilder);
                        return Unit.LIZ;
                    }
                }, this, true);
            } else {
                C786410Ut5.LLJJJJ(this.LLJLL, 8);
            }
        }
    }
}
