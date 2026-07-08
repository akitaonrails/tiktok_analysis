package com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget;

import X.C098200Yq;
import X.C13LP;
import X.C189200o6;
import X.C19ME;
import X.C2187701Ajg;
import X.C497740JfY;
import X.C786410Ut5;
import X.ViewTreeObserverOnGlobalLayoutListenerC521810KdH;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import webcast.api.room.EncourageGoLiveCard;
import webcast.api.room.GoLiveCardPicture;

/* JADX INFO: loaded from: classes8.dex */
public final class LivePromoteTextWidget extends LivePromoteParentWidget {
    public ImageView LLJJJJ;
    public TuxTextView LLJJJJJIL;
    public ImageView LLJJJJLIIL;
    public TuxTextView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public ImageView LLJL;
    public TuxTextView LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public ImageView LLJLL;
    public TuxTextView LLJLLIL;
    public TuxTextView LLJLLL;
    public ViewTreeObserverOnGlobalLayoutListenerC521810KdH LLJZ;

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget
    public final int E1() {
        return R.layout.hjx;
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public LivePromoteTextWidget(EncourageGoLiveCard encourageGoLiveCard) {
        super(encourageGoLiveCard);
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget
    public final void O1(View view) {
        Object c098200Yq;
        try {
            c098200Yq = Integer.valueOf(Color.parseColor(this.LLILZLL.videoBgColor));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Integer num = (Integer) c098200Yq;
        if (num != null) {
            view.setBackgroundColor(num.intValue());
        }
    }

    @Override // com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget, com.bytedance.android.widget.Widget
    public final void setContentView(View view) {
        ImageView imageView;
        TuxTextView tuxTextView;
        ImageView imageView2;
        TuxTextView tuxTextView2;
        TuxTextView tuxTextView3;
        ImageView imageView3;
        TuxTextView tuxTextView4;
        TuxTextView tuxTextView5;
        ImageView imageView4;
        TuxTextView tuxTextView6;
        TuxTextView tuxTextView7;
        String str;
        String str2;
        String str3;
        ViewTreeObserver viewTreeObserver;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        View viewFindViewById;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super.setContentView(view);
        String str9 = null;
        if (view != null) {
            imageView = (ImageView) view.findViewById(R.id.jx7);
        } else {
            imageView = null;
        }
        this.LLJJJJ = imageView;
        if (view != null) {
            tuxTextView = (TuxTextView) view.findViewById(R.id.tv_title);
        } else {
            tuxTextView = null;
        }
        this.LLJJJJJIL = tuxTextView;
        if (view != null) {
            imageView2 = (ImageView) view.findViewById(R.id.lkx);
        } else {
            imageView2 = null;
        }
        this.LLJJJJLIIL = imageView2;
        if (view != null) {
            tuxTextView2 = (TuxTextView) view.findViewById(R.id.zf1);
        } else {
            tuxTextView2 = null;
        }
        this.LLJJL = tuxTextView2;
        if (view != null) {
            tuxTextView3 = (TuxTextView) view.findViewById(R.id.tv_sub_content1);
        } else {
            tuxTextView3 = null;
        }
        this.LLJJLIIIJLLLLLLLZ = tuxTextView3;
        if (view != null) {
            imageView3 = (ImageView) view.findViewById(R.id.lky);
        } else {
            imageView3 = null;
        }
        this.LLJL = imageView3;
        if (view != null) {
            tuxTextView4 = (TuxTextView) view.findViewById(R.id.zf2);
        } else {
            tuxTextView4 = null;
        }
        this.LLJLIL = tuxTextView4;
        if (view != null) {
            tuxTextView5 = (TuxTextView) view.findViewById(R.id.tv_sub_content2);
        } else {
            tuxTextView5 = null;
        }
        this.LLJLILLLLZIIL = tuxTextView5;
        if (view != null) {
            imageView4 = (ImageView) view.findViewById(R.id.lkz);
        } else {
            imageView4 = null;
        }
        this.LLJLL = imageView4;
        if (view != null) {
            tuxTextView6 = (TuxTextView) view.findViewById(R.id.zf3);
        } else {
            tuxTextView6 = null;
        }
        this.LLJLLIL = tuxTextView6;
        if (view != null) {
            tuxTextView7 = (TuxTextView) view.findViewById(R.id.tv_sub_content3);
        } else {
            tuxTextView7 = null;
        }
        this.LLJLLL = tuxTextView7;
        if (view != null && (viewFindViewById = view.findViewById(R.id.ded)) != null) {
            viewFindViewById.setBackground(null);
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams instanceof C19ME) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (marginLayoutParams != null) {
                    marginLayoutParams.setMarginStart((int) C497740JfY.LIZIZ(32.0f));
                    marginLayoutParams.setMarginEnd((int) C497740JfY.LIZIZ(32.0f));
                }
            } else {
                marginLayoutParams = null;
            }
            C786410Ut5.W5(viewFindViewById, marginLayoutParams);
        }
        TuxTextView tuxTextView8 = this.LLJJJJJIL;
        if (tuxTextView8 != null) {
            tuxTextView8.setText(this.LLILZLL.title);
        }
        H1(this.LLILZLL.titleIconUrl, this.LLJJJJ, null);
        GoLiveCardPicture goLiveCardPicture = (GoLiveCardPicture) C13LP.LJJJLZIJ(0, this.LLILZLL.pictures);
        if (goLiveCardPicture != null) {
            str = goLiveCardPicture.url;
        } else {
            str = null;
        }
        H1(str, this.LLJJJJLIIL, null);
        TuxTextView tuxTextView9 = this.LLJJL;
        if (tuxTextView9 != null) {
            GoLiveCardPicture goLiveCardPicture2 = (GoLiveCardPicture) C13LP.LJJJLZIJ(0, this.LLILZLL.pictures);
            if (goLiveCardPicture2 != null) {
                str8 = goLiveCardPicture2.text;
            } else {
                str8 = null;
            }
            tuxTextView9.setText(str8);
        }
        TuxTextView tuxTextView10 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView10 != null) {
            GoLiveCardPicture goLiveCardPicture3 = (GoLiveCardPicture) C13LP.LJJJLZIJ(0, this.LLILZLL.pictures);
            if (goLiveCardPicture3 != null) {
                str7 = goLiveCardPicture3.subText;
            } else {
                str7 = null;
            }
            tuxTextView10.setText(str7);
        }
        GoLiveCardPicture goLiveCardPicture4 = (GoLiveCardPicture) C13LP.LJJJLZIJ(1, this.LLILZLL.pictures);
        if (goLiveCardPicture4 != null) {
            str2 = goLiveCardPicture4.url;
        } else {
            str2 = null;
        }
        H1(str2, this.LLJL, null);
        TuxTextView tuxTextView11 = this.LLJLIL;
        if (tuxTextView11 != null) {
            GoLiveCardPicture goLiveCardPicture5 = (GoLiveCardPicture) C13LP.LJJJLZIJ(1, this.LLILZLL.pictures);
            if (goLiveCardPicture5 != null) {
                str6 = goLiveCardPicture5.text;
            } else {
                str6 = null;
            }
            tuxTextView11.setText(str6);
        }
        TuxTextView tuxTextView12 = this.LLJLILLLLZIIL;
        if (tuxTextView12 != null) {
            GoLiveCardPicture goLiveCardPicture6 = (GoLiveCardPicture) C13LP.LJJJLZIJ(1, this.LLILZLL.pictures);
            if (goLiveCardPicture6 != null) {
                str5 = goLiveCardPicture6.subText;
            } else {
                str5 = null;
            }
            tuxTextView12.setText(str5);
        }
        GoLiveCardPicture goLiveCardPicture7 = (GoLiveCardPicture) C13LP.LJJJLZIJ(2, this.LLILZLL.pictures);
        if (goLiveCardPicture7 != null) {
            str3 = goLiveCardPicture7.url;
        } else {
            str3 = null;
        }
        H1(str3, this.LLJLL, null);
        TuxTextView tuxTextView13 = this.LLJLLIL;
        if (tuxTextView13 != null) {
            GoLiveCardPicture goLiveCardPicture8 = (GoLiveCardPicture) C13LP.LJJJLZIJ(2, this.LLILZLL.pictures);
            if (goLiveCardPicture8 != null) {
                str4 = goLiveCardPicture8.text;
            } else {
                str4 = null;
            }
            tuxTextView13.setText(str4);
        }
        TuxTextView tuxTextView14 = this.LLJLLL;
        if (tuxTextView14 != null) {
            GoLiveCardPicture goLiveCardPicture9 = (GoLiveCardPicture) C13LP.LJJJLZIJ(2, this.LLILZLL.pictures);
            if (goLiveCardPicture9 != null) {
                str9 = goLiveCardPicture9.subText;
            }
            tuxTextView14.setText(str9);
        }
        this.LLJZ = new ViewTreeObserverOnGlobalLayoutListenerC521810KdH(view, this, 2);
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            ViewTreeObserverOnGlobalLayoutListenerC521810KdH viewTreeObserverOnGlobalLayoutListenerC521810KdH = this.LLJZ;
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC521810KdH);
            C2187701Ajg.LIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC521810KdH, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }
}
