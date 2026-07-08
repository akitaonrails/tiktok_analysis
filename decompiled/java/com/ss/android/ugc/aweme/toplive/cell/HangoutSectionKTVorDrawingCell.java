package com.ss.android.ugc.aweme.toplive.cell;

import X.AbstractC468201s0;
import X.AbstractC482420Ivw;
import X.C03H8;
import X.C0KVU;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1850730yGF;
import X.C20642515q3;
import X.C21146717pB;
import X.C2188811AlT;
import X.C426750GoL;
import X.C481820Iuy;
import X.C482300Ivk;
import X.C482360Ivq;
import X.C482620IwG;
import X.C482790IwX;
import X.C786410Ut5;
import X.C800330VaR;
import X.InterfaceC1891350zJl;
import Y.ACListenerS142S0100000_7;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ab.ToplivePageLoadAdvanceSetting;
import com.ss.android.ugc.aweme.toplive.cell.HangoutSectionKTVorDrawingCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import webcast.api.feed.ToplivePageItem;

/* JADX INFO: loaded from: classes8.dex */
public final class HangoutSectionKTVorDrawingCell extends ToplivePagePowerCell<C482360Ivq> implements C03H8 {
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public ImageView LLILZ;
    public View LLILZIL;

    public HangoutSectionKTVorDrawingCell() {
        super(false);
    }

