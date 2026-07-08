package com.bytedance.android.livesdk.userinfowidget;

import X.C0IJT;
import X.C0JSR;
import X.C0KVU;
import X.C0TZM;
import X.C1099380eiO;
import X.C1099610eil;
import X.C1148400fzS;
import X.C1161920gLG;
import X.C12ES;
import X.C1324610kZf;
import X.C16F5;
import X.C1819620xS4;
import X.C19ME;
import X.C2187701Ajg;
import X.C472860IgW;
import X.C474500IjA;
import X.C497740JfY;
import X.C783980UpA;
import X.C786410Ut5;
import X.InterfaceC1085480eLy;
import X.InterfaceC1087920ePu;
import X.InterfaceC1142670fqD;
import X.ViewTreeObserverOnGlobalLayoutListenerC786100Usa;
import Y.ACListenerS147S0100000_12;
import android.graphics.drawable.Animatable;
import android.text.BidiFormatter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.dataChannel.LiveProfileLikeClickStartEvent;
import com.bytedance.android.livesdk.dataChannel.MuteMicChannel;
import com.bytedance.android.livesdk.dataChannel.RoomOwnerMuteEvent;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.livesetting.other.LiveImageLoaderModuleSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: loaded from: classes18.dex */
public final class TryModeUserInfoWidget extends LiveWidget implements InterfaceC1087920ePu {
    public ViewGroup LL;
    public C1099610eil LLILLJJLI;
    public View LLILLL;
    public C16F5 LLILZ;
    public View LLILZIL;
    public C472860IgW LLILZLL;
    public View LLIZ;
    public long LLIZLLLIL;
    public final User LLJ = UserService.getInstance().user().LJIJJLI();
    public long LLJI;

    @Override // X.InterfaceC1087920ePu
    public final String JA() {
        return "TryModeUserInfoWidget";
    }

