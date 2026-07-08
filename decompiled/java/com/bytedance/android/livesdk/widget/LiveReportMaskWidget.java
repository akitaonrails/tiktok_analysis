package com.bytedance.android.livesdk.widget;

import X.C0IEB;
import X.C0JBN;
import X.C1113800f5e;
import X.C12ES;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C1819620xS4;
import X.C20736316Cj;
import X.C20743516Fd;
import X.C500260Jjc;
import X.C786410Ut5;
import Y.ACListenerS142S0100000_7;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class LiveReportMaskWidget extends LiveWidget {
    public static final Set<Long> LLILZLL = new LinkedHashSet();
    public Room LL;
    public C0IEB LLILLJJLI;
    public int LLILLL;
    public C1324720kZq LLILZ;
    public View LLILZIL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.i27;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void x1() {
        ImageModel cover;
        int i = this.LLILLL;
        if (i == 1) {
            C1324720kZq c1324720kZq = this.LLILZ;
            if (c1324720kZq != null) {
                C786410Ut5.LLJJIII(c1324720kZq, 8);
            }
            View view = this.LLILZIL;
            if (view != null) {
                C786410Ut5.LJLLLLLL(8, view);
                return;
            }
            return;
        }
        if (i == 2) {
            C1324720kZq c1324720kZq2 = this.LLILZ;
            if (c1324720kZq2 != null) {
                C786410Ut5.LLJJIII(c1324720kZq2, 0);
            }
            View view2 = this.LLILZIL;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            float fLJIIJ = C12ES.LJIIJ(getContext()) / C12ES.LJIIIIZZ(getContext());
            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
            Room room = this.LL;
            C1324610kZf c1324610kZfLIZJ = c0jbnLIZ.LIZJ((room == null || (cover = room.getCover()) == null) ? null : cover.getUrls());
            c1324610kZfLIZJ.LJIIZILJ = fLJIIJ;
            c1324610kZfLIZJ.LJIJ = 5;
            c1324610kZfLIZJ.LJJI(this.LLILZ);
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 116), findViewById(R.id.clq));
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        C0IEB c0ieb = this.LLILLJJLI;
        if (c0ieb != null) {
            c0ieb.start();
        }
        if (C500260Jjc.LJJIIJZLJL(this.LL)) {
            C1113800f5e c1113800f5e = C1113800f5e.LIZ;
            C1113800f5e.LJIIIIZZ = true;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void onCreate() {
        ImageView imageView;
        C20743516Fd c20743516FdLIZLLL;
        super.onCreate();
        View view = getView();
        if (view != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0IJN
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                }
            }, view);
        }
        this.LLILZ = (C1324720kZq) findViewById(R.id.t8t);
        this.LLILZIL = findViewById(R.id.t8u);
        View viewFindViewById = findViewById(R.id.t8v);
        if ((viewFindViewById instanceof ImageView) && (imageView = (ImageView) viewFindViewById) != null && (c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.ejq, imageView.getContext())) != null) {
            c20743516FdLIZLLL.setTint(C20736316Cj.LIZIZ(R.attr.eu1, imageView.getContext()));
            imageView.setImageDrawable(c20743516FdLIZLLL);
        }
        x1();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        super.show();
        C0IEB c0ieb = this.LLILLJJLI;
        if (c0ieb != null) {
            c0ieb.stop(false);
        }
        C1113800f5e c1113800f5e = C1113800f5e.LIZ;
        C1113800f5e.LJIIIIZZ = false;
    }

    public LiveReportMaskWidget(Room room, C0IEB c0ieb, int i) {
        this.LL = room;
        this.LLILLJJLI = c0ieb;
        this.LLILLL = i;
    }
}