    @Override // X.C03H8
    public final View LJJIJL() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.android.ugc.aweme.toplive.cell.ToplivePagePowerCell
    public final void L5() {
        String str;
        String str2;
        ToplivePageItem toplivePageItem;
        C481820Iuy c481820Iuy = C481820Iuy.LIZ;
        C482300Ivk.LIZ.getClass();
        ToplivePageItem toplivePageItem2 = C482300Ivk.LIZJ;
        AbstractC482420Ivw abstractC482420Ivw = (AbstractC482420Ivw) getItem();
        ToplivePageItem toplivePageItem3 = abstractC482420Ivw != null ? abstractC482420Ivw.LL : null;
        AbstractC482420Ivw abstractC482420Ivw2 = (AbstractC482420Ivw) getItem();
        if (abstractC482420Ivw2 == null || (str = abstractC482420Ivw2.LLILLL) == null) {
            str = "";
        }
        AbstractC482420Ivw abstractC482420Ivw3 = (AbstractC482420Ivw) getItem();
        if (abstractC482420Ivw3 == null || (str2 = abstractC482420Ivw3.LLILLJJLI) == null) {
            str2 = "hangout";
        }
        c481820Iuy.getClass();
        C481820Iuy.LIZLLL(toplivePageItem2, toplivePageItem3, str, str2);
        AbstractC482420Ivw abstractC482420Ivw4 = (AbstractC482420Ivw) getItem();
        if (abstractC482420Ivw4 == null || (toplivePageItem = abstractC482420Ivw4.LL) == null) {
            return;
        }
        Room room = toplivePageItem.room;
        String str3 = toplivePageItem.enterMethod;
        AbstractC482420Ivw abstractC482420Ivw5 = (AbstractC482420Ivw) getItem();
        C481820Iuy.LJ(room, str3, abstractC482420Ivw5 != null ? abstractC482420Ivw5.LLILLL : null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View view = this.itemView;
        if (view != null) {
            this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.jg0);
            this.LLILLL = (TuxTextView) view.findViewById(R.id.jfz);
            this.LLILZ = (ImageView) view.findViewById(R.id.bo_);
            this.LLILZIL = view.findViewById(R.id.uy1);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        if (ToplivePageLoadAdvanceSetting.LIZ().enableLayoutPreload) {
            return C21146717pB.LIZIZ(viewGroup.getContext(), R.layout.dib, viewGroup, false);
        }
        return C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.dib, viewGroup, false);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl, List list) {
        User owner;
        Drawable drawableLIZIZ;
        String str;
        User owner2;
        ImageModel avatarThumb;
        List urls;
        String str2;
        User owner3;
        ImageModel avatarThumb2;
        Room room;
        AbstractC482420Ivw abstractC482420Ivw = (AbstractC482420Ivw) interfaceC1891350zJl;
        super.onBindItemView(abstractC482420Ivw, list);
        ToplivePageItem toplivePageItem = abstractC482420Ivw.LL;
        List urls2 = null;
        if (toplivePageItem != null && (room = toplivePageItem.room) != null) {
            owner = room.getOwner();
        } else {
            owner = null;
        }
        String strLIZ = C0KVU.LIZ(owner);
        String str3 = "";
        if (strLIZ == null) {
            strLIZ = "";
        }
        if (strLIZ.length() >= 15) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZ.substring(0, 15));
            sbLIZ.append("...");
            strLIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        int i = abstractC482420Ivw.LL.relatedLiveNumber;
        String strLIZIZ = C1850730yGF.LIZIZ(i);
        TuxTextView tuxTextView = this.LLILLL;
        if (tuxTextView != null) {
            Resources resourcesLJFF = C20642515q3.LJFF();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("  ");
            sbLIZ2.append(strLIZ);
            tuxTextView.setText(resourcesLJFF.getQuantityString(2131756012, i, C2188811AlT.LIZIZ(sbLIZ2), strLIZIZ));
        }
        if (C482620IwG.LIZ(this.itemView.getContext())) {
            drawableLIZIZ = C800330VaR.LIZIZ(this.itemView.getContext(), R.drawable.di7);
        } else {
            drawableLIZIZ = C800330VaR.LIZIZ(this.itemView.getContext(), R.drawable.di8);
        }
        if (C426750GoL.LIZLLL(this.itemView.getContext())) {
            Bitmap bitmap = ((BitmapDrawable) drawableLIZIZ).getBitmap();
            Matrix matrix = new Matrix();
            matrix.preScale(-1.0f, 1.0f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            View view = this.LLILZIL;
            if (view != null) {
                view.setBackground(new BitmapDrawable(this.itemView.getResources(), bitmapCreateBitmap));
            }
        } else {
            View view2 = this.LLILZIL;
            if (view2 != null) {
                view2.setBackground(drawableLIZIZ);
            }
        }
        TuxTextView tuxTextView2 = this.LLILLJJLI;
        if (tuxTextView2 != null) {
            tuxTextView2.setText(abstractC482420Ivw.LL.cardTitle);
        }
        if (C482620IwG.LIZ(this.itemView.getContext())) {
            str = abstractC482420Ivw.LL.darkBgUrl;
        } else {
            str = abstractC482420Ivw.LL.lightBgUrl;
        }
        if (str == null) {
            str = "";
        }
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        final int i2 = 0;
        c1331670kl3LJIIIZ.LJJII(new AbstractC468201s0(this, i2) { // from class: X.0FWl
            public final int $t;
            public Object l0;

            public static final void onFailed$0(C391450FWl c391450FWl, Throwable th) {
            }

            public static final void onFailed$1(C391450FWl c391450FWl, Throwable th) {
            }

            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap2) {
                switch (this.$t) {
                    case 0:
                        LIZ$0(this, bitmap2);
                        break;
                    case 1:
                        LIZ$1(this, bitmap2);
                        break;
                    default:
                        super.LIZ(bitmap2);
                        break;
                }
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                switch (this.$t) {
                    case 0:
                        onFailed$0(this, th);
                        break;
                    case 1:
                        onFailed$1(this, th);
                        break;
                    default:
                        super.onFailed(th);
                        break;
                }
            }

            {
                this.$t = i2;
                this.l0 = this;
            }

            public static final void LIZ$0(C391450FWl c391450FWl, Bitmap bitmap2) {
                if (bitmap2 == null) {
                    return;
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(((HangoutSectionKTVorDrawingCell) c391450FWl.l0).itemView.getResources(), bitmap2);
                if (C426750GoL.LIZLLL(((HangoutSectionKTVorDrawingCell) c391450FWl.l0).itemView.getContext())) {
                    bitmapDrawable.mutate();
                    bitmapDrawable.setAutoMirrored(true);
                }
                ImageView imageView = ((HangoutSectionKTVorDrawingCell) c391450FWl.l0).LLILZ;
                if (imageView != null) {
                    imageView.setImageDrawable(bitmapDrawable);
                }
            }

            public static final void LIZ$1(C391450FWl c391450FWl, Bitmap bitmap2) {
                CharSequence text;
                float textSize;
                if (bitmap2 == null) {
                    return;
                }
                ((HangoutSectionKTVorDrawingCell) c391450FWl.l0).getClass();
                int iMin = Math.min(bitmap2.getWidth(), bitmap2.getHeight());
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap2);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                float f = iMin / 2.0f;
                canvas.drawCircle(f, f, f, paint);
                BitmapDrawable bitmapDrawable = new BitmapDrawable(((HangoutSectionKTVorDrawingCell) c391450FWl.l0).itemView.getResources(), bitmapCreateBitmap2);
                TuxTextView tuxTextView3 = ((HangoutSectionKTVorDrawingCell) c391450FWl.l0).LLILLL;
                if (tuxTextView3 != null) {
                    text = tuxTextView3.getText();
                } else {
                    text = null;
                }
                SpannableString spannableString = new SpannableString(text);
                TuxTextView tuxTextView4 = ((HangoutSectionKTVorDrawingCell) c391450FWl.l0).LLILLL;
                if (tuxTextView4 != null) {
                    textSize = tuxTextView4.getTextSize();
                } else {
                    textSize = 0.0f;
                }
                int i3 = (int) textSize;
                bitmapDrawable.setBounds(0, 0, i3, i3);
                C786410Ut5.p2(spannableString, new C419890GdH(bitmapDrawable, 2), 0, 1, 33);
                TuxTextView tuxTextView5 = ((HangoutSectionKTVorDrawingCell) c391450FWl.l0).LLILLL;
                if (tuxTextView5 != null) {
                    tuxTextView5.setText(spannableString);
                }
            }
        });
        Room room2 = abstractC482420Ivw.LL.room;
        if (room2 != null && (owner3 = room2.getOwner()) != null && (avatarThumb2 = owner3.getAvatarThumb()) != null) {
            urls2 = avatarThumb2.getUrls();
        }
        if (!C482790IwX.LIZ(urls2)) {
            Room room3 = abstractC482420Ivw.LL.room;
            if (room3 != null && (owner2 = room3.getOwner()) != null && (avatarThumb = owner2.getAvatarThumb()) != null && (urls = avatarThumb.getUrls()) != null && (str2 = (String) ListProtector.get(urls, 0)) != null) {
                str3 = str2;
            }
            final int i3 = 1;
            C1331660kl2.LJIIIZ(str3).LJJII(new AbstractC468201s0(this, i3) { // from class: X.0FWl
                public final int $t;
                public Object l0;

                public static final void onFailed$0(C391450FWl c391450FWl, Throwable th) {
                }

                public static final void onFailed$1(C391450FWl c391450FWl, Throwable th) {
                }

                @Override // X.InterfaceC1331910klR
                public final void LIZ(Bitmap bitmap2) {
                    switch (this.$t) {
                        case 0:
                            LIZ$0(this, bitmap2);
                            break;
                        case 1:
                            LIZ$1(this, bitmap2);
                            break;
                        default:
                            super.LIZ(bitmap2);
                            break;
                    }
                }

                @Override // X.InterfaceC1331910klR
                public final void onFailed(Throwable th) {
                    switch (this.$t) {
                        case 0:
                            onFailed$0(this, th);
                            break;
                        case 1:
                            onFailed$1(this, th);
                            break;
                        default:
                            super.onFailed(th);
                            break;
                    }
                }

                {
                    this.$t = i3;
                    this.l0 = this;
                }

                public static final void LIZ$0(C391450FWl c391450FWl, Bitmap bitmap2) {
                    if (bitmap2 == null) {
                        return;
                    }
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(((HangoutSectionKTVorDrawingCell) c391450FWl.l0).itemView.getResources(), bitmap2);
                    if (C426750GoL.LIZLLL(((HangoutSectionKTVorDrawingCell) c391450FWl.l0).itemView.getContext())) {
                        bitmapDrawable.mutate();
                        bitmapDrawable.setAutoMirrored(true);
                    }
                    ImageView imageView = ((HangoutSectionKTVorDrawingCell) c391450FWl.l0).LLILZ;
                    if (imageView != null) {
                        imageView.setImageDrawable(bitmapDrawable);
                    }
                }

                public static final void LIZ$1(C391450FWl c391450FWl, Bitmap bitmap2) {
                    CharSequence text;
                    float textSize;
                    if (bitmap2 == null) {
                        return;
                    }
                    ((HangoutSectionKTVorDrawingCell) c391450FWl.l0).getClass();
                    int iMin = Math.min(bitmap2.getWidth(), bitmap2.getHeight());
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap2);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
                    float f = iMin / 2.0f;
                    canvas.drawCircle(f, f, f, paint);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(((HangoutSectionKTVorDrawingCell) c391450FWl.l0).itemView.getResources(), bitmapCreateBitmap2);
                    TuxTextView tuxTextView3 = ((HangoutSectionKTVorDrawingCell) c391450FWl.l0).LLILLL;
                    if (tuxTextView3 != null) {
                        text = tuxTextView3.getText();
                    } else {
                        text = null;
                    }
                    SpannableString spannableString = new SpannableString(text);
                    TuxTextView tuxTextView4 = ((HangoutSectionKTVorDrawingCell) c391450FWl.l0).LLILLL;
                    if (tuxTextView4 != null) {
                        textSize = tuxTextView4.getTextSize();
                    } else {
                        textSize = 0.0f;
                    }
                    int i32 = (int) textSize;
                    bitmapDrawable.setBounds(0, 0, i32, i32);
                    C786410Ut5.p2(spannableString, new C419890GdH(bitmapDrawable, 2), 0, 1, 33);
                    TuxTextView tuxTextView5 = ((HangoutSectionKTVorDrawingCell) c391450FWl.l0).LLILLL;
                    if (tuxTextView5 != null) {
                        tuxTextView5.setText(spannableString);
                    }
                }
            });
        }
        View view3 = this.itemView;
        if (view3 != null) {
            C786410Ut5.I7(new ACListenerS142S0100000_7(this, 295), view3);
        }
    }
}
