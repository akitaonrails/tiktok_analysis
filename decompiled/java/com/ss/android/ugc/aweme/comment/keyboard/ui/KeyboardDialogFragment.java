package com.ss.android.ugc.aweme.comment.keyboard.ui;

import X.AbstractC848400XPy;
import X.AbstractC903280Zc6;
import X.C036E;
import X.C086I;
import X.C098200Yq;
import X.C09JN;
import X.C09M2;
import X.C0DK7;
import X.C0HD5;
import X.C0I04;
import X.C0I2X;
import X.C0P0T;
import X.C0WZX;
import X.C0XQ7;
import X.C10EU;
import X.C1163430gNh;
import X.C1233040iBy;
import X.C12ES;
import X.C1324840ka2;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1341590l13;
import X.C1341720l1G;
import X.C1341780l1M;
import X.C1342220l24;
import X.C1344030l4z;
import X.C1344860l6K;
import X.C1345870l7x;
import X.C1345920l82;
import X.C1346390l8n;
import X.C1346810l9T;
import X.C1347310lAH;
import X.C1347730lAx;
import X.C1347740lAy;
import X.C1347860lBA;
import X.C1348410lC3;
import X.C1348730lCZ;
import X.C1348790lCf;
import X.C1348800lCg;
import X.C1348810lCh;
import X.C1348840lCk;
import X.C1348850lCl;
import X.C1348860lCm;
import X.C1348980lCy;
import X.C1349180lDI;
import X.C1349270lDR;
import X.C1350620lFc;
import X.C1350650lFf;
import X.C1350920lG6;
import X.C1350950lG9;
import X.C1351410lGt;
import X.C1351440lGw;
import X.C1351950lHl;
import X.C1353500lKG;
import X.C1354730lMF;
import X.C1388190mED;
import X.C1389600mGU;
import X.C1389890mGx;
import X.C1391850mK7;
import X.C13IQ;
import X.C13LE;
import X.C1402120mag;
import X.C1548820qPI;
import X.C1685300txQ;
import X.C1848410yCV;
import X.C189200o6;
import X.C19252910Tv;
import X.C19719912Dl;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C20612915lH;
import X.C20642515q3;
import X.C20673215v0;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2204961BRm;
import X.C2208181Bbc;
import X.C2208191Bbd;
import X.C2211941Bhg;
import X.C2213981Bky;
import X.C2217381BqS;
import X.C2279851ELn;
import X.C2296808zG;
import X.C2344009Gk;
import X.C288920BUc;
import X.C294400BgM;
import X.C295780Bia;
import X.C295880Bik;
import X.C296140BjA;
import X.C418440Gaw;
import X.C427870Gq9;
import X.C438710HIf;
import X.C444960Hcc;
import X.C449460Hjs;
import X.C449480Hju;
import X.C449560Hk2;
import X.C451440Hn4;
import X.C451450Hn5;
import X.C452501pT;
import X.C454000HrC;
import X.C454010HrD;
import X.C454040HrG;
import X.C454060HrI;
import X.C459990I2b;
import X.C460000I2c;
import X.C460020I2e;
import X.C462450IBn;
import X.C523420Kfs;
import X.C626130Oh9;
import X.C723850SaN;
import X.C726240SeE;
import X.C736820SvI;
import X.C737370SwB;
import X.C786410Ut5;
import X.C815020Vy8;
import X.C827950Wdt;
import X.C844470XAv;
import X.EnumC1341650l19;
import X.EnumC1347820lB6;
import X.InterfaceC1347800lB4;
import X.InterfaceC1348430lC5;
import X.InterfaceC1348780lCe;
import X.InterfaceC1348870lCn;
import X.InterfaceC1349100lDA;
import X.InterfaceC1349150lDF;
import X.InterfaceC1349160lDG;
import X.InterfaceC1349170lDH;
import X.InterfaceC1349200lDK;
import X.InterfaceC1351520lH4;
import X.InterfaceC1353580lKO;
import X.InterfaceC20613315lL;
import X.InterfaceC316600Cb4;
import X.InterfaceC460010I2d;
import X.ViewOnLayoutChangeListenerC1401910maL;
import Y.ACListenerS155S0100000_21;
import Y.AObjectS364S0100000_21;
import Y.AObserverS224S0100000_21;
import Y.ARunnableS121S0100000_21;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import avg.f;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentImageModel;
import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import com.ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.ss.android.ugc.aweme.comment.multipanel.EmojiInputViewImplV2;
import com.ss.android.ugc.aweme.comment.quickmention.QuickMentionVM;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.comment.widgets.MentionSpan;
import com.ss.android.ugc.aweme.common.ui.BaseDialogFragment;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.experiment.CommentWithStickerExp;
import com.ss.android.ugc.aweme.feed.FeedCommonService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.CommentPersonalizedEmoji;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AFwS259S0000000_21;
import kotlin.jvm.internal.AwS0S1311000_6;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS79S0500000_19;
import mf.a;

/* JADX INFO: loaded from: classes22.dex */
public class KeyboardDialogFragment extends BaseDialogFragment implements TextWatcher, DialogInterface.OnShowListener, InterfaceC1349170lDH, InterfaceC460010I2d, InterfaceC1347800lB4, InterfaceC1351520lH4, C0I04 {
    public static final String _pnsPageId = "KyohZzwgZiQiLT08ISFiPCgwZiQ7LCI2ZiYjJCI2JjFiIiHELIOSoqKiotOyt9PSxiAioqKiotOysXISQgJigVOiQrJCo9PA==";
    public ViewGroup LLILLL;
    public ImageView LLILZ;
    public View LLILZIL;
    public C427870Gq9 LLILZLL;
    public C1353500lKG LLIZ;
    public SmartImageView LLIZLLLIL;
    public FrameLayout LLJ;
    public LinearLayout LLJI;
    public TuxIconView LLJIJIL;
    public TuxIconView LLJILJIL;
    public TuxIconView LLJILJILJ;
    public ViewGroup LLJILLL;
    public TuxIconView LLJJ;
    public View LLJJI;
    public TuxIconView LLJJIII;
    public View LLJJIJI;
    public View LLJJIJIIJIL;
    public View LLJJIJIL;
    public RemoteImageView LLJJJ;
    public View LLJJJIL;
    public LinearLayout LLJJJJ;
    public C1348800lCg LLJJJJJIL;
    public FrameLayout LLJJJJLIIL;
    public C1351440lGw LLJJL;
    public View LLJJLIIIJLLLLLLLZ;
    public LinearLayout LLJL;
    public LinearLayout LLJLIL;
    public C1348840lCk LLJLILLLLZIIL;
    public View LLJLL;
    public View LLJLLIL;
    public View LLJLLL;
    public View LLJZ;
    public ViewGroup LLJZIJLIL;
    public ViewGroup LLL;
    public C1341720l1G LLLF;
    public FrameLayout LLLFF;
    public FrameLayout LLLFFI;
    public FrameLayout LLLFZ;
    public FrameLayout LLLI;
    public C449460Hjs LLLII;
    public InterfaceC1349150lDF LLLIIII;
    public InterfaceC1349100lDA LLLIIIIL;
    public InterfaceC1349200lDK LLLIIIL;
    public C460000I2c LLLIIL;
    public String LLLIILIL;
    public boolean LLLIL;
    public int LLLILZ;
    public boolean LLLILZJ;
    public boolean LLLILZLLLI;
    public Aweme LLLIZZ;
    public String LLLJ;
    public Emoji LLLJIL;
    public boolean LLLJL;
    public boolean LLLL;
    public C1348730lCZ LLLLII;
    public CommentVideoModel.Type LLLLIIIILLL;
    public C0P0T LLLLIIL;
    public GiftViewModel LLLLIILL;
    public final C09M2 LLLLIILLL;
    public View LLLLIL;
    public ViewOnLayoutChangeListenerC1401910maL LLLLILI;
    public final C1348810lCh LLLLJ;
    public CharSequence LLLLJI;
    public boolean LLLLL;
    public C1346810l9T LLLLLIL;
    public int LLLLLILLIL;
    public final IVideoGiftService LLLLLJIL;
    public View LLLLLJLJLL;
    public View LLLLLL;
    public C19EG LLLLLLIL;
    public QuickMentionVM LLLLLLJ;
    public boolean LLLLLLL;
    public int LLLLLLLLL;
    public boolean LLLLLLLLLL;
    public int LLLLLLLZIL;
    public boolean LLLLLLZ;
    public boolean LLLLLLZZ;
    public boolean LLLLLZ;
    public boolean LLLLLZIL;
    public boolean LLLLLZL;
    public int LLLLZ;
    public int LLLLZI;
    public InterfaceC1348870lCn LLLLZIL;
    public final InterfaceC316600Cb4 LLLLZLL;
    public C1348790lCf LLLLZLLIL;
    public View LLLLZLLLI;
    public FrameLayout LLLZ;
    public TuxIconView LLLZI;
    public View LLLZIIL;
    public View LLLZIL;
    public View LLLZL;
    public int LLLZLL;
    public int LLLZLZ;
    public boolean LLLZZ;
    public boolean LLLZZIL;
    public boolean LLZ;
    public boolean LLZIL;
    public boolean LLZILL;
    public C459990I2b LLZL;
    public boolean LLZLI;
    public boolean LLZLL;

    public final void NR() {
        this.LLLILZJ = false;
        this.LLLILZLLLI = false;
    }

