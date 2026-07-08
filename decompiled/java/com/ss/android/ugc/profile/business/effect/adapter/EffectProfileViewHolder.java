package com.ss.android.ugc.profile.business.effect.adapter;

import X.AbstractC1386130mAt;
import X.C01GW;
import X.C0C05;
import X.C0I7W;
import X.C1176850gjL;
import X.C1253930ijf;
import X.C1308910kAL;
import X.C1322090kVb;
import X.C1331070kk5;
import X.C1331100kk8;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1386150mAv;
import X.C1386310mBB;
import X.C13LE;
import X.C1447940nma;
import X.C1620160sGM;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C339190DRl;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C438710HIf;
import X.C444960Hcc;
import X.C452501pT;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC1338240kve;
import X.EnumC1397990mU1;
import X.InterfaceC1334290kpH;
import X.InterfaceC1398040mU6;
import Y.ACListenerS124S0200000_21;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.FromGroupPropService;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.MobileEffect;
import com.ss.android.ugc.profile.business.effect.EffectProfileListViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS59S0200000_21;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS270S0300000_26;
import kotlin.text.u;
import ttpobfuscated.e3;

/* JADX INFO: loaded from: classes22.dex */
public final class EffectProfileViewHolder extends JediSimpleViewHolder<NewFaceStickerBean> {
    public final boolean LLJI;
    public final C01GW<String> LLJIJIL;
    public final InterfaceC1398040mU6 LLJILJIL;
    public final String LLJILJILJ;
    public final String LLJILLL;
    public final C01GW LLJJ;
    public C419910GdJ LLJJI;
    public C419910GdJ LLJJIII;
    public final C01GW LLJJIJI;

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder, X.C11EV
    public final void I5() {
        String str;
        int i;
        super.I5();
        Aweme aweme = ((NewFaceStickerBean) this.LLILLJJLI).relatedAweme;
        if (aweme != null) {
            if (this.LLJI) {
                str = "personal_homepage";
                i = LSPassThroughRecordSizeConfig.DEFAULT;
            } else {
                str = "others_homepage";
                i = 2000;
            }
            int i2 = i + 6;
            if (!C0C05.LIZ()) {
                C1386150mAv c1386150mAv = new C1386150mAv();
                c1386150mAv.LIZLLL = str;
                c1386150mAv.LJIILLIIL(i2, aweme);
                c1386150mAv.LJJIIJZLJL = "effect";
                c1386150mAv.LJIILJJIL();
            }
            C1386310mBB c1386310mBB = new C1386310mBB();
            c1386310mBB.LIZLLL = str;
            c1386310mBB.LJIILLIIL = aweme.getAid();
            c1386310mBB.LJIIZILJ = AbstractC1386130mAt.LJIIJ(aweme);
            c1386310mBB.LJIJJ = AbstractC1386130mAt.LJIIL(i2, aweme);
            int awemeType = aweme.getAwemeType();
            c1386310mBB.LJIJI = awemeType != 2 ? awemeType != 101 ? "video" : "live" : "photo";
            c1386310mBB.LJIJ = Long.valueOf(aweme.getMusic() == null ? 0L : aweme.getMusic().getId());
            C1447940nma.LIZIZ(aweme);
            c1386310mBB.LJIJJLI = "effect";
            NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) this.LLILLJJLI;
            c1386310mBB.LJIL = newFaceStickerBean.id;
            c1386310mBB.LJJI = Integer.valueOf(newFaceStickerBean.moderationStatus);
            c1386310mBB.LJJ = Integer.valueOf(((NewFaceStickerBean) this.LLILLJJLI).effectSource);
            c1386310mBB.LJIILJJIL();
        }
    }

    public static C419910GdJ a6(Size size) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_effect;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c419910GdJ.LIZIZ = size.getWidth();
        c419910GdJ.LIZJ = size.getHeight();
        return c419910GdJ;
    }

    public final C2344009Gk X5(NewFaceStickerBean newFaceStickerBean) {
        String str;
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("tab_name", "effect");
        c2344009Gk.LJIIIIZZ("author_id", newFaceStickerBean.ownerId);
        c2344009Gk.LJIIIIZZ("prop_id", newFaceStickerBean.id);
        c2344009Gk.LIZJ(newFaceStickerBean.effectSource, "effect_source");
        c2344009Gk.LIZJ(newFaceStickerBean.moderationStatus, "effect_status");
        if (newFaceStickerBean.isTopEffect) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("has_top_effect_badge", str);
        if (this.LLJI) {
            str2 = "personal_homepage";
        } else {
            str2 = "others_homepage";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str2);
        return c2344009Gk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void rr(NewFaceStickerBean newFaceStickerBean) {
        String string;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        GradientDrawable.Orientation orientation;
        TuxTag tuxTag;
        NewFaceStickerBean newFaceStickerBean2 = newFaceStickerBean;
        ((TextView) this.itemView.findViewById(R.id.title)).setText(newFaceStickerBean2.name);
        TextView textView = (TextView) this.itemView.findViewById(R.id.desc);
        int i = newFaceStickerBean2.moderationStatus;
        long j = newFaceStickerBean2.userCount;
        if (i != 2) {
            if (i != 4) {
                string = u.LJJIFFI(this.itemView.getContext().getResources().getQuantityString(2131755168, (int) j, Long.valueOf(j)), String.valueOf(j), C1176850gjL.LIZ(1, Long.valueOf(j), CardStruct.IStatusCode.DEFAULT).toString(), false);
            } else {
                string = this.itemView.getContext().getString(2131821185);
            }
        } else {
            string = this.itemView.getContext().getString(2131821186);
        }
        textView.setText(string);
        int i2 = newFaceStickerBean2.moderationStatus;
        Context context = this.itemView.getContext();
        if (context != null && (tuxTag = (TuxTag) this.itemView.findViewById(R.id.mld)) != null) {
            if (i2 != 2) {
                if (i2 != 4) {
                    C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.desc), 0);
                    C786410Ut5.LLZLLIL(tuxTag, 8);
                } else {
                    C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.desc), 8);
                    C786410Ut5.LLZLLIL(tuxTag, 0);
                    tuxTag.setText(2131821176);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zs, context);
                    if (numLIZJ != null) {
                        tuxTag.setTagBackgroundColor(numLIZJ.intValue());
                    }
                }
            } else {
                C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.desc), 8);
                C786410Ut5.LLZLLIL(tuxTag, 0);
                tuxTag.setText(2131821186);
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a16, context);
                if (numLIZJ2 != null) {
                    tuxTag.setTagBackgroundColor(numLIZJ2.intValue());
                }
            }
        }
        ((SmartImageView) this.itemView.findViewById(R.id.jxe)).setPlaceholderImage(this.LLJJI.LIZ(this.itemView.getContext()));
        ((SmartImageView) this.itemView.findViewById(R.id.jzb)).setPlaceholderImage(this.LLJJIII.LIZ(this.itemView.getContext()));
        Iterator it2 = C1697810uHb.LJIIJJI(this.itemView.findViewById(R.id.title), this.itemView.findViewById(R.id.jxe), this.itemView.findViewById(R.id.jzb), this.itemView).iterator();
        while (it2.hasNext()) {
            C786410Ut5.I7(new ACListenerS124S0200000_21(newFaceStickerBean2, this, 44), (View) it2.next());
        }
        if (newFaceStickerBean2.relatedAweme != null) {
            C786410Ut5.I7(new ACListenerS124S0200000_21(newFaceStickerBean2, this, 45), this.itemView);
            if (C1620160sGM.LIZLLL((SmartImageView) this.itemView.findViewById(R.id.cover), ((NewFaceStickerBean) this.LLILLJJLI).relatedAweme.getVideo(), this.LLJILJILJ, false, false, 248)) {
                ((SmartImageView) this.itemView.findViewById(R.id.cover)).setAttached(true);
                ((SmartImageView) this.itemView.findViewById(R.id.cover)).LJI();
            } else {
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(((NewFaceStickerBean) this.LLILLJJLI).relatedAweme.getVideo().getCover()));
                c1331670kl3LJIIIIZZ.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.cover));
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            }
            C786410Ut5.LLFF(0, (SmartImageView) this.itemView.findViewById(R.id.jxe));
            C786410Ut5.LLFF(4, (SmartImageView) this.itemView.findViewById(R.id.jzb));
            C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(newFaceStickerBean2.iconUrl));
            c1331670kl3LJIIIIZZ2.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.jxe));
            C786410Ut5.h3(c1331670kl3LJIIIIZZ2);
        } else {
            C1331670kl3 c1331670kl3LJIIIIZZ3 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(newFaceStickerBean2.iconUrl));
            c1331670kl3LJIIIIZZ3.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.cover));
            c1331670kl3LJIIIIZZ3.LJJ = EnumC1338240kve.CENTER_CROP;
            c1331670kl3LJIIIIZZ3.LJJIJIL(new C0I7W(0.4f, 20, this.itemView.getContext()));
            C786410Ut5.h3(c1331670kl3LJIIIIZZ3);
            C786410Ut5.LLFF(4, (SmartImageView) this.itemView.findViewById(R.id.jxe));
            C786410Ut5.LLFF(0, (SmartImageView) this.itemView.findViewById(R.id.jzb));
            C1331670kl3 c1331670kl3LJIIIIZZ4 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(newFaceStickerBean2.iconUrl));
            c1331670kl3LJIIIIZZ4.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.jzb));
            C786410Ut5.h3(c1331670kl3LJIIIIZZ4);
        }
        if (newFaceStickerBean2.getFeatureVideoSource() == EnumC1397990mU1.TOP_LIKED) {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.f8f), 0);
            TextView textView2 = (TextView) this.itemView.findViewById(R.id.f8f);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLJILLL);
            sbLIZ.append(newFaceStickerBean2.relatedAweme.getAuthor().getUniqueId());
            textView2.setText(C2188811AlT.LIZIZ(sbLIZ));
        } else {
            C786410Ut5.LLLLZLL((TuxTextView) this.itemView.findViewById(R.id.f8f), 8);
        }
        C1253930ijf c1253930ijf = C1253930ijf.LIZ;
        C2344009Gk c2344009GkX5 = X5(newFaceStickerBean2);
        c1253930ijf.getClass();
        C20684815ws.LJIILLIIL("prop_card_show", c2344009GkX5.LIZ);
        if (newFaceStickerBean2.isTopEffect) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            int[] iArr = new int[4];
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.n4, this.itemView.getContext());
            int iIntValue4 = -1;
            if (numLIZJ3 != null) {
                iIntValue = numLIZJ3.intValue();
            } else {
                iIntValue = -1;
            }
            iArr[0] = iIntValue;
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.tq, this.itemView.getContext());
            if (numLIZJ4 != null) {
                iIntValue2 = numLIZJ4.intValue();
            } else {
                iIntValue2 = -1;
            }
            iArr[1] = iIntValue2;
            Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.n4, this.itemView.getContext());
            if (numLIZJ5 != null) {
                iIntValue3 = numLIZJ5.intValue();
            } else {
                iIntValue3 = -1;
            }
            iArr[2] = iIntValue3;
            Integer numLIZJ6 = C1308910kAL.LIZJ(R.attr.tq, this.itemView.getContext());
            if (numLIZJ6 != null) {
                iIntValue4 = numLIZJ6.intValue();
            }
            iArr[3] = iIntValue4;
            gradientDrawable.setColors(iArr);
            gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(2));
            if (C444960Hcc.LIZJ(this.itemView.getContext())) {
                orientation = GradientDrawable.Orientation.RIGHT_LEFT;
            } else {
                orientation = GradientDrawable.Orientation.LEFT_RIGHT;
            }
            gradientDrawable.setOrientation(orientation);
            this.itemView.findViewById(R.id.y_v).setBackground(gradientDrawable);
            C339190DRl.LIZLLL(this.itemView.findViewById(R.id.y_v));
            C786410Ut5.I7(new AkS59S0200000_21(newFaceStickerBean2, this, 5), this.itemView.findViewById(R.id.y_v));
            InterfaceC1398040mU6 interfaceC1398040mU6 = this.LLJILJIL;
            if (interfaceC1398040mU6 != null && interfaceC1398040mU6.LIZ()) {
                C1253930ijf.LJIJ(newFaceStickerBean2.effectId, this.LLJI);
                return;
            }
            return;
        }
        C339190DRl.LIZIZ(this.itemView.findViewById(R.id.y_v));
    }

    public static void W5(C2344009Gk c2344009Gk, MobileEffect mobileEffect) {
        FromGroupPropService fromGroupPropService = (FromGroupPropService) ServiceManager.get().getService(FromGroupPropService.class);
        if (fromGroupPropService != null) {
            c2344009Gk.LJFF("from_group_id_prop_list", fromGroupPropService.LIZJ());
            c2344009Gk.LJFF("from_group_id_prop_resource_list", fromGroupPropService.LIZLLL());
        }
        if (mobileEffect != null) {
            c2344009Gk.LJFF("resource_id", mobileEffect.getResourceId());
        }
    }

    public EffectProfileViewHolder(ViewGroup viewGroup, boolean z, C01GW<String> c01gw, InterfaceC1398040mU6 interfaceC1398040mU6) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ecj, viewGroup, false));
        this.LLJI = z;
        this.LLJIJIL = c01gw;
        this.LLJILJIL = interfaceC1398040mU6;
        this.LLJILJILJ = "EffectProfileViewHolder";
        this.LLJILLL = e3.g;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(EffectProfileListViewModel.class);
        this.LLJJ = C452501pT.LIZIZ(new AwS270S0300000_26(this, c19719912DlLIZ, c19719912DlLIZ, 99));
        Size size = new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)));
        getClass();
        this.LLJJI = a6(size);
        Size size2 = new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(72)));
        getClass();
        this.LLJJIII = a6(size2);
        this.LLJJIJI = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(415));
        Size size3 = new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6));
        Size size4 = new Size(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        ViewGroup.LayoutParams layoutParams = this.itemView.findViewById(R.id.jzb).getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = size3.getWidth();
            layoutParams.height = size3.getHeight();
            C786410Ut5.G6((SmartImageView) this.itemView.findViewById(R.id.jzb), layoutParams);
        }
        ((C1331070kk5) ((C1322090kVb) this.itemView.findViewById(R.id.jzb)).getHierarchy()).LJJIII(C1331100kk8.LIZLLL(iLIZIZ3));
        this.LLJJIII = a6(size3);
        ViewGroup.LayoutParams layoutParams2 = this.itemView.findViewById(R.id.jxe).getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = size4.getWidth();
            layoutParams2.height = size4.getHeight();
            C786410Ut5.G6((SmartImageView) this.itemView.findViewById(R.id.jxe), layoutParams2);
        }
        ((C1331070kk5) ((C1322090kVb) this.itemView.findViewById(R.id.jxe)).getHierarchy()).LJJIII(C1331100kk8.LIZLLL(iLIZIZ));
        this.LLJJI = a6(size4);
        ((TuxTextView) this.itemView.findViewById(R.id.title)).setTuxFont(62);
        ((TuxTextView) this.itemView.findViewById(R.id.desc)).setTuxFont(82);
        this.itemView.findViewById(R.id.cen).setPadding(iLIZIZ2, iLIZIZ2, iLIZIZ2, iLIZIZ2);
    }
}
