package com.ss.android.ugc.aweme.emojisticker.common.viewerlist.component;

import X.C08A4;
import X.C0GZ1;
import X.C10300041a;
import X.C418440Gaw;
import X.C423400Giw;
import X.C786410Ut5;
import X.C814420VxA;
import X.InterfaceC1891350zJl;
import Y.ARunnableS106S0100000_6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class EmojiSliderStickerAverageCell extends PowerCell<C423400Giw> {
    public ImageView LL;
    public SeekBar LLILLJJLI;
    public TuxTextView LLILLL;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final int getLayoutId() {
        return R.layout.c45;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        this.LL = (ImageView) this.itemView.findViewById(R.id.lsv);
        this.LLILLJJLI = (SeekBar) this.itemView.findViewById(R.id.u0m);
        this.LLILLL = (TuxTextView) this.itemView.findViewById(R.id.z_v);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        String string;
        Drawable drawableLIZ;
        Context context;
        int iLongValue;
        C423400Giw c423400Giw = (C423400Giw) interfaceC1891350zJl;
        super.onBindItemView(c423400Giw);
        String str = c423400Giw.LL;
        if (str == null) {
            str = "😍";
        }
        Bitmap bitmapLIZIZ = C0GZ1.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), str);
        ImageView imageView = this.LL;
        if (imageView != null) {
            imageView.setImageBitmap(bitmapLIZIZ);
        }
        Long l = c423400Giw.LLILLJJLI;
        Long l2 = c423400Giw.LLILLL;
        SeekBar seekBar = this.LLILLJJLI;
        if (seekBar != null) {
            if (l != null) {
                iLongValue = (int) l.longValue();
            } else {
                iLongValue = 0;
            }
            seekBar.setProgress(iLongValue);
        }
        SeekBar seekBar2 = this.LLILLJJLI;
        if (seekBar2 != null) {
            seekBar2.setEnabled(false);
        }
        SeekBar seekBar3 = this.LLILLJJLI;
        String string2 = null;
        if (seekBar3 != null) {
            if (C08A4.LIZIZ(l2) && (context = getContext()) != null) {
                drawableLIZ = C10300041a.LIZ(context);
            } else {
                drawableLIZ = null;
            }
            seekBar3.setThumb(drawableLIZ);
        }
        SeekBar seekBar4 = this.LLILLJJLI;
        if (seekBar4 != null) {
            HandlerHook.viewPost(seekBar4, new ARunnableS106S0100000_6(this, 229));
        }
        if (C08A4.LIZIZ(l2)) {
            Context context2 = getContext();
            if (context2 == null || (string = context2.getString(2131833868)) == null) {
                string = "";
            }
            string2 = C786410Ut5.j4(string, Arrays.copyOf(new Object[]{l2}, 1));
        } else {
            Context context3 = getContext();
            if (context3 != null) {
                string2 = context3.getString(2131833869);
            }
        }
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            tuxTextView.setText(string2);
        }
    }
}
