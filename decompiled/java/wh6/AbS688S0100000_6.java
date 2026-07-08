package wh6;

import X.AbstractViewOnClickListenerC1637610siV;
import X.C0H7B;
import X.C0HIA;
import X.C0IE5;
import X.C1169160gWw;
import X.C1189060h32;
import X.C1558360qeg;
import X.C1558520qew;
import X.C19EG;
import X.C20684815ws;
import X.C2344009Gk;
import X.C431640GwE;
import X.C431700GwK;
import X.C433740Gzc;
import X.C435410H5n;
import X.C682190QpN;
import X.C724240Sb0;
import X.C946803n0;
import X.EnumC431710GwL;
import X.EnumC442690HXn;
import X.InterfaceC1631620sYq;
import X.InterfaceC2217461Bqa;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.mix.createmix.GuideCreateFragment;
import com.ss.android.ugc.aweme.poi.commonalbum.ui.ITTLSPhotoAbility;
import com.ss.android.ugc.aweme.poi.commonalbum.ui.LocalServiceAlbumCell;
import com.ss.android.ugc.aweme.poi.commonalbum.ui.LocalServicePhotoCell;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.text.ui.SearchTop1CardMarkdownAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.top1.text.ui.SearchTop1CardTextAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS372S0200000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.AwS597S0100000_18;
import kotlin.jvm.internal.AwS620S0100000_6;

/* JADX INFO: loaded from: classes7.dex */
public class AbS688S0100000_6 extends AbstractViewOnClickListenerC1637610siV {
    public final int $t;
    public Object l0;