    @Override // X.InterfaceC460010I2d
    public final boolean RF() {
        return false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final boolean Bc2() {
        FrameLayout frameLayout = this.LLLZ;
        return frameLayout != null && frameLayout.getVisibility() == 0;
    }

    public final Set<String> SR() {
        HashSet hashSet = new HashSet();
        MentionSpan[] mentionSpan = this.LLIZ.getMentionSpan();
        if (mentionSpan != null && mentionSpan.length != 0) {
            for (MentionSpan mentionSpan2 : mentionSpan) {
                hashSet.add(mentionSpan2.LIZJ());
            }
        }
        return hashSet;
    }

    public final boolean VR() {
        return this.LLLILZJ || this.LLLILZLLLI;
    }

    public final void ZR() {
        C1348730lCZ c1348730lCZ = this.LLLLII;
        if (c1348730lCZ != null) {
            c1348730lCZ.LJJII(this.LLIZ);
            Bundle arguments = getArguments();
            if (arguments != null && arguments.getInt("publishScenario") == 9) {
                this.LLLLII.LL = C2204961BRm.LLLZZIL(this.LLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0i2XLulHCwPDUaow+UtSpqApMiig+1lpuvg==", null));
            }
        }
    }

    public final void Zf0() {
        Drawable drawable;
        if (this.LLLLLLL) {
            return;
        }
        C1353500lKG c1353500lKG = this.LLIZ;
        if (c1353500lKG != null) {
            c1353500lKG.setVerticalScrollBarEnabled(true);
            this.LLIZ.setScrollBarSize(C418440Gaw.LIZ(4));
            Context context = this.LLIZ.getContext();
            if (context != null && (drawable = context.getDrawable(R.drawable.a13)) != null) {
                if (Build.VERSION.SDK_INT >= 29) {
                    this.LLIZ.setVerticalScrollbarThumbDrawable(drawable);
                } else {
                    try {
                        Field declaredField = View.class.getDeclaredField("mScrollCache");
                        declaredField.setAccessible(true);
                        Object obj = declaredField.get(this.LLIZ);
                        if (obj != null) {
                            Field declaredField2 = obj.getClass().getDeclaredField("scrollBar");
                            declaredField2.setAccessible(true);
                            Object obj2 = declaredField2.get(obj);
                            if (obj2 != null) {
                                Method declaredMethod = obj2.getClass().getDeclaredMethod("setVerticalThumbDrawable", Drawable.class);
                                declaredMethod.setAccessible(true);
                                declaredMethod.invoke(obj2, drawable);
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C1344030l4z.LIZ("KeyboardDialog: ", e.toString());
                    }
                }
            }
        }
        if (this.LLIZ.getLineCount() >= C288920BUc.LIZ() && this.LLLZIIL == null) {
            View viewLIZIZ = C726240SeE.LIZIZ(this.LLLLIL, null, R.id.eas, R.id.vs_comment_expand_button_below_avatar);
            this.LLLZIIL = viewLIZIZ;
            C1341780l1M.LIZ.LIZ(viewLIZIZ, EnumC1341650l19.ALPHA_BUTTON);
            if (!this.LLLLLLL) {
                C786410Ut5.I7(new ACListenerS155S0100000_21(this, 293), this.LLLZIIL);
            }
        }
        if (this.LLLZIIL != null) {
            if (Bc2() || this.LLIZ.getLineCount() < C288920BUc.LIZ()) {
                C786410Ut5.LJLLLLLL(8, this.LLLZIIL);
            } else {
                C786410Ut5.LJLLLLLL(0, this.LLLZIIL);
                mS(true);
            }
        }
    }

    public final void aS() {
        ArrayList<TextExtraStruct> mentionExtraStructList;
        C1347310lAH c1347310lAHRR = RR();
        getArguments().putInt("argIsInvokedFromFakeEditText", -1);
        c1347310lAHRR.LJIILL = Boolean.TRUE;
        if (this.LLLIIII != null) {
            if (C2279851ELn.LIZIZ() && this.LLLLLLJ != null && (mentionExtraStructList = this.LLIZ.getMentionExtraStructList()) != null && !mentionExtraStructList.isEmpty()) {
                if (this.LLLLLLJ.getState().LL == EnumC1347820lB6.SHOW) {
                    C0DK7.LIZ().LIZIZ();
                }
                this.LLLLLLJ.vQ2(EnumC1347820lB6.HIDE);
                C0DK7.LIZ().LJ();
            }
            InterfaceC1349150lDF interfaceC1349150lDF = this.LLLIIII;
            String[] strArr = null;
            Editable editableLLLZZIL = C2204961BRm.LLLZZIL(this.LLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0i2XLulHCwPDUaow+UtSpqApMiig+1lpuvg==", null));
            ArrayList<TextExtraStruct> mentionExtraStructList2 = this.LLIZ.getMentionExtraStructList();
            C1348730lCZ c1348730lCZ = this.LLLLII;
            List<CommentImageModel> list = c1348730lCZ.LLJJIJI;
            CommentStickerStruct commentStickerStruct = c1348730lCZ.LLJJIJIIJIL;
            int i = this.LLLLLILLIL;
            String str = this.LLLJ;
            C1348730lCZ c1348730lCZ2 = (C1348730lCZ) interfaceC1349150lDF;
            Aweme awemeLJIILIIL = c1348730lCZ2.LJIILIIL();
            GiftViewModel giftViewModel = c1348730lCZ2.LLJLILLLLZIIL;
            if (((giftViewModel != null && giftViewModel.wQ2().getValue() != null) || !TextUtils.isEmpty(editableLLLZZIL) || ((list != null && !list.isEmpty()) || commentStickerStruct != null)) && c1348730lCZ2.LJJ()) {
                if (C10EU.LJIIIIZZ()) {
                    C1233040iBy c1233040iBy = new C1233040iBy(c1348730lCZ2.LLILZ.getContext());
                    c1233040iBy.LIZIZ(2131828626);
                    c1233040iBy.LIZLLL();
                } else {
                    c1348730lCZ2.LLILZ.getContext();
                    try {
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (C036E.LIZ.LIZIZ()) {
                        Context context = c1348730lCZ2.LLILZ.getContext();
                        if (context != null) {
                            context = C1388190mED.LIZ(context);
                        }
                        CommentService.LIZ.getClass();
                        if (C523420Kfs.LIZ().LJIILLIIL(awemeLJIILIIL)) {
                            C523420Kfs.LIZ().LLIIII(context, 2131829154, c1348730lCZ2.LLILZ.getString(2131829236));
                        } else if (!C523420Kfs.LIZ().LJJIJIIJIL(awemeLJIILIIL)) {
                            C523420Kfs.LIZ().LLIIII(context, 2131829171, c1348730lCZ2.LLILZ.getString(2131829170));
                        } else if (editableLLLZZIL.length() > c1348730lCZ2.LJIJJ()) {
                            C1233040iBy c1233040iBy2 = new C1233040iBy(c1348730lCZ2.LLILZ.getContext());
                            c1233040iBy2.LIZIZ(2131827367);
                            c1233040iBy2.LIZLLL();
                        } else {
                            if (c1348730lCZ2.LLILZIL.getCommentInputReplyComment() != null) {
                                c1348730lCZ2.LLJ = 2;
                            } else {
                                c1348730lCZ2.LLJ = 1;
                            }
                            c1348730lCZ2.LLJZ = false;
                            c1347310lAHRR.LIZJ = mentionExtraStructList2;
                            c1347310lAHRR.LIZLLL = C1351950lHl.LJIILIIL(list);
                            c1347310lAHRR.LJ = commentStickerStruct != null;
                            c1347310lAHRR.LJFF = commentStickerStruct != null ? C454000HrC.LJIIIIZZ(commentStickerStruct.getStickerType()) : "";
                            c1347310lAHRR.LJI = (commentStickerStruct == null || commentStickerStruct.getSetId() == null) ? "" : commentStickerStruct.getSetId().toString();
                            c1347310lAHRR.LJII = (commentStickerStruct == null || commentStickerStruct.getId() == null) ? "" : commentStickerStruct.getId();
                            c1347310lAHRR.LJIIIIZZ = (commentStickerStruct == null || commentStickerStruct.getStickerEnterMethod() == null) ? "" : commentStickerStruct.getStickerEnterMethod();
                            c1347310lAHRR.LJIIJ = c1348730lCZ2.LLLII.LIZJ;
                            if (!c1348730lCZ2.LLJZ) {
                                Pattern pattern = C462450IBn.LIZ;
                                C462450IBn.LIZJ(editableLLLZZIL.toString());
                                c1348730lCZ2.LLILZIL.onCommentInputPublishClick(c1348730lCZ2.LLJ, C462450IBn.LIZJ(editableLLLZZIL.toString()), editableLLLZZIL, "button_send", "", false, c1347310lAHRR);
                            }
                            InterfaceC1348780lCe interfaceC1348780lCe = c1348730lCZ2.LLILZIL;
                            String eventType = interfaceC1348780lCe == null ? "" : interfaceC1348780lCe.getEventType();
                            String aid = awemeLJIILIIL != null ? awemeLJIILIIL.getAid() : "";
                            C1345920l82 c1345920l82 = new C1345920l82();
                            c1345920l82.LIZ = aid;
                            c1345920l82.LIZIZ = editableLLLZZIL.toString();
                            c1345920l82.LJIILJJIL = eventType;
                            c1345920l82.LIZLLL = mentionExtraStructList2;
                            c1345920l82.LJIILLIIL = list;
                            c1345920l82.LJIIZILJ = commentStickerStruct;
                            c1345920l82.LJFF = C737370SwB.LIZ(eventType);
                            c1345920l82.LJIIL = false;
                            c1345920l82.LJIILIIL = i;
                            c1345920l82.LJJI = c1348730lCZ2.LJIJ();
                            c1345920l82.LJIJ = c1348730lCZ2.LJIIL();
                            C1345870l7x c1345870l7x = new C1345870l7x();
                            c1345870l7x.LLILLJJLI = c1348730lCZ2;
                            c1348730lCZ2.LLILZIL.getEventType();
                            InterfaceC1348780lCe interfaceC1348780lCe2 = c1348730lCZ2.LLILZIL;
                            if (interfaceC1348780lCe2 == null || interfaceC1348780lCe2.getCommentInputReplyComment() == null) {
                                c1345870l7x.LLIZ = c1348730lCZ2.LLJILLL ? 1 : 0;
                            } else {
                                Comment commentInputReplyComment = c1348730lCZ2.LLILZIL.getCommentInputReplyComment();
                                if (commentInputReplyComment.getCommentType() == 2) {
                                    c1345870l7x.LLIZ = 2;
                                    c1345920l82.LIZJ = commentInputReplyComment.getRootCommentId();
                                    c1345920l82.LJ = commentInputReplyComment.getCid();
                                } else {
                                    c1345870l7x.LLIZ = c1348730lCZ2.LLJILLL ? 2 : 0;
                                    c1345920l82.LIZJ = commentInputReplyComment.getCid();
                                }
                                C1351950lHl.LJII(commentInputReplyComment);
                            }
                            if (str != null && !TextUtils.isEmpty(str)) {
                                c1345920l82.LJJI = str;
                            }
                            GiftViewModel giftViewModel2 = c1348730lCZ2.LLJLILLLLZIIL;
                            if (giftViewModel2 != null && giftViewModel2.wQ2().getValue() != null) {
                                long j = c1348730lCZ2.LLJLILLLLZIIL.wQ2().getValue().id;
                                boolean zIsFromGiftBag = c1348730lCZ2.LLJLILLLLZIIL.wQ2().getValue().isFromGiftBag();
                                c1345920l82.LJII = j;
                                c1345920l82.LJIIIIZZ = zIsFromGiftBag;
                                c1345920l82.LJI = c1348730lCZ2.LJIIL();
                                if (c1348730lCZ2.LLJLILLLLZIIL.xQ2().getValue() != null) {
                                    c1345920l82.LJIIIZ = c1348730lCZ2.LLJLILLLLZIIL.xQ2().getValue().get(Long.valueOf(j));
                                }
                                if (!c1348730lCZ2.LLJLLL.LIZJ()) {
                                    c1348730lCZ2.LLJLLL.LIZIZ();
                                }
                            }
                            c1345920l82.LJIIJ = 0;
                            if (C1341590l13.LIZIZ()) {
                                C1348410lC3 c1348410lC3 = c1348730lCZ2.LLLII;
                                c1345920l82.LJIJI = c1348410lC3.LIZJ;
                                c1348410lC3.LIZJ = false;
                            }
                            c1345920l82.LJIJJLI = c1347310lAHRR.LJIILJJIL;
                            c1345920l82.LJJ = c1348730lCZ2.LLJILJILJ;
                            c1348730lCZ2.LLJILJILJ = false;
                            c1345920l82.LJIL = c1347310lAHRR.LJIILL.booleanValue();
                            c1345870l7x.LJIILL(c1345920l82.LIZ());
                            c1348730lCZ2.LJJIJIL(c1345870l7x);
                            if (mentionExtraStructList2 != null && mentionExtraStructList2.size() > 0) {
                                ArrayList arrayList = new ArrayList();
                                Iterator<TextExtraStruct> it2 = mentionExtraStructList2.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(it2.next().getUserId());
                                }
                                HashMap map = new HashMap();
                                map.put("is_include_quick_mention", c1347310lAHRR.LJIIL ? "1" : CardStruct.IStatusCode.DEFAULT);
                                C1350920lG6 c1350920lG6 = C1350920lG6.LIZ;
                                String strLJIIZILJ = c1348730lCZ2.LJIIZILJ();
                                c1350920lG6.getClass();
                                C1350920lG6.LJLLILLLL(arrayList, awemeLJIILIIL, strLJIIZILJ, map);
                            }
                            strArr = null;
                            c1348730lCZ2.LJJIJLIJ(null);
                        }
                    } else {
                        C1389890mGx c1389890mGx = new C1389890mGx(c1348730lCZ2.LLILZ);
                        c1389890mGx.LJIIIZ(2131837962);
                        c1389890mGx.LJIIJJI();
                    }
                }
            }
            C1350920lG6 c1350920lG62 = C1350920lG6.LIZ;
            LinkedHashMap<String, Integer> linkedHashMapLIZJ = this.LLLLIILLL.LIZJ(C2204961BRm.LLLZZIL(this.LLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0i2XLulHCwPDUaow+UtSpqApMiig+1lpuvg==", strArr)));
            c1350920lG62.getClass();
            C1350920lG6.LLI(linkedHashMapLIZJ);
        }
    }

    public final void dS() {
        InterfaceC1348870lCn interfaceC1348870lCn;
        int measuredHeight = this.LLJLILLLLZIIL.getMeasuredHeight() - this.LLJLL.getMeasuredHeight();
        float fLIZJ = C12ES.LIZJ(220.0f, getContext());
        if (measuredHeight >= fLIZJ || this.LLLZZ) {
            measuredHeight = (int) fLIZJ;
        }
        if (measuredHeight > 0 && this.LLLLLLLZIL != measuredHeight && (interfaceC1348870lCn = this.LLLLZIL) != null) {
            interfaceC1348870lCn.rm(measuredHeight);
        }
        this.LLLLLLLZIL = measuredHeight;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void dismiss() {
        C1348410lC3 c1348410lC3;
        KeyboardDialogFragment keyboardDialogFragment;
        MentionSpan[] mentionSpan;
        Editable editableLLLZZIL;
        C1348730lCZ c1348730lCZ = this.LLLLII;
        if (c1348730lCZ == null || !c1348730lCZ.LLJJIJIL) {
            this.LLLIIL = null;
            try {
                super.dismiss();
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                super.dismissAllowingStateLoss();
            }
            InterfaceC1349200lDK interfaceC1349200lDK = this.LLLIIIL;
            if (interfaceC1349200lDK != null) {
                Emoji emoji = this.LLLJIL;
                C1347310lAH c1347310lAHRR = RR();
                final C1348730lCZ c1348730lCZ2 = (C1348730lCZ) interfaceC1349200lDK;
                c1348730lCZ2.LLLI = false;
                C1353500lKG c1353500lKG = c1348730lCZ2.LLILLL;
                final boolean z = true;
                boolean z2 = c1353500lKG != null && ((editableLLLZZIL = C2204961BRm.LLLZZIL(c1353500lKG, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null))) == null || editableLLLZZIL.length() == 0);
                c1348730lCZ2.LJJIJL();
                boolean z3 = z2 && emoji == null && c1348730lCZ2.LLJJIJI == null && !c1348730lCZ2.LLJJIJIL && c1348730lCZ2.LLJJIJIIJIL == null && c1348730lCZ2.LLJLILLLLZIIL.wQ2().getValue() == null;
                c1348730lCZ2.LLILZIL.onCommentInputKeyboardDismiss(z3, c1347310lAHRR);
                if (c1348730lCZ2.LJJ() && (keyboardDialogFragment = (KeyboardDialogFragment) c1348730lCZ2.LLILZ.getChildFragmentManager().LJJJJZI("CommentInputManager")) != null) {
                    C1353500lKG c1353500lKG2 = keyboardDialogFragment.LLIZ;
                    if (c1353500lKG2 == null || (mentionSpan = c1353500lKG2.getMentionSpan()) == null || mentionSpan.length == 0) {
                        c1348730lCZ2.LLILZLL.clear();
                    } else {
                        Iterator<User> it2 = c1348730lCZ2.LLILZLL.iterator();
                        while (it2.hasNext()) {
                            User next = it2.next();
                            boolean z4 = false;
                            for (MentionSpan mentionSpan2 : mentionSpan) {
                                if (TextUtils.equals(next.getUid(), mentionSpan2.LIZJ())) {
                                    z4 = true;
                                }
                            }
                            if (!z4) {
                                it2.remove();
                            }
                        }
                    }
                }
                if (z3) {
                    c1348730lCZ2.LJJIJIIJI();
                    c1348730lCZ2.LJJIJLIJ(null);
                } else {
                    c1348730lCZ2.LJJIJLIJ(emoji);
                }
                View view = c1348730lCZ2.LLJLLIL;
                if (view != null && (view instanceof TuxIconView) && !c1348730lCZ2.LLILZIL.isLandscapeMode()) {
                    if ((c1348730lCZ2.LLILZIL.getCommentInputViewType() == 1 || c1348730lCZ2.LLILZIL.getCommentInputViewType() == 2) && C1350950lG9.LIZIZ.LIZLLL()) {
                        Aweme awemeLJIILIIL = c1348730lCZ2.LJIILIIL();
                        if (awemeLJIILIIL != null && c1348730lCZ2.LLJLLL.LIZ(awemeLJIILIIL)) {
                            C786410Ut5.LJLLLLLL(0, c1348730lCZ2.LLJLLIL);
                        }
                        if (!c1348730lCZ2.LLLII.LIZJ && c1348730lCZ2.LLJJIJIIJIL == null) {
                            C786410Ut5.T4(c1348730lCZ2.LLJLLIL, 1.0f);
                        }
                        new C626130Oh9(c1348730lCZ2.LLJLLIL).LJLIL(1L, TimeUnit.SECONDS).LJJLJLI(new C09JN() { // from class: X.0lCr
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1348730lCZ c1348730lCZ3 = c1348730lCZ2;
                                boolean z5 = z;
                                c1348730lCZ3.getClass();
                                C1C7U.LIZ("CommentInputManager@e031.innerReset$1L");
                                c1348730lCZ3.LJJIIJZLJL(z5);
                                C1C7U.LIZIZ("CommentInputManager@e031.innerReset$1L");
                            }
                        });
                    } else {
                        C786410Ut5.LJLLLLLL(8, c1348730lCZ2.LLJLLIL);
                    }
                }
            }
            this.LLLJIL = null;
            if (this.LLLLIIIILLL != CommentVideoModel.Type.NONE) {
                ImageView imageView = this.LLILZ;
                if (imageView != null) {
                    C786410Ut5.LJZI(8, imageView);
                }
                if (this.LLJILJIL != null) {
                    C1350650lFf.LIZ.getClass();
                    if (C1350650lFf.LIZ()) {
                        C786410Ut5.LLLLLLZZ(this.LLJILJIL, 8);
                    }
                }
                C0P0T c0p0t = this.LLLLIIL;
                if (c0p0t != null) {
                    c0p0t.dismiss();
                }
            }
            C1348730lCZ c1348730lCZ3 = this.LLLLII;
            if (c1348730lCZ3 == null || (c1348410lC3 = c1348730lCZ3.LLLII) == null) {
                return;
            }
            c1348410lC3.LIZLLL = false;
        }
    }

    @Override // X.InterfaceC1351520lH4
    public final void gJ() {
        QuickMentionVM quickMentionVM = this.LLLLLLJ;
        if (quickMentionVM != null) {
            quickMentionVM.vQ2(EnumC1347820lB6.HIDE);
        }
    }

    public final void il2() {
        InterfaceC1348870lCn interfaceC1348870lCn;
        if (this.LLLLLLL) {
            return;
        }
        if (!this.LLLZZ) {
            View view = this.LLLZIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
            }
            View view2 = this.LLLZL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
                return;
            }
            return;
        }
        boolean z = (this.LLLI == null || this.LLLFFI == null || (interfaceC1348870lCn = this.LLLLZIL) == null || !interfaceC1348870lCn.Hn()) ? false : true;
        boolean z2 = (this.LLLFZ == null || this.LLLF == null || this.LLLLIILL.wQ2().getValue() == null) ? false : true;
        if (z) {
            View view3 = this.LLLZIL;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(8, view3);
            }
            View view4 = this.LLLZL;
            if (view4 != null) {
                C786410Ut5.LJLLLLLL(0, view4);
                return;
            }
            return;
        }
        if (z2) {
            View view5 = this.LLLZIL;
            if (view5 != null) {
                C786410Ut5.LJLLLLLL(0, view5);
            }
            View view6 = this.LLLZL;
            if (view6 != null) {
                C786410Ut5.LJLLLLLL(8, view6);
                return;
            }
            return;
        }
        View view7 = this.LLLZIL;
        if (view7 != null) {
            C786410Ut5.LJLLLLLL(8, view7);
        }
        View view8 = this.LLLZL;
        if (view8 != null) {
            C786410Ut5.LJLLLLLL(8, view8);
        }
    }

    @Override // X.InterfaceC1351520lH4
    public final void ma() {
        QuickMentionVM quickMentionVM = this.LLLLLLJ;
        if (quickMentionVM != null) {
            quickMentionVM.vQ2(EnumC1347820lB6.HIDE);
        }
    }

    @Override // X.InterfaceC1351520lH4
    public final void p9() {
        QuickMentionVM quickMentionVM = this.LLLLLLJ;
        if (quickMentionVM != null) {
            quickMentionVM.vQ2(EnumC1347820lB6.SHOW);
        }
    }

    @Override // X.InterfaceC1347800lB4
    public final List<CommentPersonalizedEmoji> pP() {
        C0I2X c0i2x = C0I2X.LIZ;
        Aweme aweme = this.LLLIZZ;
        c0i2x.getClass();
        return C0I2X.LIZLLL(aweme);
    }

    @Override // X.InterfaceC1351520lH4
    public final void tk() {
        User userLIZJ = C1351410lGt.LIZJ(this.LLLIZZ);
        if (userLIZJ != null) {
            this.LLLLZIL.Sa(userLIZJ);
        }
    }

    @Override // X.InterfaceC1351520lH4
    public final void tt() {
        InterfaceC1348870lCn interfaceC1348870lCn;
        User userLIZLLL = C1351410lGt.LIZLLL(this.LLLIZZ);
        if (userLIZLLL == null || (interfaceC1348870lCn = this.LLLLZIL) == null) {
            return;
        }
        interfaceC1348870lCn.Sa(userLIZLLL);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0lCh] */
    public KeyboardDialogFragment() {
        PatternProtector.compile("^\\s*$");
        this.LLLILZJ = false;
        this.LLLILZLLLI = false;
        this.LLLJ = "";
        this.LLLJL = false;
        this.LLLL = false;
        this.LLLLIIIILLL = CommentVideoModel.Type.NONE;
        new HashSet();
        new ArrayList();
        this.LLLLIILL = null;
        this.LLLLIILLL = new C09M2();
        this.LLLLJ = new InterfaceC1349160lDG() { // from class: X.0lCh
            @Override // X.InterfaceC1349160lDG
            public final void LIZ() {
                List<CommentImageModel> list;
                KeyboardDialogFragment keyboardDialogFragment = this.LIZ;
                if (keyboardDialogFragment.LLLIZZ != null && (list = keyboardDialogFragment.LLLLII.LLJJIJI) != null && !list.isEmpty()) {
                    int i = C1344860l6K.LIZ;
                    if (C1344860l6K.LIZIZ((CommentImageModel) ListProtector.get(this.LIZ.LLLLII.LLJJIJI, 0), this.LIZ.LLLIZZ.getAid())) {
                        C1389890mGx c1389890mGx = new C1389890mGx(this.LIZ.LLLLLLIL);
                        c1389890mGx.LJIIIZ(2131834211);
                        c1389890mGx.LJIIJJI();
                        return;
                    }
                }
                this.LIZ.aS();
            }
        };
        this.LLLLL = true;
        this.LLLLLILLIL = 0;
        this.LLLLLJIL = VideoGiftService.LJI();
        this.LLLLLJLJLL = null;
        this.LLLLLL = null;
        this.LLLLLLL = false;
        this.LLLLLLLLL = 0;
        this.LLLLLLLLLL = false;
        this.LLLLLZ = false;
        this.LLLLLZIL = false;
        this.LLLLLZL = false;
        this.LLLLZ = 0;
        this.LLLLZI = -1;
        this.LLLLZIL = null;
        this.LLLLZLL = C20612915lH.LIZIZ.LJIIIIZZ();
        this.LLLLZLLIL = null;
        this.LLLZLL = 0;
        this.LLLZLZ = 0;
        this.LLLZZ = false;
        this.LLLZZIL = true;
        this.LLZ = true;
        this.LLZIL = true;
        this.LLZILL = true;
        this.LLZLI = false;
        this.LLZLL = true;
    }

    public final C1347310lAH RR() {
        MentionSpan[] mentionSpan;
        int i = getArguments().getInt("argIsInvokedFromFakeEditText", -1);
        String str = "";
        getArguments().getString("rec_type", "");
        String string = getArguments().getString("fromPage", "");
        boolean z = true;
        if (i == 0) {
            str = "comment_button";
        } else if (i == 1) {
            str = "input_box";
        }
        C1347310lAH c1347310lAH = new C1347310lAH(str, string);
        ((FeedCommonService) ServiceManager.get().getService(FeedCommonService.class)).LJJI(getContext(), this.LLLIZZ);
        String string2 = getArguments().getString("session_id", null);
        if (!TextUtils.isEmpty(string2)) {
            c1347310lAH.LJIILIIL = string2;
        }
        C1353500lKG c1353500lKG = this.LLIZ;
        if (c1353500lKG != null) {
            c1347310lAH.LJIIIZ = c1353500lKG.getEmojiSpanList();
            C1353500lKG c1353500lKG2 = this.LLIZ;
            if (c1353500lKG2 == null || (mentionSpan = c1353500lKG2.getMentionSpan()) == null) {
                z = false;
                c1347310lAH.LJIIL = z;
            } else {
                for (MentionSpan mentionSpan2 : mentionSpan) {
                    if (mentionSpan2.fromQuickMention != 0) {
                        break;
                    }
                }
                z = false;
                c1347310lAH.LJIIL = z;
            }
        }
        c1347310lAH.LJIILJJIL = getArguments().getBoolean("isFromGuideReply", false) ? 1 : 0;
        return c1347310lAH;
    }

    public final boolean UR() {
        if (getArguments() != null) {
            return getArguments().getInt("viewType") == 1 || getArguments().getInt("viewType") == 2;
        }
        return false;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final AbstractC903280Zc6 getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        ViewOnLayoutChangeListenerC1401910maL viewOnLayoutChangeListenerC1401910maL;
        C19EG activity;
        C1353500lKG c1353500lKG;
        super.onDestroy();
        C1348730lCZ c1348730lCZ = this.LLLLII;
        if (c1348730lCZ != null && (c1353500lKG = this.LLIZ) != null && ((CopyOnWriteArrayList) c1348730lCZ.LLJLIL).contains(c1353500lKG)) {
            ((CopyOnWriteArrayList) c1348730lCZ.LLJLIL).remove(c1353500lKG);
        }
        C449460Hjs c449460Hjs = this.LLLII;
        if (c449460Hjs != null) {
            C2296808zG.LIZJ(c449460Hjs.LLIZLLLIL, null);
        }
        C1348790lCf c1348790lCf = this.LLLLZLLIL;
        if (c1348790lCf != null) {
            C1548820qPI.LJIIIIZZ("wallet_exchange_status", c1348790lCf.LJIIJ);
        }
        this.LLLLZIL = null;
        il2();
        if (this.LLLLIILL != null && (activity = getActivity()) != null) {
            this.LLLLIILL.vQ2().removeObservers(activity);
            this.LLLLIILL.wQ2().removeObservers(activity);
            this.LLLLIILL.xQ2().removeObservers(activity);
            this.LLLLIILL.yQ2().removeObservers(activity);
            ((LiveData) this.LLLLIILL.LLILZIL.getValue()).removeObservers(activity);
            this.LLLLIILL.LLJILLL.removeObservers(activity);
        }
        View view = this.LLLLIL;
        if (view == null || (viewOnLayoutChangeListenerC1401910maL = this.LLLLILI) == null) {
            return;
        }
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1401910maL);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        ViewGroup viewGroup;
        super.onPause();
        List<InterfaceC1349170lDH> list = this.LLJLILLLLZIIL.getKeyBoardObservable().LIZLLL;
        if (list != null) {
            ((ArrayList) list).remove(this);
        }
        C19EG activity = getActivity();
        if (activity == null || this.LLLLLJLJLL == null || (viewGroup = (ViewGroup) activity.findViewById(android.R.id.content)) == null) {
            return;
        }
        C786410Ut5.LJJJLZIJ(this.LLLLLJLJLL, viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1348860lCm keyBoardObservable = this.LLJLILLLLZIIL.getKeyBoardObservable();
        if (keyBoardObservable.LIZLLL == null) {
            keyBoardObservable.LIZLLL = new ArrayList();
        }
        ((ArrayList) keyBoardObservable.LIZLLL).add(this);
        this.LLIZ.requestFocus();
        if (VR()) {
            PR(200);
        } else if (this.LLLLL) {
            this.LLLLL = false;
        } else {
            bS(0);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View decorView;
        try {
            Window window2 = getDialog().getWindow();
            WindowManager.LayoutParams attributes = window2.getAttributes();
            if (attributes != null) {
                attributes.dimAmount = 0.0f;
                attributes.windowAnimations = 0;
                window2.setAttributes(attributes);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        ViewTreeLifecycleOwner.set(decorView, this);
        ViewTreeViewModelStoreOwner.set(decorView, this);
        decorView.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // X.InterfaceC460010I2d
    public final void E0() {
        InterfaceC1349100lDA interfaceC1349100lDA = this.LLLIIIIL;
    }

    @Override // X.C0I04
    public final void Cj(C454040HrG c454040HrG) {
        C454000HrC.LJIIJ(c454040HrG);
        throw null;
    }

    @Override // X.C0I04
    public final void Hp(String str) {
        this.LLZL.LIZ(str, this.LLLIZZ, this.LLLILZ, null);
    }

    public final boolean MR(Boolean bool) {
        if (!bool.booleanValue()) {
            C1350650lFf.LIZ.getClass();
            if (!this.LLLILZJ && !this.LLLILZLLLI) {
                return false;
            }
        }
        if (C1346390l8n.LIZLLL(this.LLLIZZ)) {
            InterfaceC1348780lCe interfaceC1348780lCe = this.LLLLII.LLILZIL;
            if ((interfaceC1348780lCe == null || interfaceC1348780lCe.getCommentInputReplyComment() == null) && !this.LLLLLLL && C1341590l13.LIZIZ()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void PR(int i) {
        ARunnableS121S0100000_21 aRunnableS121S0100000_21 = new ARunnableS121S0100000_21(this, 163);
        if (i == 0) {
            aRunnableS121S0100000_21.run();
        } else {
            HandlerHook.viewPostDelay(this.LLIZ, aRunnableS121S0100000_21, i);
        }
    }

    @Override // X.InterfaceC460010I2d
    public final void Qu(Emoji emoji) {
        String uri;
        String aid;
        String authorUid;
        this.LLLJIL = emoji;
        C1348730lCZ c1348730lCZ = this.LLLLII;
        if (c1348730lCZ != null) {
            c1348730lCZ.LJJIJLIJ(emoji);
        }
        if (emoji == null || emoji.getAnimateUrl() == null) {
            uri = "";
        } else {
            uri = emoji.getAnimateUrl().getUri();
        }
        LogPbBean logPb = emoji.getLogPb();
        InterfaceC1349100lDA interfaceC1349100lDA = this.LLLIIIIL;
        if (interfaceC1349100lDA != null) {
            Aweme commentInputAweme = ((C1348730lCZ) interfaceC1349100lDA).LLILZIL.getCommentInputAweme();
            if (commentInputAweme == null) {
                aid = "";
                authorUid = "";
            } else {
                authorUid = AwemeExtKt.getAuthorUid(commentInputAweme);
                aid = commentInputAweme.getAid();
            }
            C1350920lG6.LIZ.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("emoji_type", "recommend");
            if (TextUtils.equals("recommend", "recommend")) {
                c2344009Gk.LJIIIIZZ("group_id", aid);
                c2344009Gk.LJIIIIZZ("author_id", authorUid);
                c2344009Gk.LJIIIIZZ("emoji_uri", uri);
                c2344009Gk.LIZJ(-1, "position");
                c2344009Gk.LJ(logPb, "log_pb");
            } else if (TextUtils.equals("recommend", "search")) {
                c2344009Gk.LJIIIIZZ("group_id", aid);
                c2344009Gk.LJIIIIZZ("author_id", authorUid);
                c2344009Gk.LJIIIIZZ("search_keyword", "");
                c2344009Gk.LJIIIIZZ("emoji_uri", uri);
                c2344009Gk.LIZJ(-1, "position");
                c2344009Gk.LJ(logPb, "log_pb");
            }
            C1350920lG6.LJJJ(c2344009Gk, "click_comment_emoji");
        }
        qS(true, true);
    }

    public final void WR(boolean z) {
        String string;
        if (getArguments() != null) {
            string = getArguments().getString("enterFrom");
        } else {
            string = "";
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", string);
        c2344009Gk.LJIIIIZZ("position", "comment");
        c2344009Gk.LIZJ(z ? 1 : 0, "is_fast_panel");
        C20684815ws.LJIILLIIL("show_emoji_board", c2344009Gk.LIZ);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean z;
        boolean z2;
        boolean z3;
        ZR();
        if (this.LLJJI == null) {
            return;
        }
        if (editable != null && editable.toString().trim().length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (this.LLJJI.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.LLJJI.getAlpha() == 1.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!this.LLLLLLL ? !(!z ? z3 : !z3) : !(!z ? z2 : !z2)) {
            qS(!z2, true);
        }
        this.LLLLLIL.LIZ(this.LLIZ, true, false);
        if (TextUtils.isEmpty(editable) && TextUtils.isEmpty(this.LLIZ.getHint())) {
            this.LLLLII.LJJIJL();
            this.LLIZ.setHint(this.LLLLII.LLIZLLLIL);
        }
        HandlerHook.viewPost(this.LLIZ, new ARunnableS121S0100000_21(this, 161));
    }

    public final void bS(int i) {
        ARunnableS121S0100000_21 aRunnableS121S0100000_21 = new ARunnableS121S0100000_21(this, 162);
        if (i == 0) {
            aRunnableS121S0100000_21.run();
        } else {
            HandlerHook.viewPostDelay(this.LLIZ, aRunnableS121S0100000_21, i);
        }
    }

    public final void cS(Boolean bool) {
        boolean z;
        int i = 4;
        int i2 = 0;
        if (C1341590l13.LIZIZ()) {
            boolean zMR = MR(bool);
            if (this.LLLLII.LLJJIJI == null && !this.LLLILZLLLI && this.LLLLIILL.wQ2().getValue() == null) {
                z = true;
            } else {
                z = false;
            }
            View view = this.LLJJLIIIJLLLLLLLZ;
            if (view != null) {
                if (zMR) {
                    i = 0;
                }
                C786410Ut5.LJLLLLLL(i, view);
                C1348410lC3 c1348410lC3 = this.LLLLII.LLLII;
                View view2 = this.LLJJLIIIJLLLLLLLZ;
                c1348410lC3.getClass();
                C1348410lC3.LIZJ(view2, z);
                if (zMR) {
                    this.LLLLII.LLLII.LIZIZ(this.LLJJLIIIJLLLLLLLZ);
                }
            }
        } else {
            View view3 = this.LLJJLIIIJLLLLLLLZ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(4, view3);
            }
        }
        C1350650lFf.LIZ.getClass();
        if (this.LLLLLLL) {
            LinearLayout linearLayout = this.LLJLIL;
            if (!bool.booleanValue() || !C1341590l13.LIZIZ() || this.LLJJLIIIJLLLLLLLZ.getVisibility() != 0) {
                i2 = 8;
            }
            C786410Ut5.LJZL(i2, linearLayout);
        }
    }

    @Override // X.C0I04
    public final void g7(C454060HrI c454060HrI) {
        hS(C454000HrC.LIZLLL(c454060HrI));
        bS(0);
        NR();
    }

    public final void hS(CommentStickerStruct commentStickerStruct) {
        String strLJI;
        if (!this.LLILLJJLI || !CommentWithStickerExp.LIZIZ()) {
            return;
        }
        if (commentStickerStruct != null && (strLJI = C454000HrC.LJI(commentStickerStruct)) != null && !strLJI.isEmpty()) {
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(strLJI);
            c1331670kl3LJIIIZ.LJJI(this.LLIZLLLIL);
            c1331670kl3LJIIIZ.LJIL = Bitmap.Config.ARGB_8888;
            c1331670kl3LJIIIZ.LIZLLL = true;
            c1331670kl3LJIIIZ.LJIIJJI();
            C786410Ut5.LLFF(0, this.LLIZLLLIL);
            C786410Ut5.LJZ(0, this.LLJ);
            this.LLLLLLZZ = true;
            this.LLLLLLZ = false;
        } else {
            this.LLIZLLLIL.setImageDrawable(null);
            C786410Ut5.LLFF(8, this.LLIZLLLIL);
            C786410Ut5.LJZ(8, this.LLJ);
            this.LLLLLLZZ = false;
        }
        if (!this.LLLLLLZZ && !this.LLLLII.LLLII.LIZJ) {
            C786410Ut5.x5(this.LLJJIII, 1.0f);
            this.LLJJIII.setClickable(true);
        } else {
            C786410Ut5.x5(this.LLJJIII, 0.34f);
            this.LLJJIII.setClickable(false);
        }
        C1348730lCZ c1348730lCZ = this.LLLLII;
        c1348730lCZ.LLJJIJI = null;
        c1348730lCZ.LLJJIJIIJIL = commentStickerStruct;
        c1348730lCZ.LJJIJL();
        this.LLIZ.setHint(this.LLLLII.LLIZLLLIL);
        rS(Boolean.valueOf(this.LLLLLLZZ));
        qS(false, true);
        cS(Boolean.valueOf(this.LLZLI));
    }

    public final void iS(boolean z) {
        if (z) {
            if (C294400BgM.LIZ() && !this.LLLLLLL && Bc2()) {
                this.LLJJL.LJIIJ(false);
                return;
            } else {
                this.LLJJL.LJIIJ(true);
                return;
            }
        }
        this.LLJJL.LJIIJ(false);
    }

    public final void kS(boolean z) {
        if (z) {
            if (this.LLZIL) {
                this.LLZIL = false;
                C1350920lG6.LJIILL(this.LLLIZZ, this.LLLJ, true);
                return;
            }
            return;
        }
        if (!this.LLZILL) {
            return;
        }
        this.LLZILL = false;
        C1350920lG6.LJIILL(this.LLLIZZ, this.LLLJ, false);
    }

    @Override // X.C0I04
    public final void lc(C454010HrD c454010HrD) {
        hS(C454000HrC.LJIIIZ(c454010HrD));
        bS(150);
        NR();
    }

    public final void mS(boolean z) {
        if (z) {
            if (this.LLLZZIL) {
                this.LLLZZIL = false;
                C1350920lG6.LJIILLIIL(this.LLLIZZ, this.LLLJ, true);
                return;
            }
            return;
        }
        if (!this.LLZ) {
            return;
        }
        this.LLZ = false;
        C1350920lG6.LJIILLIIL(this.LLLIZZ, this.LLLJ, false);
    }

    public final void nS(boolean z) {
        int i;
        C1351440lGw c1351440lGw;
        C459990I2b c459990I2b = this.LLZL;
        int i2 = 0;
        if (c459990I2b != null && !this.LLLLLLL) {
            c459990I2b.LIZLLL(z, false);
        } else {
            TuxIconView tuxIconView = this.LLJJ;
            if (z) {
                i = R.raw.icon_keyboard_circle;
            } else {
                i = R.raw.icon_emoji;
            }
            tuxIconView.setIconRes(i);
        }
        C1348800lCg c1348800lCg = this.LLJJJJJIL;
        if (c1348800lCg != null) {
            if (!z) {
                i2 = 8;
            }
            c1348800lCg.LIZ(i2);
        }
        if ((z || this.LLLILZLLLI) && (c1351440lGw = this.LLJJL) != null) {
            c1351440lGw.LJII(!C294400BgM.LIZ());
        } else if (this.LLJJL != null) {
            iS(true);
        }
        WR(!z);
    }

    public final void oS(boolean z) {
        int i = 8;
        if (z) {
            this.LLJJIII.LIZ();
            this.LLJJIII.setIconRes(R.raw.icon_color_gift);
            C1348790lCf c1348790lCf = this.LLLLZLLIL;
            if (c1348790lCf != null) {
                C1548820qPI.LIZLLL("wallet_exchange_status", c1348790lCf.LJIIJ);
            }
        } else {
            if (UR()) {
                this.LLJJIII.setIconRes(R.raw.icon_gift);
                this.LLJJIII.setTintColorRes(R.attr.a1h);
                if (!this.LLLLII.LLLII.LIZJ && !this.LLLLLLZZ) {
                    C786410Ut5.x5(this.LLJJIII, 1.0f);
                }
            } else {
                C786410Ut5.LLLLLLZZ(this.LLJJIII, 8);
            }
            C1348790lCf c1348790lCf2 = this.LLLLZLLIL;
            if (c1348790lCf2 != null) {
                C1548820qPI.LJIIIIZZ("wallet_exchange_status", c1348790lCf2.LJIIJ);
            }
        }
        if (!C1350950lG9.LIZIZ.LIZLLL()) {
            C786410Ut5.LLLLLLZZ(this.LLJJIII, 8);
        }
        ViewGroup viewGroup = this.LLL;
        boolean z2 = false;
        if (z) {
            i = 0;
        }
        C786410Ut5.LJLZ(i, viewGroup);
        View view = this.LLJLLIL;
        if (view != null) {
            C786410Ut5.LJLLLLLL(0, view);
        }
        C786410Ut5.LJLLLLLL(0, this.LLJLLL);
        cS(Boolean.valueOf(this.LLZLI));
        C459990I2b c459990I2b = this.LLZL;
        if (c459990I2b != null) {
            if (this.LLLLIILL.wQ2().getValue() == null) {
                z2 = true;
            }
            c459990I2b.LIZJ(z2);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) throws Throwable {
        int i;
        boolean z;
        int i2;
        View view;
        int i3;
        boolean z2;
        QuickMentionVM quickMentionVM;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        UrlModel animateUrl;
        int[] iArr;
        int i4;
        int i5;
        final KeyboardDialogFragment keyboardDialogFragment = this;
        super.onActivityCreated(bundle);
        if (keyboardDialogFragment.getContext() == null) {
            C844470XAv.LIZ.getClass();
            C844470XAv.LIZ();
        }
        keyboardDialogFragment.LLIZ.addTextChangedListener(new C1402120mag(keyboardDialogFragment, 3));
        C1353500lKG c1353500lKG = keyboardDialogFragment.LLIZ;
        c1353500lKG.setHighlightColor(C1351950lHl.LJ(R.attr.br, R.color.aj, c1353500lKG.getContext()));
        keyboardDialogFragment.getDialog().getWindow().setLayout(-1, -1);
        keyboardDialogFragment.getDialog().setOnShowListener(keyboardDialogFragment);
        keyboardDialogFragment.bS(0);
        C786410Ut5.I7(new ACListenerS155S0100000_21(keyboardDialogFragment, 291), keyboardDialogFragment.LLJJI);
        C786410Ut5.a9(keyboardDialogFragment.LLJIJIL, new ACListenerS155S0100000_21(keyboardDialogFragment, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
        C786410Ut5.Q7(keyboardDialogFragment.LLILZ, new ACListenerS155S0100000_21(keyboardDialogFragment, 295));
        C786410Ut5.a9(keyboardDialogFragment.LLJILJIL, new ACListenerS155S0100000_21(keyboardDialogFragment, 296));
        C786410Ut5.a9(keyboardDialogFragment.LLJJ, new ACListenerS155S0100000_21(keyboardDialogFragment, 297));
        C1350650lFf.LIZ.getClass();
        if (C1350650lFf.LIZIZ()) {
            C786410Ut5.a9(keyboardDialogFragment.LLJILJILJ, new ACListenerS155S0100000_21(keyboardDialogFragment, 298));
            C786410Ut5.Q8(keyboardDialogFragment.LLIZLLLIL, new ACListenerS155S0100000_21(keyboardDialogFragment, 299));
        }
        if (C1350650lFf.LIZIZ() || CommentWithStickerExp.LIZIZ()) {
            C786410Ut5.O7(keyboardDialogFragment.LLJ, new ACListenerS155S0100000_21(keyboardDialogFragment, 301));
        }
        if (C1347740lAy.LIZ(keyboardDialogFragment.LLLIZZ, keyboardDialogFragment.LLLLLLL)) {
            C786410Ut5.LLLLLLZZ(keyboardDialogFragment.LLJILJILJ, 0);
        } else {
            C786410Ut5.LLLLLLZZ(keyboardDialogFragment.LLJILJILJ, 8);
        }
        C1341780l1M c1341780l1M = C1341780l1M.LIZ;
        TuxIconView tuxIconView = keyboardDialogFragment.LLJIJIL;
        EnumC1341650l19 enumC1341650l19 = EnumC1341650l19.ALPHA_BUTTON;
        c1341780l1M.LIZ(tuxIconView, enumC1341650l19);
        c1341780l1M.LIZ(keyboardDialogFragment.LLJJ, enumC1341650l19);
        c1341780l1M.LIZ(keyboardDialogFragment.LLJILJIL, enumC1341650l19);
        c1341780l1M.LIZ(keyboardDialogFragment.LLJILJILJ, enumC1341650l19);
        View view2 = keyboardDialogFragment.LLJJI;
        EnumC1341650l19 enumC1341650l192 = EnumC1341650l19.BUTTON;
        c1341780l1M.LIZ(view2, enumC1341650l192);
        c1341780l1M.LIZ(keyboardDialogFragment.LLILZ, enumC1341650l192);
        C459990I2b c459990I2b = keyboardDialogFragment.LLZL;
        if (c459990I2b != null && !keyboardDialogFragment.LLLLLLL) {
            c459990I2b.LIZLLL(keyboardDialogFragment.LLLILZJ, false);
        } else {
            TuxIconView tuxIconView2 = keyboardDialogFragment.LLJJ;
            if (keyboardDialogFragment.LLLILZJ) {
                i = R.raw.icon_keyboard_circle;
            } else {
                i = R.raw.icon_emoji;
            }
            tuxIconView2.setIconRes(i);
        }
        C1348800lCg c1348800lCg = new C1348800lCg(keyboardDialogFragment.LLJJJJ);
        keyboardDialogFragment.LLJJJJJIL = c1348800lCg;
        c1348800lCg.LIZIZ = new C1348980lCy(keyboardDialogFragment);
        keyboardDialogFragment.LLIZ.setMentionTextColor(C1351950lHl.LJ(R.attr.ba, 0, keyboardDialogFragment.LLIZ.getContext()));
        keyboardDialogFragment.LLIZ.setMentionTextTypeface(1);
        C786410Ut5.L9(keyboardDialogFragment.LLIZ, new ACListenerS155S0100000_21(keyboardDialogFragment, 302));
        C1348840lCk c1348840lCk = keyboardDialogFragment.LLJLILLLLZIIL;
        View.OnClickListener aCListenerS155S0100000_21 = new ACListenerS155S0100000_21(keyboardDialogFragment, 303);
        if (C1848410yCV.LIZ) {
            aCListenerS155S0100000_21 = new f(aCListenerS155S0100000_21);
        }
        a aVar = new a(aCListenerS155S0100000_21);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1348840lCk);
        }
        c1348840lCk.setOnClickListener(aVar);
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0lD6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
            }
        }, keyboardDialogFragment.LLJLILLLLZIIL.findViewById(R.id.eqx));
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0lD6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
            }
        }, keyboardDialogFragment.LLJLILLLLZIIL.findViewById(R.id.iyx));
        C786410Ut5.I7(new ACListenerS155S0100000_21(keyboardDialogFragment, 294), keyboardDialogFragment.LLJJJIL);
        if (keyboardDialogFragment.getArguments() != null && keyboardDialogFragment.getArguments().getBoolean("hideGiftIcon", false)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            TuxIconView tuxIconView3 = keyboardDialogFragment.LLJJIII;
            if (keyboardDialogFragment.LLLLLJIL.LIZ(keyboardDialogFragment.LLLIZZ) && !keyboardDialogFragment.LLLLLLL) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView3, i4);
            if (keyboardDialogFragment.LLLLLJIL.LIZ(keyboardDialogFragment.LLLIZZ) && keyboardDialogFragment.UR() && C1350950lG9.LIZIZ.LIZLLL() && keyboardDialogFragment.LLLLIILL != null && keyboardDialogFragment.LLLIZZ != null) {
                boolean zLJI = MethodIDManager.LJI(202320);
                if (keyboardDialogFragment.LLL == null) {
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                } else {
                    Aweme aweme = keyboardDialogFragment.LLLIZZ;
                    if (aweme != null) {
                        aweme.getGroupId();
                    }
                    Aweme aweme2 = keyboardDialogFragment.LLLIZZ;
                    if (aweme2 != null) {
                        AwemeExtKt.getAuthorUid(aweme2);
                    }
                    if (keyboardDialogFragment.getArguments() != null) {
                        keyboardDialogFragment.getArguments().getString("enterFrom");
                    }
                    if (keyboardDialogFragment.getActivity() != null && keyboardDialogFragment.LLLIZZ != null && keyboardDialogFragment.LLLLIILL != null) {
                        ViewGroup viewGroup = keyboardDialogFragment.LLL;
                        C19EG activity = keyboardDialogFragment.getActivity();
                        GiftViewModel giftViewModel = keyboardDialogFragment.LLLLIILL;
                        C1348810lCh c1348810lCh = keyboardDialogFragment.LLLLJ;
                        keyboardDialogFragment = keyboardDialogFragment;
                        C1348790lCf c1348790lCf = new C1348790lCf(keyboardDialogFragment, viewGroup, activity, giftViewModel, c1348810lCh);
                        keyboardDialogFragment.LLLLZLLIL = c1348790lCf;
                        View view3 = c1348790lCf.LJI;
                        if (view3 != null) {
                            keyboardDialogFragment.LLL.addView(view3, 0);
                            ViewGroup viewGroup2 = keyboardDialogFragment.LLL;
                            if (keyboardDialogFragment.LLLILZLLLI) {
                                i5 = 0;
                            } else {
                                i5 = 8;
                            }
                            C786410Ut5.LJLZ(i5, viewGroup2);
                        }
                    }
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                }
                keyboardDialogFragment.LLLLIILL.PF2(keyboardDialogFragment.LLLIZZ.getAid(), AwemeExtKt.getAuthorUid(keyboardDialogFragment.LLLIZZ));
                C1341720l1G c1341720l1G = keyboardDialogFragment.LLLF;
                if (c1341720l1G != null) {
                    c1341720l1G.LIZ(keyboardDialogFragment.LLLLIILL, keyboardDialogFragment.getActivity());
                }
                keyboardDialogFragment.LLLLIILL.vQ2().observe(keyboardDialogFragment.getActivity(), new Observer() { // from class: X.0lD7
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                    }
                });
                keyboardDialogFragment.LLLLIILL.wQ2().observe(keyboardDialogFragment.getViewLifecycleOwner(), new AObserverS224S0100000_21(keyboardDialogFragment, 114));
            } else {
                if ((!keyboardDialogFragment.LLLLLJIL.LIZ(keyboardDialogFragment.LLLIZZ) || !keyboardDialogFragment.UR() || !C1350950lG9.LIZIZ.LIZLLL()) && keyboardDialogFragment.LLLLIILL != null) {
                    C786410Ut5.LLLLLLZZ(keyboardDialogFragment.LLJJIII, 8);
                }
                GiftViewModel giftViewModel2 = keyboardDialogFragment.LLLLIILL;
                if (giftViewModel2 != null && giftViewModel2.wQ2().getValue() != null) {
                    keyboardDialogFragment.LLLLIILL.wQ2().setValue(null);
                }
            }
            keyboardDialogFragment.oS(keyboardDialogFragment.LLLILZLLLI);
            if (C1350950lG9.LIZIZ.LIZLLL() && keyboardDialogFragment.UR()) {
                C786410Ut5.a9(keyboardDialogFragment.LLJJIII, new ACListenerS155S0100000_21(keyboardDialogFragment, 290));
            } else {
                C786410Ut5.LLLLLLZZ(keyboardDialogFragment.LLJJIII, 8);
            }
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getAvatarThumb()));
        c1331670kl3LJIIIIZZ.LJJ(keyboardDialogFragment.LLILZLL);
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        C786410Ut5.LLLLJI(keyboardDialogFragment.LLILZLL, 0);
        if (keyboardDialogFragment.getArguments().getBoolean("arg_require_gray_background")) {
            C786410Ut5.LJLLLLLL(0, keyboardDialogFragment.LLLLLL);
            C786410Ut5.Pd(ObjectAnimator.ofFloat(keyboardDialogFragment.LLLLLL, "alpha", 0.0f, 1.0f));
        }
        WindowManager.LayoutParams attributes = keyboardDialogFragment.getDialog().getWindow().getAttributes();
        if (attributes != null && (attributes.softInputMode & 3) != 0) {
            C786410Ut5.Pd(ObjectAnimator.ofFloat(keyboardDialogFragment.LLJLILLLLZIIL, "translationY", C12ES.LJIIIIZZ(keyboardDialogFragment.LLJLILLLLZIIL.getContext()), 0.0f));
        }
        Bundle arguments = keyboardDialogFragment.getArguments();
        if (arguments != null) {
            keyboardDialogFragment.LLLJ = arguments.getString("enterFrom", "");
            keyboardDialogFragment.LLLL = arguments.getBoolean("clickAt");
            int i6 = arguments.getInt("maxLength");
            keyboardDialogFragment.LLLILZ = i6;
            if (i6 > 0 && keyboardDialogFragment.LLIZ != null) {
                C1349180lDI c1349180lDI = new C1349180lDI(i6);
                c1349180lDI.LLILLJJLI = C460020I2e.LIZ.getResources().getString(2131828516);
                c1349180lDI.LLILLL = keyboardDialogFragment;
                InputFilter[] filters = keyboardDialogFragment.LLIZ.getFilters();
                if (filters == null) {
                    keyboardDialogFragment.LLIZ.setFilters(new InputFilter[]{c1349180lDI});
                } else {
                    InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
                    inputFilterArr[filters.length] = c1349180lDI;
                    keyboardDialogFragment.LLIZ.setFilters(inputFilterArr);
                }
            }
            Emoji emoji = keyboardDialogFragment.LLLJIL;
            if (emoji != null && (animateUrl = emoji.getAnimateUrl()) != null) {
                C786410Ut5.LJLLLLLL(0, keyboardDialogFragment.LLJJIJIL);
                C786410Ut5.LJLLLLLL(0, keyboardDialogFragment.LLJJJIL);
                C844470XAv.LIZ.getClass();
                int iLIZJ = (int) C12ES.LIZJ(60.0f, C844470XAv.LIZ());
                if (emoji.getWidth() != 0 && emoji.getHeight() != 0) {
                    iArr = new int[]{Math.min((emoji.getWidth() / emoji.getHeight()) * iLIZJ, (int) C12ES.LIZJ(107.0f, C844470XAv.LIZ())), iLIZJ};
                } else {
                    iArr = new int[]{iLIZJ, iLIZJ};
                }
                keyboardDialogFragment.LLJJIJIL.getLayoutParams().width = iArr[0];
                keyboardDialogFragment.LLJJIJIL.requestLayout();
                C1324840ka2.LJI(keyboardDialogFragment.LLJJJ, animateUrl, iArr[0], iArr[1], null);
            }
            CharSequence charSequence = arguments.getCharSequence("hint");
            if (charSequence != null) {
                keyboardDialogFragment.LLIZ.setHint(charSequence);
                keyboardDialogFragment.LLIZ.setMaxLines(1);
                keyboardDialogFragment.LLIZ.setEllipsize(TextUtils.TruncateAt.END);
            }
            CharSequence charSequence2 = arguments.getCharSequence("defaultContent");
            if (!TextUtils.isEmpty(charSequence2)) {
                keyboardDialogFragment.LLIZ.setText(charSequence2);
            }
            if (arguments.getInt("publishScenario") == 9) {
                keyboardDialogFragment.LLIZ.setText(keyboardDialogFragment.LLLLII.LL);
            }
            User user = (User) arguments.getSerializable("user");
            if (user != null) {
                if (!Objects.equals(user.getUid(), keyboardDialogFragment.LLLLII.LLILLJJLI)) {
                    keyboardDialogFragment.LLIZ.setText("");
                    C1348730lCZ c1348730lCZ = keyboardDialogFragment.LLLLII;
                    c1348730lCZ.LLJJIJI = null;
                    c1348730lCZ.LLJJIJIIJIL = null;
                    c1348730lCZ.LJJII(keyboardDialogFragment.LLIZ);
                }
                keyboardDialogFragment.LLIZ.setHint(keyboardDialogFragment.getString(2131835456, C1342220l24.LJ(user, keyboardDialogFragment.LLLIILIL, true, true)));
                InterfaceC1349150lDF interfaceC1349150lDF = keyboardDialogFragment.LLLIIII;
                if (interfaceC1349150lDF != null) {
                    CharSequence hint = keyboardDialogFragment.LLIZ.getHint();
                    C1353500lKG c1353500lKG2 = ((C1348730lCZ) interfaceC1349150lDF).LLILLL;
                    if (c1353500lKG2 != null) {
                        c1353500lKG2.setHint(hint);
                    }
                }
            }
            keyboardDialogFragment.LLIZ.addTextChangedListener(keyboardDialogFragment);
            C1348730lCZ c1348730lCZ2 = keyboardDialogFragment.LLLLII;
            if (c1348730lCZ2 != null) {
                if (c1348730lCZ2.LLJJIJI != null) {
                    keyboardDialogFragment.xk0(c1348730lCZ2.LLJJIJI);
                } else if (c1348730lCZ2.LLJJIJIIJIL != null) {
                    keyboardDialogFragment.hS(c1348730lCZ2.LLJJIJIIJIL);
                } else {
                    keyboardDialogFragment.xk0(null);
                    keyboardDialogFragment.hS(null);
                }
            }
            HashSet<User> hashSet = (HashSet) arguments.getSerializable("atUserSet");
            if (hashSet != null) {
                for (User user2 : hashSet) {
                    keyboardDialogFragment.LLIZ.LJIIIIZZ(0, C10EU.LIZJ(user2), user2.getUid(), user2.getSecUid());
                }
            }
            User user3 = (User) arguments.getSerializable("atUser");
            if (user3 != null) {
                keyboardDialogFragment.LLIZ.LJIIIIZZ(0, C10EU.LIZJ(user3), user3.getUid(), user3.getSecUid());
            }
            keyboardDialogFragment.qS(false, false);
            boolean z3 = arguments.getBoolean("showAt");
            if (keyboardDialogFragment.LLLLLLL) {
                C786410Ut5.LLLLLLZZ(keyboardDialogFragment.LLJIJIL, 8);
            } else {
                TuxIconView tuxIconView4 = keyboardDialogFragment.LLJIJIL;
                if (z3) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                C786410Ut5.LLLLLLZZ(tuxIconView4, i2);
            }
            C786410Ut5.x5(keyboardDialogFragment.LLJIJIL, 1.0f);
            arguments.getInt("viewType");
            keyboardDialogFragment.LLLIILIL = arguments.getString("arg_event_type");
            keyboardDialogFragment.LLLLLLLLLL = keyboardDialogFragment.LLLLLLL;
            if (CommentWithStickerExp.LIZIZ() && !keyboardDialogFragment.LLLLLLLLLL) {
                String str = keyboardDialogFragment.LLLJ;
                boolean z4 = keyboardDialogFragment.LLLLLLL;
                KeyboardDialogFragment keyboardDialogFragment2 = keyboardDialogFragment;
                keyboardDialogFragment = keyboardDialogFragment;
                C723850SaN.LIZ(keyboardDialogFragment, false, null, new AwS0S1311000_6(keyboardDialogFragment2, keyboardDialogFragment, str, AFwS209S0000000_21.get$arr$(562), z4, 0), 3);
            } else if (keyboardDialogFragment.LLLLLLLLLL) {
                EmojiInputViewImplV2 emojiInputViewImplV2 = new EmojiInputViewImplV2(keyboardDialogFragment.LLIZ, keyboardDialogFragment.LLLILZ, keyboardDialogFragment);
                LinearLayout linearLayout = keyboardDialogFragment.LLJJJJ;
                int iLIZJ2 = C1349270lDR.LJI;
                if (iLIZJ2 <= 0) {
                    iLIZJ2 = C1349270lDR.LIZJ(true);
                }
                keyboardDialogFragment.LLJJJJ.addView(C449560Hk2.LIZ(emojiInputViewImplV2, linearLayout, keyboardDialogFragment, iLIZJ2).LL);
            } else if (keyboardDialogFragment.LLJJJJ != null) {
                if (keyboardDialogFragment.LLLIIL == null) {
                    keyboardDialogFragment.LLLIIL = new C460000I2c(keyboardDialogFragment.LLIZ, keyboardDialogFragment.LLLILZ, keyboardDialogFragment, null);
                }
                C460000I2c c460000I2c = keyboardDialogFragment.LLLIIL;
                LinearLayout linearLayout2 = keyboardDialogFragment.LLJJJJ;
                C451450Hn5.LIZ();
                keyboardDialogFragment.LLLII = C449480Hju.LIZ(c460000I2c, linearLayout2, C451440Hn4.LIZ(2));
                if (C294400BgM.LIZ() && keyboardDialogFragment.getContext() != null) {
                    try {
                        int dimension = (int) keyboardDialogFragment.getContext().getResources().getDimension(R.dimen.x3);
                        C449460Hjs c449460Hjs = keyboardDialogFragment.LLLII;
                        if (c449460Hjs != null && (view = c449460Hjs.LL) != null) {
                            view.getLayoutParams().height = dimension;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                keyboardDialogFragment.LLJJJJ.addView(keyboardDialogFragment.LLLII.LL);
            }
            C1348800lCg c1348800lCg2 = keyboardDialogFragment.LLJJJJJIL;
            if (keyboardDialogFragment.LLLILZJ) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            c1348800lCg2.LIZ(i3);
            if (keyboardDialogFragment.LLLILZJ) {
                keyboardDialogFragment.WR(false);
            }
            C1346810l9T c1346810l9T = keyboardDialogFragment.LLLLLIL;
            if (c1346810l9T.LJ) {
                SmartImageView smartImageView = c1346810l9T.LJIIJJI;
                if (smartImageView != null) {
                    C786410Ut5.LLFF(8, smartImageView);
                }
                View view4 = c1346810l9T.LJIILJJIL;
                ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    if (marginLayoutParams != null) {
                        marginLayoutParams.setMarginStart(C0HD5.LIZ(view4, 12));
                    }
                } else {
                    marginLayoutParams = null;
                }
                C786410Ut5.W5(view4, marginLayoutParams);
            }
            if (keyboardDialogFragment.LLLLIIIILLL != CommentVideoModel.Type.NONE) {
                C1350650lFf.LIZ.getClass();
                if (C1350650lFf.LIZ()) {
                    C786410Ut5.LLLLLLZZ(keyboardDialogFragment.LLJILJIL, 0);
                } else {
                    C786410Ut5.LLLLJI(keyboardDialogFragment.LLILZLL, 8);
                    C786410Ut5.LJZI(0, keyboardDialogFragment.LLILZ);
                    C1346810l9T c1346810l9T2 = keyboardDialogFragment.LLLLLIL;
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) c1346810l9T2.LJIILJJIL.getLayoutParams();
                    marginLayoutParams2.setMarginStart(C0HD5.LIZ(c1346810l9T2.LJIILJJIL, 58));
                    C786410Ut5.W5(c1346810l9T2.LJIILJJIL, marginLayoutParams2);
                }
            } else {
                C786410Ut5.LJZI(8, keyboardDialogFragment.LLILZ);
                C1350650lFf.LIZ.getClass();
                if (C1350650lFf.LIZ()) {
                    C786410Ut5.LLLLLLZZ(keyboardDialogFragment.LLJILJIL, 8);
                }
            }
            keyboardDialogFragment.LLLLLILLIL = arguments.getInt("publishScenario");
            C1351440lGw c1351440lGw = keyboardDialogFragment.LLJJL;
            if (c1351440lGw != null) {
                c1351440lGw.setMEnterFrom(keyboardDialogFragment.LLLJ);
                keyboardDialogFragment.LLJJL.setPublishScenario(keyboardDialogFragment.LLLLLILLIL);
                if (C2279851ELn.LIZIZ() && (quickMentionVM = keyboardDialogFragment.LLLLLLJ) != null && keyboardDialogFragment.LLJJL != null && quickMentionVM.getState().LL == EnumC1347820lB6.HIDE) {
                    keyboardDialogFragment.LLJJL.LJIILIIL(keyboardDialogFragment.LLLIZZ, null);
                }
                keyboardDialogFragment.LLJJL.LIZJ(keyboardDialogFragment.LLJJJJLIIL, keyboardDialogFragment.LLIZ, keyboardDialogFragment.LLLILZ, keyboardDialogFragment, keyboardDialogFragment, null, keyboardDialogFragment, keyboardDialogFragment.LLLIZZ, true, null);
                if (C294400BgM.LIZ()) {
                    C1351440lGw c1351440lGw2 = keyboardDialogFragment.LLJJL;
                    int i7 = C1351440lGw.LLJJJJLIIL;
                    int i8 = C1351440lGw.LLJJL;
                    c1351440lGw2.setOriginalHeight(i7 + i8);
                    keyboardDialogFragment.LLJJL.setPadding(0, 0, 0, i8);
                }
                if (!keyboardDialogFragment.LLLILZLLLI && !keyboardDialogFragment.LLLILZJ) {
                    keyboardDialogFragment.iS(false);
                } else {
                    keyboardDialogFragment.LLJJL.LJII(false);
                }
            }
            if (C1341590l13.LIZIZ()) {
                keyboardDialogFragment.LLLLII.LLLII.LIZ(keyboardDialogFragment.LLJJLIIIJLLLLLLLZ, keyboardDialogFragment.LLLIZZ.getAid(), new InterfaceC1348430lC5() { // from class: X.0lCo
                    @Override // X.InterfaceC1348430lC5
                    public final void LIZ(boolean z5) {
                        float f;
                        boolean z6;
                        KeyboardDialogFragment keyboardDialogFragment3 = this.LIZ;
                        keyboardDialogFragment3.getClass();
                        float f2 = 1.0f;
                        if (!z5 && !keyboardDialogFragment3.LLLLLLZZ) {
                            f = 1.0f;
                        } else {
                            f = 0.34f;
                            if (z5) {
                                f2 = 0.34f;
                            }
                        }
                        C786410Ut5.x5(keyboardDialogFragment3.LLJJIII, f);
                        TuxIconView tuxIconView5 = keyboardDialogFragment3.LLJJIII;
                        if (!z5 && !keyboardDialogFragment3.LLLLLLZZ) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        tuxIconView5.setClickable(z6);
                        C786410Ut5.x5(keyboardDialogFragment3.LLJILJILJ, f2);
                        keyboardDialogFragment3.LLJILJILJ.setClickable(!z5);
                    }
                });
            }
            keyboardDialogFragment.cS(Boolean.valueOf(keyboardDialogFragment.LLZLI));
            C459990I2b c459990I2b2 = keyboardDialogFragment.LLZL;
            if (c459990I2b2 != null) {
                if (keyboardDialogFragment.LLLLIILL.wQ2().getValue() == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                c459990I2b2.LIZJ(z2);
            }
        }
        if (!keyboardDialogFragment.LLLLLLL) {
            keyboardDialogFragment.LLLLLIL.LIZLLL(C418440Gaw.LIZ(22));
        }
        keyboardDialogFragment.LLLLLIL.LJFF();
        keyboardDialogFragment.LLLLLIL.LJ();
        keyboardDialogFragment.LLLLLIL.LIZIZ(false);
        HandlerHook.viewPost(keyboardDialogFragment.LLIZ, new ARunnableS121S0100000_21(keyboardDialogFragment, 161));
        C1348730lCZ c1348730lCZ3 = keyboardDialogFragment.LLLLII;
        if (c1348730lCZ3 != null) {
            C1353500lKG c1353500lKG3 = keyboardDialogFragment.LLIZ;
            if (c1348730lCZ3.LLLIIIL) {
                c1348730lCZ3.LLLIIIL = false;
                String str2 = C20642515q3.LJI(2131829121) + " ";
                String str3 = C20642515q3.LJI(2131829123) + " ";
                if (c1353500lKG3 != null) {
                    if (C2204961BRm.LLLZZIL(c1353500lKG3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null)) != null && C2204961BRm.LLLZZIL(c1353500lKG3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null)).toString().startsWith(str2)) {
                        c1353500lKG3.setText(C2204961BRm.LLLZZIL(c1353500lKG3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null)).replace(0, str2.length(), ""));
                    }
                    if (C2204961BRm.LLLZZIL(c1353500lKG3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null)) != null && C2204961BRm.LLLZZIL(c1353500lKG3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null)).toString().startsWith(str3)) {
                        c1353500lKG3.setText(C2204961BRm.LLLZZIL(c1353500lKG3, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0vWOInFHVIUr2aG5TVQAk1XVz4w==", null)).replace(0, str3.length(), ""));
                    }
                }
            }
        }
        if (bundle != null) {
            try {
                super.dismiss();
            } catch (IllegalStateException e2) {
                TryCatchGuardChecker.doCheck(e2);
                super.dismissAllowingStateLoss();
            }
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C19EG) {
            this.LLLLLLIL = C1388190mED.LIZIZ(context);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1348840lCk c1348840lCk = this.LLJLILLLLZIIL;
        if (c1348840lCk != null) {
            int i = configuration.orientation;
            boolean zLJII = C19252910Tv.LIZIZ.LIZLLL().block().LJII();
            c1348840lCk.getClass();
            if (C815020Vy8.LIZJ()) {
                c1348840lCk.LLILLJJLI++;
            }
            if (zLJII && i != c1348840lCk.LLILZ) {
                c1348840lCk.LLILZ = i;
                c1348840lCk.LLILZIL = System.nanoTime() / 1000000;
                c1348840lCk.LLILZLL = true;
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT < 24) {
            setStyle(0, R.style.a_i);
        } else {
            setStyle(1, R.style.a_i);
        }
        if (getArguments() != null) {
            this.LLLLLLL = getArguments().getBoolean("isLandscapeMode");
        }
        GiftViewModel giftViewModel = this.LLLLIILL;
        if (giftViewModel != null) {
            giftViewModel.vQ2().setValue(Long.MIN_VALUE);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        int i;
        String str;
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Window window = dialogOnCreateDialog.getWindow();
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.getBoolean("showEmojiPanel")) {
                this.LLLILZJ = true;
                this.LLZLL = false;
            } else {
                if (arguments.getBoolean("showGiftPanel")) {
                    this.LLLILZLLLI = true;
                    this.LLZLL = false;
                }
                i = 20;
            }
            i = 19;
        } else {
            i = 20;
        }
        if (window != null) {
            window.setSoftInputMode(i);
            window.setGravity(80);
        }
        dialogOnCreateDialog.setCanceledOnTouchOutside(false);
        dialogOnCreateDialog.setCancelable(true);
        if (Build.VERSION.SDK_INT < 24) {
            dialogOnCreateDialog.requestWindowFeature(1);
        }
        if (this.LLLILZLLLI) {
            str = "100006";
        } else {
            str = "100002";
        }
        C1391850mK7.LIZIZ(dialogOnCreateDialog, str);
        Window window2 = dialogOnCreateDialog.getWindow();
        if (window2 != null && (decorView = window2.getDecorView()) != null) {
            decorView.setTag(R.id.yzv, this);
        }
        C1389600mGU.LIZJ(dialogOnCreateDialog);
        return dialogOnCreateDialog;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        List<CommentImageModel> list;
        C1350650lFf.LIZ.getClass();
        if ((C1350650lFf.LIZIZ() && (list = this.LLLLII.LLJJIJI) != null && list.size() > 0) || (CommentWithStickerExp.LIZIZ() && this.LLLLII.LLJJIJIIJIL != null)) {
            C1348730lCZ c1348730lCZ = this.LLLLII;
            c1348730lCZ.LLLI = true;
            c1348730lCZ.LJJIJL();
            this.LLIZ.setHint(this.LLLLII.LLIZLLLIL);
        }
        InterfaceC1349200lDK interfaceC1349200lDK = this.LLLIIIL;
        if (interfaceC1349200lDK != null) {
            C1347310lAH c1347310lAHRR = RR();
            C1348730lCZ c1348730lCZ2 = (C1348730lCZ) interfaceC1349200lDK;
            c1348730lCZ2.LLLI = true;
            c1348730lCZ2.LLILZIL.onCommentInputKeyboardShow(c1348730lCZ2.LLJI, c1348730lCZ2.LLJIJIL, c1347310lAHRR);
            c1348730lCZ2.LLJI = false;
            c1348730lCZ2.LLJIJIL = "";
        }
    }

    public final void rS(Boolean bool) {
        if (!this.LLLLLLL) {
            Zf0();
            return;
        }
        if (bool.booleanValue()) {
            C1353500lKG c1353500lKG = this.LLIZ;
            ViewGroup.LayoutParams layoutParams = c1353500lKG.getLayoutParams();
            if (layoutParams instanceof C19ME) {
                C19ME c19me = (C19ME) layoutParams;
                c19me.endToStart = -1;
                c19me.endToEnd = this.LLJJI.getId();
                c19me.setMarginEnd(C418440Gaw.LIZ(14));
            }
            C786410Ut5.h7(c1353500lKG, layoutParams);
        } else {
            C1353500lKG c1353500lKG2 = this.LLIZ;
            ViewGroup.LayoutParams layoutParams2 = c1353500lKG2.getLayoutParams();
            C19ME c19me2 = (C19ME) layoutParams2;
            c19me2.endToStart = this.LLJI.getId();
            c19me2.endToEnd = -1;
            c19me2.setMarginEnd(C418440Gaw.LIZ(4));
            C786410Ut5.h7(c1353500lKG2, layoutParams2);
        }
        C1353500lKG c1353500lKG3 = this.LLIZ;
        ViewGroup.LayoutParams layoutParams3 = c1353500lKG3.getLayoutParams();
        ((C19ME) layoutParams3).bottomToTop = this.LLIZLLLIL.getId();
        C786410Ut5.h7(c1353500lKG3, layoutParams3);
    }

    public final void xk0(List<CommentImageModel> list) {
        if (!this.LLILLJJLI) {
            return;
        }
        C1350650lFf.LIZ.getClass();
        if (!C1350650lFf.LIZIZ()) {
            return;
        }
        if (list != null && !list.isEmpty()) {
            this.LLIZLLLIL.setImageURI((String) ListProtector.get(((UrlModel) ListProtector.get(list, 0)).getUrlList(), 0));
            C786410Ut5.LLFF(0, this.LLIZLLLIL);
            C786410Ut5.LJZ(0, this.LLJ);
            this.LLLLLLZ = true;
            this.LLLLLLZZ = false;
        } else {
            this.LLIZLLLIL.setImageDrawable(null);
            C786410Ut5.LLFF(8, this.LLIZLLLIL);
            C786410Ut5.LJZ(8, this.LLJ);
            this.LLLLLLZ = false;
        }
        if (!this.LLLLLLZZ && !this.LLLLII.LLLII.LIZJ) {
            C786410Ut5.x5(this.LLJJIII, 1.0f);
            this.LLJJIII.setClickable(true);
        } else {
            C786410Ut5.x5(this.LLJJIII, 0.34f);
            this.LLJJIII.setClickable(false);
        }
        C1348730lCZ c1348730lCZ = this.LLLLII;
        c1348730lCZ.LLJJIJI = list;
        c1348730lCZ.LLJJIJIIJIL = null;
        c1348730lCZ.LJJIJL();
        this.LLIZ.setHint(this.LLLLII.LLIZLLLIL);
        rS(Boolean.valueOf(this.LLLLLLZ));
        qS(false, true);
        cS(Boolean.valueOf(this.LLZLI));
    }

    @Override // X.C0I04
    public final void yd(KeyEvent keyEvent) {
        this.LLZL.LIZIZ(keyEvent);
    }

    public static KeyboardDialogFragment OR(int i, String str) {
        KeyboardDialogFragment keyboardDialogFragment = new KeyboardDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("viewType", i);
        C786410Ut5.LJJJI("enterFrom", str, bundle);
        keyboardDialogFragment.setArguments(bundle);
        C1391850mK7.LIZIZ(keyboardDialogFragment, "keybord_filter");
        return keyboardDialogFragment;
    }

    public static void gS(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.setMarginStart(C418440Gaw.LIZ(Integer.valueOf(i)));
        C786410Ut5.W5(view, marginLayoutParams);
    }

    @Override // com.ss.android.ugc.aweme.common.ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) throws Throwable {
        super.onViewCreated(view, bundle);
        C1348730lCZ c1348730lCZ = this.LLLLII;
        if (c1348730lCZ != null) {
            c1348730lCZ.LJIIIIZZ(this.LLIZ);
            int iLJ = C1351950lHl.LJ(R.attr.ba, 0, getContext());
            C1348730lCZ c1348730lCZ2 = this.LLLLII;
            C1353500lKG c1353500lKG = this.LLIZ;
            c1348730lCZ2.getClass();
            if (c1353500lKG != null && !C086I.LIZIZ(c1353500lKG.getMentionExtraStructList())) {
                c1353500lKG.setMentionTextColor(iLJ);
                c1353500lKG.LJIIL();
            }
        }
        ViewOnLayoutChangeListenerC1401910maL viewOnLayoutChangeListenerC1401910maL = new ViewOnLayoutChangeListenerC1401910maL(this, 9);
        this.LLLLILI = viewOnLayoutChangeListenerC1401910maL;
        this.LLLLIL.addOnLayoutChangeListener(viewOnLayoutChangeListenerC1401910maL);
        HandlerHook.viewPost(this.LLLLIL, new ARunnableS121S0100000_21(this, 166));
        if (!C827950Wdt.LIZ) {
            C827950Wdt.LIZLLL = System.currentTimeMillis();
        }
        C1348850lCl c1348850lCl = new C1348850lCl();
        c1348850lCl.LJFF = this.LLLLLLL;
        this.LLJLILLLLZIIL.setKeyBoardObservable(c1348850lCl);
    }

    public final void qS(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        Editable editableLLLZZIL = C2204961BRm.LLLZZIL(this.LLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0i2XLulHCwPDUaow+UtSpqApMiig+1lpuvg==", null));
        if (!TextUtils.isEmpty(this.LLIZ.getHint())) {
            this.LLLLJI = this.LLIZ.getHint();
        }
        if ((editableLLLZZIL == null || editableLLLZZIL.toString().trim().length() <= 0) && this.LLLJIL == null && !this.LLLLLLZ && !this.LLLLLLZZ) {
            if ((!Bc2() || !this.LLLLLLL) && this.LLLLLLL) {
                C1346810l9T c1346810l9T = this.LLLLLIL;
                if (this.LLLLIIIILLL != CommentVideoModel.Type.NONE) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c1346810l9T.getClass();
                c1346810l9T.LJI(false, z2, z3, true, false, false, false, false);
            } else {
                C786410Ut5.T4(this.LLJJI, 0.4f);
                this.LLJJI.setEnabled(false);
                this.LLLLLIL.LIZJ(false);
                this.LLLLLIL.LIZ(this.LLIZ, true, false);
            }
            if (TextUtils.isEmpty(this.LLLLJI)) {
                this.LLLLII.LJJIJL();
                this.LLIZ.setHint(this.LLLLII.LLIZLLLIL);
                return;
            } else {
                this.LLIZ.setHint(this.LLLLJI);
                return;
            }
        }
        if ((!Bc2() || !this.LLLLLLL) && this.LLLLLLL) {
            C1346810l9T c1346810l9T2 = this.LLLLLIL;
            if (this.LLLLIIIILLL != CommentVideoModel.Type.NONE) {
                z4 = true;
            } else {
                z4 = false;
            }
            c1346810l9T2.getClass();
            c1346810l9T2.LJI(true, z, z4, true, false, false, false, false);
            return;
        }
        C786410Ut5.T4(this.LLJJI, 1.0f);
        this.LLJJI.setEnabled(true);
        this.LLLLLIL.LIZJ(false);
        this.LLLLLIL.LIZ(this.LLIZ, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2  */
    @Override // X.InterfaceC1349170lDH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u2(int r12, boolean r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.keyboard.ui.KeyboardDialogFragment.u2(int, boolean):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        C1350650lFf.LIZ.getClass();
        if (C1350650lFf.LIZIZ()) {
            if (i2 == 100 && intent != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("MediaModel = ");
                sbLIZ.append(intent.getParcelableArrayListExtra("key_choose_media_data"));
                sbLIZ.append(" requestCode = ");
                sbLIZ.append(i);
                C2188811AlT.LIZIZ(sbLIZ);
                List<CommentImageModel> listLIZLLL = C1347740lAy.LIZLLL(intent.getParcelableArrayListExtra("key_choose_media_data"));
                if (listLIZLLL != null) {
                    if (this.LLLLII.LLJJIJI != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String aid = this.LLLIZZ.getAid();
                    if (aid == null) {
                        aid = "";
                    }
                    C1347730lAx c1347730lAx = new C1347730lAx(false, null, null, null, 0, null, null, null, null, aid, null, null, null, null, 64511);
                    if (z) {
                        C1350920lG6.LJLJJI(this.LLLJ, "replace", Integer.valueOf(C1351950lHl.LJIILIIL(this.LLLLII.LLJJIJI)), false, null);
                        C1350920lG6.LJJJLZIJ(this.LLLJ, "replace", Integer.valueOf(C1351950lHl.LJIILIIL(listLIZLLL)), false, c1347730lAx);
                    } else {
                        C1350920lG6.LJJJLZIJ(this.LLLJ, "add", Integer.valueOf(C1351950lHl.LJIILIIL(listLIZLLL)), false, c1347730lAx);
                    }
                    List<CommentImageModel> list = this.LLLLII.LLJJIJI;
                    if (list != null && !list.isEmpty()) {
                        int i3 = C2208181Bbc.LJII;
                        C2208191Bbd.LIZJ((CommentImageModel) ListProtector.get(list, 0));
                    }
                    if (!((ArrayList) listLIZLLL).isEmpty()) {
                        Aweme aweme = this.LLLIZZ;
                        if (aweme != null) {
                            int i4 = C1344860l6K.LIZ;
                            C1344860l6K.LJFF((CommentImageModel) ListProtector.get(listLIZLLL, 0), aweme.getAid());
                        }
                        int i5 = C2208181Bbc.LJII;
                        C2208191Bbd.LJIILIIL((CommentImageModel) ListProtector.get(listLIZLLL, 0));
                    }
                }
                xk0(listLIZLLL);
            }
            this.LLLLII.LLJJIJIL = false;
            if (i == 10002) {
                bS(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v51, types: [X.0lCa] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        C1163430gNh c1163430gNh;
        List<String> list;
        LinearLayout linearLayout;
        Context context = getContext();
        if (context == null) {
            C844470XAv.LIZ.getClass();
            context = C844470XAv.LIZ();
        }
        Context contextLIZIZ = C1354730lMF.LIZIZ(context);
        boolean z = false;
        View viewLJFF = C20673215v0.LJFF(contextLIZIZ, contextLIZIZ, R.layout.a28, viewGroup, false);
        this.LLLLIL = viewLJFF;
        this.LLLFF = (FrameLayout) viewLJFF.findViewById(R.id.y_b);
        this.LLLFFI = (FrameLayout) viewLJFF.findViewById(R.id.ec9);
        this.LLILZ = (ImageView) viewLJFF.findViewById(R.id.t83);
        this.LLILZLL = (C427870Gq9) viewLJFF.findViewById(R.id.e_l);
        C1353500lKG c1353500lKG = (C1353500lKG) viewLJFF.findViewById(R.id.eal);
        this.LLIZ = c1353500lKG;
        if (c1353500lKG != null) {
            c1353500lKG.setVerticalScrollBarEnabled(false);
        }
        this.LLILLL = (ViewGroup) viewLJFF.findViewById(R.id.eaj);
        this.LLILZIL = viewLJFF.findViewById(R.id.ma7);
        if (!this.LLLLLLL) {
            this.LLJJI = viewLJFF.findViewById(R.id.ed9);
        } else {
            this.LLJJI = viewLJFF.findViewById(R.id.ed_);
        }
        this.LLLLZLLLI = viewLJFF.findViewById(R.id.wxh);
        this.LLJJIJI = viewLJFF.findViewById(R.id.m_o);
        this.LLJJIJIIJIL = viewLJFF.findViewById(R.id.mbj);
        this.LLJJIJIL = viewLJFF.findViewById(R.id.mb7);
        this.LLJJJ = (RemoteImageView) viewLJFF.findViewById(R.id.ivj);
        this.LLJJJIL = viewLJFF.findViewById(R.id.ivk);
        this.LLJJJJ = (LinearLayout) viewLJFF.findViewById(R.id.h05);
        if (C294400BgM.LIZ()) {
            this.LLJJJJLIIL = (FrameLayout) viewLJFF.findViewById(R.id.oe0);
            if (!CommentWithStickerExp.LIZIZ() && (linearLayout = this.LLJJJJ) != null && linearLayout.getLayoutParams() != null) {
                try {
                    this.LLJJJJ.getLayoutParams().height = (int) context.getResources().getDimension(R.dimen.x3);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } else {
            this.LLJJJJLIIL = (FrameLayout) viewLJFF.findViewById(R.id.odz);
        }
        C786410Ut5.LJZ(0, this.LLJJJJLIIL);
        this.LLJI = (LinearLayout) viewLJFF.findViewById(R.id.k0y);
        this.LLJL = (LinearLayout) viewLJFF.findViewById(R.id.vc_);
        this.LLJJLIIIJLLLLLLLZ = viewLJFF.findViewById(R.id.nak);
        if (C444960Hcc.LIZJ(context)) {
            this.LLJJLIIIJLLLLLLLZ.setPadding(C418440Gaw.LIZ(4), 0, C418440Gaw.LIZ(12), 0);
        } else {
            this.LLJJLIIIJLLLLLLLZ.setPadding(C418440Gaw.LIZ(12), 0, C418440Gaw.LIZ(4), 0);
        }
        this.LLJLIL = (LinearLayout) viewLJFF.findViewById(R.id.vca);
        FrameLayout frameLayout = (FrameLayout) viewLJFF.findViewById(R.id.ecn);
        if (frameLayout != null) {
            C786410Ut5.LJZ(0, frameLayout);
        }
        this.LLIZLLLIL = (SmartImageView) viewLJFF.findViewById(R.id.ecm);
        this.LLJ = (FrameLayout) viewLJFF.findViewById(R.id.fl0);
        C1350650lFf.LIZ.getClass();
        C19GS c19gs = null;
        if (!this.LLLLLLL) {
            C786410Ut5.LJZL(8, this.LLJI);
            C786410Ut5.LJZL(0, this.LLJL);
            C786410Ut5.LJZL(0, this.LLJLIL);
            TuxIconView tuxIconView = (TuxIconView) this.LLJLIL.findViewById(R.id.l99);
            this.LLJIJIL = tuxIconView;
            gS(6, tuxIconView);
            TuxIconView tuxIconView2 = (TuxIconView) this.LLJLIL.findViewById(R.id.lfo);
            this.LLJJ = tuxIconView2;
            gS(6, tuxIconView2);
            TuxIconView tuxIconView3 = (TuxIconView) this.LLJLIL.findViewById(R.id.lie);
            this.LLJJIII = tuxIconView3;
            gS(6, tuxIconView3);
            TuxIconView tuxIconView4 = (TuxIconView) this.LLJLIL.findViewById(R.id.lzc);
            this.LLJILJIL = tuxIconView4;
            gS(6, tuxIconView4);
            TuxIconView tuxIconView5 = (TuxIconView) this.LLJLIL.findViewById(R.id.ll7);
            this.LLJILJILJ = tuxIconView5;
            gS(6, tuxIconView5);
            ViewGroup viewGroup2 = (ViewGroup) this.LLJLIL.findViewById(R.id.kcl);
            this.LLJILLL = viewGroup2;
            gS(6, viewGroup2);
            if (!this.LLLLLLL) {
                C786410Ut5.LJLLLLLL(8, this.LLJJI);
                View viewFindViewById = this.LLJLIL.findViewById(R.id.cuv);
                this.LLJJI = viewFindViewById;
                gS(14, viewFindViewById);
                C786410Ut5.LJLLLLLL(0, this.LLJJI);
            }
            LinearLayout linearLayout2 = this.LLJL;
            if (linearLayout2 != null) {
                if (C1347860lBA.LIZIZ) {
                    list = C1347860lBA.LIZJ;
                } else {
                    list = null;
                }
                if (list != null) {
                    C786410Ut5.LJJJJI(linearLayout2);
                    for (String str : list) {
                        str.getClass();
                        switch (str) {
                            case "gift":
                                TuxIconView tuxIconView6 = this.LLJJIII;
                                if (tuxIconView6 != null) {
                                    linearLayout2.addView(tuxIconView6);
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "emoji":
                                TuxIconView tuxIconView7 = this.LLJJ;
                                if (tuxIconView7 != null) {
                                    linearLayout2.addView(tuxIconView7);
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "photo":
                                ViewGroup viewGroup3 = this.LLJILLL;
                                if (viewGroup3 != null) {
                                    linearLayout2.addView(viewGroup3);
                                    break;
                                } else {
                                    break;
                                }
                                break;
                            case "mention":
                                TuxIconView tuxIconView8 = this.LLJIJIL;
                                if (tuxIconView8 != null) {
                                    linearLayout2.addView(tuxIconView8);
                                    break;
                                } else {
                                    break;
                                }
                                break;
                        }
                    }
                    View view = this.LLJJI;
                    if (view != null) {
                        linearLayout2.addView(view);
                    }
                }
            }
        } else {
            C786410Ut5.LJZL(0, this.LLJI);
            C786410Ut5.LJZL(8, this.LLJL);
            this.LLJIJIL = (TuxIconView) viewLJFF.findViewById(R.id.l99);
            this.LLJJ = (TuxIconView) viewLJFF.findViewById(R.id.lfo);
            this.LLJJIII = (TuxIconView) viewLJFF.findViewById(R.id.lie);
            this.LLJILJIL = (TuxIconView) viewLJFF.findViewById(R.id.lzc);
            this.LLJILJILJ = (TuxIconView) viewLJFF.findViewById(R.id.ll7);
            this.LLJILLL = (ViewGroup) viewLJFF.findViewById(R.id.kcl);
        }
        this.LLJLILLLLZIIL = (C1348840lCk) viewLJFF.findViewById(R.id.pw0);
        View viewFindViewById2 = viewLJFF.findViewById(R.id.kqf);
        this.LLJLL = viewFindViewById2;
        viewFindViewById2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1401910maL(this, 0));
        this.LLJLLIL = viewLJFF.findViewById(R.id.pvw);
        View viewFindViewById3 = viewLJFF.findViewById(R.id.pvz);
        this.LLJLLL = viewFindViewById3;
        viewFindViewById3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1401910maL(this, 1));
        viewLJFF.findViewById(R.id.ivl);
        this.LLJZ = viewLJFF.findViewById(R.id.mba);
        this.LLJZIJLIL = (ViewGroup) viewLJFF.findViewById(R.id.ea2);
        viewLJFF.findViewById(R.id.xmr);
        this.LLL = (ViewGroup) viewLJFF.findViewById(R.id.iyw);
        this.LLLF = (C1341720l1G) viewLJFF.findViewById(R.id.um8);
        if (!this.LLLLLLL) {
            this.LLLFZ = (FrameLayout) viewLJFF.findViewById(R.id.j0_);
            this.LLLI = (FrameLayout) viewLJFF.findViewById(R.id.o7p);
            this.LLLZIL = viewLJFF.findViewById(R.id.v_divider_top_line);
            this.LLLZL = viewLJFF.findViewById(R.id.v_divider_bottom_line);
        }
        viewLJFF.findViewById(R.id.yz9);
        this.LLLLLL = viewLJFF.findViewById(R.id.bnu);
        C786410Ut5.LJLLLLLL(4, this.LLJJIJI);
        HandlerHook.viewPostDelay(this.LLJJIJI, new ARunnableS121S0100000_21(this, 164), 500L);
        if (C2279851ELn.LIZIZ() && getActivity() != null) {
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(QuickMentionVM.class);
            QuickMentionVM quickMentionVM = (QuickMentionVM) C452501pT.LIZIZ(new AwS79S0500000_19(this, c19719912DlLIZ, new AwS560S0100000_16((C13IQ) c19719912DlLIZ, 823), AFwS259S0000000_21.get$arr$(388), (Function0) null, 34)).getValue();
            this.LLLLLLJ = quickMentionVM;
            if (quickMentionVM != null) {
                AssemViewModel.selectSubscribe$default(quickMentionVM, new C2217381BqS() { // from class: X.0lB2
                    @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                    public final Object get(Object obj) {
                        return ((C1347810lB5) obj).LL;
                    }
                }, C736820SvI.LIZLLL(), this, null, new AwS600S0100000_21(new AObjectS364S0100000_21(this, 2), 278), 8, null);
            }
        }
        if (getArguments() != null) {
            string = getArguments().getString("enterFrom");
        } else {
            string = "";
        }
        if (C295880Bik.LIZLLL && !C295780Bia.LIZIZ) {
            c1163430gNh = C1350620lFc.LIZ;
        } else {
            c1163430gNh = null;
        }
        HashMap map = new HashMap();
        if (this.LLLIZZ.getCommentAtTakoInfo() != null) {
            map.put("can_show_tako_account", String.valueOf(this.LLLIZZ.getCommentAtTakoInfo().showTakoAccount));
        }
        this.LLLLZIL = C20612915lH.LIZIZ.LIZIZ(string, map, new InterfaceC20613315lL() { // from class: X.0lCa
            @Override // X.InterfaceC20613315lL
            public final void Af() {
            }

            @Override // X.InterfaceC20613315lL
            public final void LLJI() {
            }

            @Override // X.InterfaceC20613315lL
            public final void M8(String str2, String str3, C316530Cax c316530Cax, String str4) {
            }

            @Override // X.InterfaceC20613315lL
            public final void Wj(String str2, C316530Cax c316530Cax, String str3) {
            }

            @Override // X.InterfaceC20613315lL
            public final String getCreationId() {
                return null;
            }

            @Override // X.InterfaceC20613315lL
            public final int lk() {
                return 0;
            }

            @Override // X.InterfaceC20613315lL
            public final void r6(int i) {
            }

            @Override // X.InterfaceC20613315lL
            public final void ld(int i) {
                InterfaceC1348870lCn interfaceC1348870lCn;
                if (i != 0 && (interfaceC1348870lCn = this.LL.LLLLZIL) != null) {
                    interfaceC1348870lCn.Ym(true);
                    this.LL.il2();
                }
            }

            @Override // X.InterfaceC20613315lL
            public final void qj(User user) {
                this.LL.LLIZ.LJIIJJI(user.getUid());
                C786410Ut5.x5(this.LL.LLJIJIL, 1.0f);
            }

            @Override // X.InterfaceC20613315lL
            public final void g1(String str2, boolean z2) {
                if (z2) {
                    C1389890mGx c1389890mGx = new C1389890mGx(this.LL.LLLLLLIL);
                    c1389890mGx.LJIIJ(str2);
                    c1389890mGx.LJIIJJI();
                }
            }

            @Override // X.InterfaceC20613315lL
            public final void Mi(User user, boolean z2, String str2, String str3, int i) throws Throwable {
                InterfaceC1348870lCn interfaceC1348870lCn = this.LL.LLLLZIL;
                if (interfaceC1348870lCn != null && z2) {
                    interfaceC1348870lCn.Ym(true);
                    this.LL.il2();
                }
                KeyboardDialogFragment keyboardDialogFragment = this.LL;
                Editable editableLLLZZIL = C2204961BRm.LLLZZIL(keyboardDialogFragment.LLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0i2XLulHCwPDUaow+UtSpqApMiig+1lpuvg==", null));
                int selectionStart = keyboardDialogFragment.LLIZ.getSelectionStart();
                C0I1T c0i1t = C0I1T.LIZ;
                Editable editableLLLZZIL2 = C2204961BRm.LLLZZIL(keyboardDialogFragment.LLIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLL0iZaKbbdaD49xe/0i2XLulHCwPDUaow+UtSpqApMiig+1lpuvg==", null));
                c0i1t.getClass();
                String strLIZJ = C0I1T.LIZJ(selectionStart, editableLLLZZIL2, false);
                if (strLIZJ == null) {
                    strLIZJ = "";
                }
                if (editableLLLZZIL != null) {
                    editableLLLZZIL.delete(selectionStart - strLIZJ.length(), selectionStart);
                }
                String strLJ = C1342220l24.LJ(user, keyboardDialogFragment.LLLIILIL, true, false);
                Aweme aweme = keyboardDialogFragment.LLLIZZ;
                if (aweme != null) {
                    AwemeExtKt.getAuthorUid(aweme);
                }
                if (C1351950lHl.LJIIJJI(keyboardDialogFragment.LLIZ, strLJ)) {
                    C1389890mGx c1389890mGx = new C1389890mGx(keyboardDialogFragment);
                    c1389890mGx.LJIIIZ(2131828516);
                    c1389890mGx.LJIIJJI();
                    InterfaceC1348870lCn interfaceC1348870lCn2 = keyboardDialogFragment.LLLLZIL;
                    if (interfaceC1348870lCn2 != null) {
                        interfaceC1348870lCn2.f4(user.getUid());
                        return;
                    }
                    return;
                }
                if (!keyboardDialogFragment.LLIZ.LJIIIIZZ(0, strLJ, user.getUid(), user.getSecUid())) {
                    if (keyboardDialogFragment.getContext() == null) {
                        return;
                    }
                    C1389890mGx c1389890mGx2 = new C1389890mGx(keyboardDialogFragment);
                    c1389890mGx2.LJIIIZ(2131826445);
                    c1389890mGx2.LJIIJJI();
                    return;
                }
                ((C1348730lCZ) keyboardDialogFragment.LLLIIII).LLILZLL.add(user);
                InterfaceC1349150lDF interfaceC1349150lDF = keyboardDialogFragment.LLLIIII;
                C1348730lCZ c1348730lCZ = (C1348730lCZ) interfaceC1349150lDF;
                C1347300lAG.LIZIZ(i + 1, strLIZJ, c1348730lCZ.LLILZIL.getCommentInputAweme(), c1348730lCZ.LJIIZILJ(), str2, user, keyboardDialogFragment.RR());
            }
        }, this, c1163430gNh);
        this.LLIZ.setOnMentionSpanDeleteListener(new InterfaceC1353580lKO() { // from class: X.0lCq
            @Override // X.InterfaceC1353580lKO
            public final void LIZ() {
                this.LIZ.LLLLLZL = true;
            }

            @Override // X.InterfaceC1353580lKO
            public final void LIZIZ(boolean z2) {
                KeyboardDialogFragment keyboardDialogFragment = this.LIZ;
                keyboardDialogFragment.LLLLLZ = !z2;
                if (z2) {
                    keyboardDialogFragment.LLLLLZL = false;
                }
            }

            @Override // X.InterfaceC1353580lKO
            public final void LIZJ(boolean z2) {
                this.LIZ.LLLLLZIL = !z2;
            }

            @Override // X.InterfaceC1353580lKO
            public final void LIZLLL(String str2) {
                InterfaceC1348870lCn interfaceC1348870lCn = this.LIZ.LLLLZIL;
                if (interfaceC1348870lCn != null) {
                    interfaceC1348870lCn.f4(str2);
                }
            }
        });
        this.LLLLLIL = new C1346810l9T(this.LLILLL, this.LLLLLLL);
        if (CommentWithStickerExp.LIZIZ()) {
            this.LLZL = new C459990I2b(this.LLJJ, this.LLIZ);
        }
        Aweme aweme = this.LLLIZZ;
        if (aweme != null && aweme.getStatistics() != null && C296140BjA.LIZ(AwemeExtKt.getFollowStatus(this.LLLIZZ)) && this.LLLIZZ.getStatistics().getCommentCount() > 0) {
            z = true;
        }
        if (!z) {
            if (!this.LLLLLLL) {
                C1351440lGw c1351440lGw = new C1351440lGw(context, null, 6);
                this.LLJJL = c1351440lGw;
                this.LLJJJJLIIL.addView(c1351440lGw);
            } else {
                this.LLILLL.setPadding(C418440Gaw.LIZ(44), this.LLILLL.getPaddingTop(), C418440Gaw.LIZ(44), this.LLILLL.getPaddingBottom());
                this.LLLLLIL.LIZLLL(C418440Gaw.LIZ(22));
            }
        }
        try {
            ViewTreeLifecycleOwner.set(viewLJFF, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(viewLJFF, this);
            viewLJFF.setTag(R.id.view_tree_saved_state_registry_owner, this);
            C19EG activity = getActivity();
            if (activity instanceof C19GS) {
                c19gs = (C19GS) activity;
            }
            C1685300txQ.LIZ(c19gs);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return viewLJFF;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return viewLJFF;
        }
    }

    @Override // X.InterfaceC460010I2d
    public final void onEmojiClick(String str, int i, int i2) {
        InterfaceC1348780lCe interfaceC1348780lCe;
        InterfaceC1349150lDF interfaceC1349150lDF = this.LLLIIII;
        if (interfaceC1349150lDF != null && (interfaceC1348780lCe = ((C1348730lCZ) interfaceC1349150lDF).LLILZIL) != null) {
            interfaceC1348780lCe.onEmojiClick(str, i, i2);
        }
    }
}
