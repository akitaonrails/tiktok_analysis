package com.ss.android.ugc.aweme.search.common.communicate;

import X.AbstractC681090Qnb;
import X.C1C7U;
import Y.ALAdapterS13S0300000_29;
import Y.ALAdapterS23S0200000_29;
import Y.ARunnableS129S0100000_29;
import android.animation.Animator;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;

/* JADX INFO: loaded from: classes30.dex */
public abstract class OnSearchTouchListener extends AbstractC681090Qnb {
    public int LLILLJJLI;
    public int LLILLL;
    public long LLILZ;
    public boolean LLILZIL;
    public final GestureHandler LLILZLL = new GestureHandler(new ARunnableS129S0100000_29(this, 169));

    public abstract void LJ();

    public OnSearchTouchListener() {
        this.LL = false;
    }

    public static final class GestureHandler extends BPEAHandler {
        public final Runnable LL;

        public GestureHandler(ARunnableS129S0100000_29 aRunnableS129S0100000_29) {
            this.LL = aRunnableS129S0100000_29;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            C1C7U.LIZ("OnSearchTouchListener$GestureHandler@76ee.handleMessage");
            if (message.what == 1) {
                this.LL.run();
            }
            super.handleMessage(message);
            C1C7U.LIZIZ("OnSearchTouchListener$GestureHandler@76ee.handleMessage");
        }
    }

    @Override // X.AbstractC681090Qnb, X.AbstractViewOnTouchListenerC19382810sM, android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 0) {
            if (this.LL) {
                Animator animatorLIZ = LIZ(view);
                animatorLIZ.addListener(new ALAdapterS23S0200000_29(this, view, motionEvent, 7));
                animatorLIZ.start();
            }
            this.LLILLJJLI = (int) motionEvent.getX();
            this.LLILLL = (int) motionEvent.getY();
            this.LLILZ = System.currentTimeMillis();
            this.LLILZIL = false;
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            this.LLILZLL.sendMessageDelayed(messageObtain, 500L);
            view.setPressed(true);
            return true;
        }
        if (motionEvent.getAction() == 2) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.LLILLJJLI) > 50.0d || Math.abs(y - this.LLILLL) > 50.0d) {
                this.LLILZLL.removeCallbacksAndMessages(null);
            }
            view.setPressed(true);
        } else {
            if (motionEvent.getAction() == 1) {
                if ((this.LLILZLL.hasMessages(1) || this.LLILZIL) && System.currentTimeMillis() - this.LLILZ >= 500) {
                    z = true;
                } else {
                    z = false;
                }
                Animator animatorLIZJ = LIZJ(view);
                if (!z) {
                    if (this.LL) {
                        animatorLIZJ.addListener(new ALAdapterS13S0300000_29(motionEvent, this, view, 2));
                    } else {
                        LIZIZ(motionEvent, view);
                    }
                }
                animatorLIZJ.start();
                this.LLILZLL.removeCallbacksAndMessages(null);
                view.setPressed(false);
                return true;
            }
            if (motionEvent.getAction() == 3) {
                if (this.LL) {
                    LIZJ(view).start();
                }
                this.LLILZLL.removeCallbacksAndMessages(null);
                view.setPressed(false);
                return false;
            }
        }
        return false;
    }
}
