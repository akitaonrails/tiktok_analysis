package com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.settings;

import X.C1289960jfm;
import X.C1324160kYw;
import X.C196K;
import X.C1C7U;
import X.C21688219uK;
import X.C844470XAv;
import X.InterfaceC1312540kGC;
import X.InterfaceC21676019sM;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.lynx.tasm.behavior.ui.list.UIList;
import j27.s;

/* JADX INFO: loaded from: classes21.dex */
public final class LynxDragListUIView extends UIList {
    public boolean LLLLII;
    public C196K LLLLIIIILLL;
    public C21688219uK LLLLIIL;
    public int LLLLIILL;
    public int LLLLIILLL;
    public final LynxDragListUIView$mHandler$1 LLLLIL;
    public final C1324160kYw LLLLILI;

    @Override // com.lynx.tasm.behavior.ui.list.UIList, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void onPropsUpdated() {
        super.onPropsUpdated();
        LJJIIZI().getMap("diffResult");
        C196K c196k = this.LLLLIIIILLL;
        if (c196k != null) {
            c196k.LJIILLIIL();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.settings.LynxDragListUIView$mHandler$1] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0kYw] */
    public LynxDragListUIView(s sVar) {
        super(sVar, null);
        this.LLLLIILL = 100;
        this.LLLLIILLL = -1;
        final Looper mainLooper = Looper.getMainLooper();
        this.LLLLIL = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.aweme.influencer.ecommercelive.common.framework.settings.LynxDragListUIView$mHandler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C21688219uK c21688219uK;
                C1C7U.LIZ("LynxDragListUIView@1725.mHandler$1");
                super.handleMessage(message);
                if (message.what == 0 && (c21688219uK = this.LL.LLLLIIL) != null) {
                    c21688219uK.LJIILLIIL((RecyclerView.ViewHolder) HandlerHook.getMessageObj(message.obj));
                }
                C1C7U.LIZIZ("LynxDragListUIView@1725.mHandler$1");
            }
        };
        this.LLLLILI = new InterfaceC21676019sM() { // from class: X.0kYw
            public final int LL;
            public float LLILLJJLI;
            public float LLILLL;
            public boolean LLILZ;

            @Override // X.InterfaceC21676019sM
            public final void LJIIJ(RecyclerView recyclerView, MotionEvent motionEvent) {
            }

            {
                this.LL = ViewConfiguration.get(this.LLILZIL.mView.getContext()).getScaledTouchSlop();
            }

            @Override // X.InterfaceC21676019sM
            public final void LJIIZILJ(boolean z) {
                if (z) {
                    removeMessages(0);
                }
            }

            @Override // X.InterfaceC21676019sM
            public final boolean LJJIFFI(RecyclerView recyclerView, MotionEvent motionEvent) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (motionEvent.getAction() == 0) {
                    this.LLILLJJLI = x;
                    this.LLILLL = y;
                    this.LLILZ = false;
                    View viewFindChildViewUnder = recyclerView.findChildViewUnder(x, y);
                    if (viewFindChildViewUnder != null) {
                        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(viewFindChildViewUnder);
                        Message messageObtainMessage = obtainMessage(0);
                        messageObtainMessage.obj = childViewHolder;
                        sendMessageDelayed(messageObtainMessage, r0.LLLLIILL);
                    }
                } else if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    if (motionEvent.getAction() == 2 && !this.LLILZ && hasMessages(0) && (Math.abs(x - this.LLILLJJLI) > this.LL || Math.abs(y - this.LLILLL) > this.LL)) {
                        this.LLILZ = true;
                        removeMessages(0);
                        return false;
                    }
                } else if (hasMessages(0)) {
                    removeMessages(0);
                    return false;
                }
                return false;
            }
        };
    }

    @InterfaceC1312540kGC(defaultBoolean = false, name = "drag-enable")
    public final void setDragEnable(boolean z) {
        if (this.LLLLII != z) {
            this.LLLLII = z;
            if (z) {
                C196K c196k = new C196K(this);
                C21688219uK c21688219uK = new C21688219uK(c196k);
                c21688219uK.LJ((RecyclerView) this.mView);
                ((RecyclerView) this.mView).addOnItemTouchListener(this.LLLLILI);
                this.LLLLIIIILLL = c196k;
                this.LLLLIIL = c21688219uK;
                return;
            }
            this.LLLLIIIILLL = null;
            C21688219uK c21688219uK2 = this.LLLLIIL;
            if (c21688219uK2 != null) {
                c21688219uK2.LJ(null);
            }
            ((RecyclerView) this.mView).removeOnItemTouchListener(this.LLLLILI);
            this.LLLLIIL = null;
            removeCallbacksAndMessages(null);
        }
    }

    @InterfaceC1312540kGC(defaultInt = -1, name = "drag-slide-speed")
    public final void setDragSlideSpeed(int i) {
        int i2 = -1;
        if (i != -1) {
            C844470XAv.LIZ.getClass();
            i2 = (int) ((C844470XAv.LIZ().getResources().getDisplayMetrics().density * i) + 0.5f);
        }
        if (this.LLLLIILLL != i2) {
            this.LLLLIILLL = i2;
        }
    }

    @InterfaceC1312540kGC(defaultInt = 100, name = "drag-trigger-duration")
    public final void setDragTriggerDuration(int i) {
        if (this.LLLLIILL != i) {
            this.LLLLIILL = i;
        }
    }

    public final void LJJJJL(int i, String str) {
        C1289960jfm c1289960jfm = new C1289960jfm(getSign(), "dragstatechange");
        c1289960jfm.LIZIZ(str, "state");
        c1289960jfm.LIZIZ(Integer.valueOf(i), "position");
        this.mContext.LLIZ.LIZIZ(c1289960jfm);
    }
}