    @Override // X.InterfaceC1087920ePu
    public final void Py(LikeHelper likeHelper, int i) {
    }

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.h94;
    }

    @Override // X.InterfaceC1087920ePu
    public final /* synthetic */ void onResult(String str) {
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        ViewTreeObserver viewTreeObserver;
        ViewGroup.LayoutParams layoutParams;
        C472860IgW c472860IgW;
        C19ME c19me;
        super.onCreate();
        this.LL = (ViewGroup) findViewById(R.id.b03);
        this.LLILLJJLI = (C1099610eil) findViewById(R.id.jhk);
        this.LLILLL = findViewById(R.id.p0o);
        ViewGroup viewGroup = this.LL;
        if (viewGroup != null) {
            C786410Ut5.K7(viewGroup, new ACListenerS147S0100000_12(this, 235));
        }
        this.LLILZ = (C16F5) findViewById(R.id.user_name);
        findViewById(R.id.bbw);
        this.LLILZIL = findViewById(R.id.pbn);
        this.LLILZLL = (C472860IgW) findViewById(R.id.mnh);
        View view = this.LLILLL;
        if (view instanceof ConstraintLayout) {
            ViewGroup.LayoutParams layoutParams2 = view != null ? view.getLayoutParams() : null;
            if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
                c19me.matchConstraintMaxWidth = (int) C497740JfY.LIZIZ(92.72727f);
            }
        }
        C472860IgW c472860IgW2 = this.LLILZLL;
        if (c472860IgW2 != null) {
            c472860IgW2.LJJLIIIJLJLI(((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).gB2());
        }
        View view2 = this.LLILLL;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && (layoutParams instanceof C19ME) && (c472860IgW = this.LLILZLL) != null) {
            c472860IgW.setTextMeasureMaxWidth(((C19ME) layoutParams).matchConstraintMaxWidth);
        }
        this.LLJI = 0L;
        Boolean bool = (Boolean) this.dataChannel.gg0(C0TZM.class);
        if (bool != null) {
            bool.booleanValue();
        }
        C16F5 c16f5 = this.LLILZ;
        if (c16f5 != null) {
            c16f5.setMaxWidth((int) C497740JfY.LIZIZ(131.0f));
        }
        if (C12ES.LJIILIIL(this.LLILZIL)) {
            this.LLIZ = this.LLILZIL;
        }
        this.LLIZLLLIL = 0L;
        if (isViewValid()) {
            C1099610eil c1099610eil = this.LLILLJJLI;
            if (c1099610eil != null) {
                ImageModel avatarThumb = this.LLJ.getAvatarThumb();
                InterfaceC1142670fqD interfaceC1142670fqD = new InterfaceC1142670fqD() { // from class: X.0eWN
                    @Override // X.InterfaceC1142670fqD
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZIZ(Animatable animatable) {
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZJ(int i, int i2, String str) {
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZLLL(String str, Exception exc) {
                    }
                };
                if (LiveImageLoaderModuleSetting.useImageModule()) {
                    ArrayList arrayList = new ArrayList();
                    if (avatarThumb != null && avatarThumb.getUrls() != null) {
                        arrayList.addAll(avatarThumb.getUrls());
                    }
                    C1324610kZf c1324610kZfLJIIIIZZ = C1819620xS4.LIZ().LJIIIIZZ("live_head", arrayList);
                    c1324610kZfLJIIIIZZ.LJIILIIL = Boolean.TRUE;
                    c1324610kZfLJIIIIZZ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                    c1324610kZfLJIIIIZZ.LJ = 0;
                    c1324610kZfLJIIIIZZ.LJFF = 0;
                    c1324610kZfLJIIIIZZ.LJIIIZ = R.drawable.ela;
                    c1324610kZfLJIIIIZZ.LJIIL = interfaceC1142670fqD;
                    c1324610kZfLJIIIIZZ.LJJI(c1099610eil);
                } else {
                    C0JSR.LIZ(0, 0, R.drawable.ela, c1099610eil, avatarThumb, interfaceC1142670fqD);
                }
            }
            C16F5 c16f52 = this.LLILZ;
            if (c16f52 != null) {
                c16f52.setText(C0KVU.LIZ(this.LLJ));
            }
            C16F5 c16f53 = this.LLILZ;
            if (c16f53 != null) {
                c16f53.requestLayout();
            }
            String strLJIIL = C497740JfY.LJIIL(2131755554, (int) this.LLIZLLLIL, BidiFormatter.getInstance(C497740JfY.LJJ()).unicodeWrap(((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).Ao2(this.LLIZLLLIL)));
            C472860IgW c472860IgW3 = this.LLILZLL;
            if (c472860IgW3 != null) {
                c472860IgW3.setText(strLJIIL);
            }
        }
        DataChannel dataChannel = this.dataChannel;
        dataChannel.BQ2(this, LiveProfileLikeClickStartEvent.class, new AwS596S0100000_17(this, 250));
        dataChannel.BQ2(this, MuteMicChannel.class, new AwS596S0100000_17(this, 251));
        dataChannel.BQ2(this, RoomOwnerMuteEvent.class, new AwS596S0100000_17(this, 252));
        if (C1099380eiO.LIZ(true)) {
            C1099610eil c1099610eil2 = this.LLILLJJLI;
            if (c1099610eil2 != null) {
                c1099610eil2.setUseNewMute(true);
            }
            C1099610eil c1099610eil3 = this.LLILLJJLI;
            if (c1099610eil3 != null) {
                c1099610eil3.setAnchor(true);
            }
        }
        InterfaceC1085480eLy interfaceC1085480eLyO41 = ((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).O41(0L);
        if (interfaceC1085480eLyO41 != null) {
            interfaceC1085480eLyO41.LIZ(this.LLILLJJLI);
            interfaceC1085480eLyO41.LJIIJ(this);
        }
        View view3 = getView();
        if (view3 == null || (viewTreeObserver = view3.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC786100Usa viewTreeObserverOnGlobalLayoutListenerC786100Usa = new ViewTreeObserverOnGlobalLayoutListenerC786100Usa(this, 1);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC786100Usa);
        C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC786100Usa, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    public final void x1(long j) {
        String str;
        this.LLIZLLLIL = j;
        String strLJIIL = C497740JfY.LJIIL(2131755554, (int) this.LLIZLLLIL, BidiFormatter.getInstance(C497740JfY.LJJ()).unicodeWrap(((IBarrageService) C1161920gLG.LIZJ(IBarrageService.class)).Ao2(this.LLIZLLLIL)));
        C472860IgW c472860IgW = this.LLILZLL;
        if (c472860IgW != null) {
            c472860IgW.setText(strLJIIL);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_trymode_like");
        C783980UpA c783980UpA = (C783980UpA) DataChannelGlobal.LLILZ.gg0(C1148400fzS.class);
        if (c783980UpA != null && c783980UpA.LIZ == 0) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str, "is_new_anchor");
        c474500IjALIZ.LJJII(Long.valueOf(j), "like_amount");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC1087920ePu
    public final void Pb(InterfaceC1085480eLy interfaceC1085480eLy, int i, int i2, float f, float f2, float f3, float f4) {
        x1(this.LLIZLLLIL + 1);
    }
}