    @Override // X.AbstractViewOnClickListenerC1637610siV
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            case 5:
                LIZ$5(this, view);
                break;
            case 6:
                LIZ$6(this, view);
                break;
            case 7:
                LIZ$7(this, view);
                break;
            case 8:
                LIZ$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZ$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZ$10(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbS688S0100000_6(Object obj, int i) {
        super(300L);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(AbS688S0100000_6 abS688S0100000_6, View view) {
        if (view != null) {
            ((Function1) abS688S0100000_6.l0).invoke(view);
        }
    }

    public static final void LIZ$1(AbS688S0100000_6 abS688S0100000_6, View view) {
        if (view != null) {
            AssemVMLazy assemVMLazy = ((GuideCreateFragment) abS688S0100000_6.l0).LLILZLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GuideCreateFragment.LLJI;
            assemVMLazy.getValue().setState(new AwS597S0100000_18(EnumC442690HXn.CREATE_NAME, 1080));
            C1169160gWw c1169160gWw = C1169160gWw.LIZ;
            GuideCreateFragment guideCreateFragment = (GuideCreateFragment) abS688S0100000_6.l0;
            String str = guideCreateFragment.LLIZ;
            String str2 = guideCreateFragment.LLIZLLLIL;
            c1169160gWw.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", str);
            c2344009Gk.LJIIIIZZ("enter_method", str2);
            C20684815ws.LJIILLIIL("start_first_playlist", c2344009Gk.LIZ);
        }
    }

    public static final void LIZ$10(AbS688S0100000_6 abS688S0100000_6, View view) {
        if (view != null) {
            ((Function1) abS688S0100000_6.l0).invoke(view);
        }
    }

    public static final void LIZ$2(AbS688S0100000_6 abS688S0100000_6, View view) {
        C433740Gzc item;
        ITTLSPhotoAbility iTTLSPhotoAbility;
        boolean z;
        Function1<C433740Gzc, Unit> function1;
        if (view != null && (item = ((LocalServiceAlbumCell) abS688S0100000_6.l0).getItem()) != null) {
            C433740Gzc item2 = ((LocalServiceAlbumCell) abS688S0100000_6.l0).getItem();
            if (item2 != null && (function1 = item2.LLILLL) != null) {
                function1.invoke(item);
            }
            Fragment fragmentLJIIJ = C1189060h32.LJIIJ((LocalServiceAlbumCell) abS688S0100000_6.l0);
            if (fragmentLJIIJ != null && (iTTLSPhotoAbility = (ITTLSPhotoAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), ITTLSPhotoAbility.class, null)) != null) {
                C433740Gzc item3 = ((LocalServiceAlbumCell) abS688S0100000_6.l0).getItem();
                if (item3 != null) {
                    z = item3.LLILZ;
                } else {
                    z = false;
                }
                iTTLSPhotoAbility.Bt1(z, item.LL);
            }
        }
    }

    public static final void LIZ$3(AbS688S0100000_6 abS688S0100000_6, View view) {
        MediaModel mediaModel;
        Fragment fragmentLJIIJ;
        ITTLSPhotoAbility iTTLSPhotoAbility;
        MediaModel mediaModel2;
        Fragment fragmentLJIIJ2;
        ITTLSPhotoAbility iTTLSPhotoAbility2;
        if (view != null) {
            C0H7B item = ((LocalServicePhotoCell) abS688S0100000_6.l0).getItem();
            boolean z = false;
            if (item != null && item.LLILLL) {
                z = true;
            }
            if (z) {
                C0H7B item2 = ((LocalServicePhotoCell) abS688S0100000_6.l0).getItem();
                if (item2 != null && (mediaModel2 = item2.LLILLJJLI) != null && (fragmentLJIIJ2 = C1189060h32.LJIIJ((LocalServicePhotoCell) abS688S0100000_6.l0)) != null && (iTTLSPhotoAbility2 = (ITTLSPhotoAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ2, null), ITTLSPhotoAbility.class, null)) != null) {
                    iTTLSPhotoAbility2.WW1(mediaModel2);
                    return;
                }
                return;
            }
            C0H7B item3 = ((LocalServicePhotoCell) abS688S0100000_6.l0).getItem();
            if (item3 == null || (mediaModel = item3.LLILLJJLI) == null || (fragmentLJIIJ = C1189060h32.LJIIJ((LocalServicePhotoCell) abS688S0100000_6.l0)) == null || (iTTLSPhotoAbility = (ITTLSPhotoAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJIIJ, null), ITTLSPhotoAbility.class, null)) == null) {
                return;
            }
            iTTLSPhotoAbility.vK0(mediaModel);
        }
    }

    public static final void LIZ$4(AbS688S0100000_6 abS688S0100000_6, View view) {
        boolean z;
        InterfaceC1631620sYq<? super View, ? super Boolean, ? super Boolean, Unit> interfaceC1631620sYq;
        EnumC431710GwL enumC431710GwL;
        InterfaceC1631620sYq<? super View, ? super Boolean, ? super Boolean, Unit> interfaceC1631620sYq2;
        InterfaceC1631620sYq<? super View, ? super Boolean, ? super Boolean, Unit> interfaceC1631620sYq3;
        if (view != null) {
            C435410H5n c435410H5nOp = ((SearchTop1CardMarkdownAssem) abS688S0100000_6.l0).op();
            if (c435410H5nOp != null && c435410H5nOp.LLILLL) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C435410H5n c435410H5nOp2 = ((SearchTop1CardMarkdownAssem) abS688S0100000_6.l0).op();
                if (c435410H5nOp2 != null && (interfaceC1631620sYq3 = c435410H5nOp2.LLILZ) != null) {
                    interfaceC1631620sYq3.invoke(view, null, null);
                    return;
                }
                return;
            }
            if (((SearchTop1CardMarkdownAssem) abS688S0100000_6.l0).sp().LLJJLIIIJLLLLLLLZ != null) {
                C435410H5n c435410H5nOp3 = ((SearchTop1CardMarkdownAssem) abS688S0100000_6.l0).op();
                if (c435410H5nOp3 == null || (enumC431710GwL = c435410H5nOp3.LLILLJJLI) == null) {
                    return;
                }
                int i = C431700GwK.LIZ[enumC431710GwL.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    ((SearchTop1CardMarkdownAssem) abS688S0100000_6.l0).sp().LJJJJLL(new AwS372S0200000_6((SearchTop1CardMarkdownAssem) abS688S0100000_6.l0, view, 16));
                    return;
                }
                C19EG c19egLIZ = C724240Sb0.LIZ((SearchTop1CardMarkdownAssem) abS688S0100000_6.l0);
                if (c19egLIZ != null) {
                    C682190QpN c682190QpN = C682190QpN.LIZ;
                    Fragment fragmentLIZ = C946803n0.LIZ(((SearchTop1CardMarkdownAssem) abS688S0100000_6.l0).LJJIJL());
                    SearchTop1CardMarkdownAssem searchTop1CardMarkdownAssem = (SearchTop1CardMarkdownAssem) abS688S0100000_6.l0;
                    String str = searchTop1CardMarkdownAssem.LLJLL;
                    C0IE5 c0ie5 = new C0IE5(searchTop1CardMarkdownAssem, 2);
                    AwS620S0100000_6 awS620S0100000_6 = new AwS620S0100000_6((SearchTop1CardMarkdownAssem) abS688S0100000_6.l0, 50);
                    AwS585S0100000_6 awS585S0100000_6 = new AwS585S0100000_6((SearchTop1CardMarkdownAssem) abS688S0100000_6.l0, 147);
                    c682190QpN.getClass();
                    C682190QpN.LIZIZ(fragmentLIZ, c19egLIZ, str, "", c0ie5, awS620S0100000_6, awS585S0100000_6);
                }
                C435410H5n c435410H5nOp4 = ((SearchTop1CardMarkdownAssem) abS688S0100000_6.l0).op();
                if (c435410H5nOp4 == null || (interfaceC1631620sYq2 = c435410H5nOp4.LLILZ) == null) {
                    return;
                }
                interfaceC1631620sYq2.invoke(view, Boolean.TRUE, null);
                return;
            }
            C435410H5n c435410H5nOp5 = ((SearchTop1CardMarkdownAssem) abS688S0100000_6.l0).op();
            if (c435410H5nOp5 == null || (interfaceC1631620sYq = c435410H5nOp5.LLILZ) == null) {
                return;
            }
            interfaceC1631620sYq.invoke(view, Boolean.FALSE, null);
        }
    }

    public static final void LIZ$5(AbS688S0100000_6 abS688S0100000_6, View view) {
        boolean z;
        InterfaceC1631620sYq<? super View, ? super Boolean, ? super Boolean, Unit> interfaceC1631620sYq;
        EnumC431710GwL enumC431710GwL;
        InterfaceC1631620sYq<? super View, ? super Boolean, ? super Boolean, Unit> interfaceC1631620sYq2;
        InterfaceC1631620sYq<? super View, ? super Boolean, ? super Boolean, Unit> interfaceC1631620sYq3;
        if (view != null) {
            C435410H5n c435410H5nOp = ((SearchTop1CardTextAssem) abS688S0100000_6.l0).op();
            if (c435410H5nOp != null && c435410H5nOp.LLILLL) {
                z = true;
            } else {
                z = false;
            }
            EnumC431710GwL enumC431710GwL2 = null;
            if (!z) {
                C435410H5n c435410H5nOp2 = ((SearchTop1CardTextAssem) abS688S0100000_6.l0).op();
                if (c435410H5nOp2 != null && (interfaceC1631620sYq3 = c435410H5nOp2.LLILZ) != null) {
                    interfaceC1631620sYq3.invoke(view, null, null);
                    return;
                }
                return;
            }
            if (((C431640GwE) ((SearchTop1CardTextAssem) abS688S0100000_6.l0).LLJLIL.getValue()).LLJJL != null) {
                C435410H5n c435410H5nOp3 = ((SearchTop1CardTextAssem) abS688S0100000_6.l0).op();
                if (c435410H5nOp3 != null) {
                    enumC431710GwL = c435410H5nOp3.LLILLJJLI;
                } else {
                    enumC431710GwL = null;
                }
                if (enumC431710GwL == EnumC431710GwL.VIEW_ALL) {
                    C19EG c19egLIZ = C724240Sb0.LIZ((SearchTop1CardTextAssem) abS688S0100000_6.l0);
                    if (c19egLIZ != null) {
                        C682190QpN c682190QpN = C682190QpN.LIZ;
                        Fragment fragmentLIZ = C946803n0.LIZ(((SearchTop1CardTextAssem) abS688S0100000_6.l0).LJJIJL());
                        SearchTop1CardTextAssem searchTop1CardTextAssem = (SearchTop1CardTextAssem) abS688S0100000_6.l0;
                        String str = searchTop1CardTextAssem.LLJZIJLIL;
                        String str2 = searchTop1CardTextAssem.LLJZ;
                        C0IE5 c0ie5 = new C0IE5(searchTop1CardTextAssem, 3);
                        AwS620S0100000_6 awS620S0100000_6 = new AwS620S0100000_6((SearchTop1CardTextAssem) abS688S0100000_6.l0, 51);
                        AwS585S0100000_6 awS585S0100000_6 = new AwS585S0100000_6((SearchTop1CardTextAssem) abS688S0100000_6.l0, 148);
                        c682190QpN.getClass();
                        C682190QpN.LIZIZ(fragmentLIZ, c19egLIZ, str2, str, c0ie5, awS620S0100000_6, awS585S0100000_6);
                    }
                    C435410H5n c435410H5nOp4 = ((SearchTop1CardTextAssem) abS688S0100000_6.l0).op();
                    if (c435410H5nOp4 == null || (interfaceC1631620sYq2 = c435410H5nOp4.LLILZ) == null) {
                        return;
                    }
                    interfaceC1631620sYq2.invoke(view, Boolean.TRUE, null);
                    return;
                }
                C435410H5n c435410H5nOp5 = ((SearchTop1CardTextAssem) abS688S0100000_6.l0).op();
                if (c435410H5nOp5 != null) {
                    enumC431710GwL2 = c435410H5nOp5.LLILLJJLI;
                }
                if (enumC431710GwL2 != EnumC431710GwL.SEE_MORE) {
                    return;
                }
                C431640GwE c431640GwE = (C431640GwE) ((SearchTop1CardTextAssem) abS688S0100000_6.l0).LLJLIL.getValue();
                AwS372S0200000_6 awS372S0200000_6 = new AwS372S0200000_6((SearchTop1CardTextAssem) abS688S0100000_6.l0, view, 17);
                if (!c431640GwE.LLJLILLLLZIIL) {
                    return;
                }
                if (c431640GwE.LLJJLIIIJLLLLLLLZ) {
                    c431640GwE.LLJL = true;
                    c431640GwE.setText(c431640GwE.LLJJJJLIIL);
                    awS372S0200000_6.invoke(Boolean.FALSE);
                    return;
                } else {
                    c431640GwE.LLJL = false;
                    c431640GwE.setText(c431640GwE.LLJJJJLIIL);
                    awS372S0200000_6.invoke(Boolean.TRUE);
                    return;
                }
            }
            C435410H5n c435410H5nOp6 = ((SearchTop1CardTextAssem) abS688S0100000_6.l0).op();
            if (c435410H5nOp6 == null || (interfaceC1631620sYq = c435410H5nOp6.LLILZ) == null) {
                return;
            }
            interfaceC1631620sYq.invoke(view, Boolean.FALSE, null);
        }
    }

    public static final void LIZ$6(AbS688S0100000_6 abS688S0100000_6, View view) {
        C0HIA c0hia;
        Function1<Aweme, Unit> function1;
        if (view != null && (function1 = (c0hia = (C0HIA) abS688S0100000_6.l0).LLILZ) != null) {
            function1.invoke(c0hia.LL);
        }
    }

    public static final void LIZ$7(AbS688S0100000_6 abS688S0100000_6, View view) {
        if (view != null) {
            ((Function0) abS688S0100000_6.l0).invoke();
        }
    }

    public static final void LIZ$8(AbS688S0100000_6 abS688S0100000_6, View view) {
        if (view != null) {
            ((Function0) abS688S0100000_6.l0).invoke();
        }
    }

    public static final void LIZ$9(AbS688S0100000_6 abS688S0100000_6, View view) {
        if (view != null) {
            ((Function1) abS688S0100000_6.l0).invoke(view);
        }
    }
}
