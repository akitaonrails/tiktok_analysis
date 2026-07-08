package com.ss.android.ugc.aweme.music.v2.assem;

import X.C019F;
import X.C01GW;
import X.C0P45;
import X.C1076010e6h;
import X.C12ES;
import X.C13LE;
import X.C14EU;
import X.C1529590puH;
import X.C1537060q6K;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1637806bA;
import X.C1637906bB;
import X.C1697810uHb;
import X.C19719912Dl;
import X.C20684815ws;
import X.C2217381BqS;
import X.C2344009Gk;
import X.C298510Bmz;
import X.C384050F3z;
import X.C416750GVt;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C426750GoL;
import X.C452501pT;
import X.C486890J7n;
import X.C629990OnN;
import X.C630140Onc;
import X.C630180Ong;
import X.C630310Ont;
import X.C630900Ooq;
import X.C630930Oot;
import X.C630970Oox;
import X.C631000Op0;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C814420VxA;
import X.C888460YtI;
import X.InterfaceC1631620sYq;
import X.InterfaceC2217461Bqa;
import Y.AObserverS213S0100000_9;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ReplacementSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.dynamic.DynamicAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.ui.EditOriginMusicTitleActivity;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDescAssem;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicDetailViewModel;
import com.ss.android.ugc.aweme.music.v2.viewmodel.MusicPlayViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import irm.AkS54S0200000_9;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AFwS240S0000000_9;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS623S0100000_9;
import kotlin.jvm.internal.AwS658S0100000_9;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicDescAssem extends DynamicAssem implements MusicEditPageAbility {
    public static final C630180Ong LLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLF;
    public final AssemVMLazy LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public C630930Oot LLJJJ;
    public MusicDetail LLJJJIL;
    public Music LLJJJJ;
    public boolean LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public View LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public TuxTextView LLJL;
    public String LLJLIL;
    public C630140Onc LLJLILLLLZIIL;
    public boolean LLJLL;
    public final C01GW<C629990OnN> LLJLLIL;
    public final AssemVMLazy LLJLLL;
    public final C01GW LLJZ;
    public final C01GW LLJZIJLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MusicDescAssem.class, "musicDetailVM", "getMusicDetailVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicDetailViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLF = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(MusicDescAssem.class, "musicPlayVM", "getMusicPlayVM()Lcom/ss/android/ugc/aweme/music/v2/viewmodel/MusicPlayViewModel;", 0)};
        LLL = new C630180Ong();
    }

    public MusicDescAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MusicDetailViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ, 1240), AFwS240S0000000_9.get$arr$(524), null, true);
        this.LLJJIII = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1239));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1236));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1235));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1242));
        this.LLJLLIL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1238));
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MusicPlayViewModel.class);
        this.LLJLLL = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS553S0100000_9(c19719912DlLIZ2, 1241), AFwS240S0000000_9.get$arr$(525), null, true);
        this.LLJZ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1237));
        this.LLJZIJLIL = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(255));
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.dq6;
    }

    @Override // com.ss.android.ugc.aweme.music.v2.assem.MusicEditPageAbility
    public final void hZ1() throws Throwable {
        Music music = this.LLJJJJ;
        if (music == null) {
            return;
        }
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setEventName("edit_title");
        mobClickObtain.setLabelName("song_cover");
        mobClickObtain.setValue(String.valueOf(music.getId()));
        C20684815ws.onEvent(mobClickObtain);
        MobClick mobClickObtain2 = MobClick.obtain();
        mobClickObtain2.setEventName("original_title_click");
        mobClickObtain2.setLabelName("original_music");
        C20684815ws.onEvent(mobClickObtain2);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZLLL(music.getId(), "music_id");
        c2344009Gk.LJIIIIZZ("enter_from", "single_song");
        C20684815ws.LJIILLIIL("click_edit_sound_name", c2344009Gk.LIZ);
        Intent intent = new Intent(getContext(), (Class<?>) EditOriginMusicTitleActivity.class);
        intent.putExtra("MUSIC_TITLE", String.valueOf(music.getId()));
        C724240Sb0.LJIIIIZZ(this, getParent(), intent, 0, null, new InterfaceC1631620sYq<Integer, Integer, Intent, Unit>() { // from class: X.0Onh
            @Override // X.InterfaceC1631620sYq
            public final Unit invoke(Integer num, Integer num2, Intent intent2) {
                CharSequence text;
                num.intValue();
                Intent intent3 = intent2;
                if (num2.intValue() == -1 && intent3 != null) {
                    String string = null;
                    try {
                        String stringExtra = intent3.getStringExtra("MUSIC_TITLE");
                        if (stringExtra != null) {
                            MusicDescAssem musicDescAssem = this.LL;
                            TuxTextView tuxTextView = musicDescAssem.LLJJJJLIIL;
                            if (tuxTextView != null && (text = tuxTextView.getText()) != null) {
                                string = text.toString();
                            }
                            if (!Intrinsics.LJFF(stringExtra, string) && C297090Bkh.LIZ()) {
                                C632130Oqp.LIZ.getClass();
                                C632130Oqp.LIZ();
                            }
                            TuxTextView tuxTextView2 = musicDescAssem.LLJJJJLIIL;
                            if (tuxTextView2 != null) {
                                tuxTextView2.setText(stringExtra);
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                return Unit.LIZ;
            }
        });
    }

    public final MusicDetailViewModel lp() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLF;
        return (MusicDetailViewModel) assemVMLazy.getValue();
    }

    public final MusicPlayViewModel op() {
        AssemVMLazy assemVMLazy = this.LLJLLL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLF;
        return (MusicPlayViewModel) assemVMLazy.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        super.onDestroy();
        if (this.LLJLILLLLZIIL != null) {
            C1537060q6K c1537060q6K = C1529590puH.LIZ;
            C1537060q6K.LJIILL("lynx_music_card");
        }
        if (this.LLJLLIL.isInitialized()) {
            EventBus.LIZLLL().LJJI(this.LLJLLIL.getValue());
        }
        EventBus.LIZLLL().LJJI(this);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        if (fragmentLJI != null) {
            C1558520qew.LJIIJJI(C1558360qeg.LJFF(fragmentLJI, null), MusicEditPageAbility.class, null);
        }
    }

    public static Pair mp(Music music) {
        if (C630310Ont.LIZIZ(music)) {
            return C630970Oox.LIZ(music);
        }
        return C630970Oox.LIZIZ(music);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBlockUserEvent(C888460YtI c888460YtI) {
        User user;
        Music music;
        C630930Oot c630930Oot;
        FragmentManager fragmentManager;
        if (c888460YtI != null && (user = c888460YtI.LIZ) != null && (music = this.LLJJJJ) != null) {
            Pair pairMp = mp(music);
            C630930Oot c630930Oot2 = this.LLJJJ;
            if (c630930Oot2 != null && c630930Oot2.getVisibility() == 0 && ((Boolean) pairMp.getFirst()).booleanValue() && C631000Op0.LIZ(user, (List) pairMp.getSecond()) && (c630930Oot = this.LLJJJ) != null) {
                List<? extends MusicOwnerInfo> list = (List) pairMp.getSecond();
                Fragment fragmentLJI = C724240Sb0.LJI(this);
                if (fragmentLJI != null) {
                    fragmentManager = fragmentLJI.getFragmentManager();
                } else {
                    fragmentManager = null;
                }
                c630930Oot.LIZ(list, fragmentManager, this.LLJJJJ);
            }
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onUnBlockUserEvent(C486890J7n c486890J7n) {
        User user;
        Music music;
        C630930Oot c630930Oot;
        FragmentManager fragmentManager;
        if (c486890J7n != null && (user = c486890J7n.LIZ) != null && (music = this.LLJJJJ) != null) {
            Pair pairMp = mp(music);
            C630930Oot c630930Oot2 = this.LLJJJ;
            if (c630930Oot2 != null && c630930Oot2.getVisibility() == 0 && ((Boolean) pairMp.getFirst()).booleanValue() && C631000Op0.LIZJ(user, (List) pairMp.getSecond()) && (c630930Oot = this.LLJJJ) != null) {
                List<? extends MusicOwnerInfo> list = (List) pairMp.getSecond();
                Fragment fragmentLJI = C724240Sb0.LJI(this);
                if (fragmentLJI != null) {
                    fragmentManager = fragmentLJI.getFragmentManager();
                } else {
                    fragmentManager = null;
                }
                c630930Oot.LIZ(list, fragmentManager, this.LLJJJJ);
            }
        }
    }

    @Override // com.bytedance.assem.arch.dynamic.DynamicAssem, com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        mo127do();
        EventBus.LIZLLL().LJIJJ(this);
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        Bundle arguments = null;
        if (fragmentLJI != null) {
            C1558520qew.LJII(C1558360qeg.LJFF(fragmentLJI, null), this, MusicEditPageAbility.class, null, null);
        }
        MusicPlayViewModel musicPlayViewModelOp = op();
        Fragment fragmentLJI2 = C724240Sb0.LJI(this);
        if (fragmentLJI2 != null) {
            arguments = fragmentLJI2.getArguments();
        }
        musicPlayViewModelOp.LL = arguments;
        op().LLILLJJLI = C724240Sb0.LIZ(this);
        AssemViewModel.asyncSubscribe$default(lp(), new C2217381BqS() { // from class: X.0OnS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C629660Omq) obj).LL;
            }
        }, null, null, null, new AwS375S0200000_9(this, view, 71), 14, null);
        C736680Sv4.LJIIIIZZ(this, op(), new C2217381BqS() { // from class: X.0Oni
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C630370Onz) obj).LL);
            }
        }, null, new AwS623S0100000_9(this, 114), 6);
        C736680Sv4.LJIIIZ(this, (AssemViewModel) this.LLJJIII.getValue(), new C2217381BqS() { // from class: X.0OnJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C629660Omq) obj).LLILZ);
            }
        }, new C2217381BqS() { // from class: X.0OnK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((C629660Omq) obj).LLILLL);
            }
        }, null, new AwS658S0100000_9(this, 13), 12);
        C1076010e6h.LIZJ.LIZIZ().getRelationObservable().observe(this, new AObserverS213S0100000_9(this, 6));
    }

    public final void sp(TuxTextView tuxTextView) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(tuxTextView.getMeasuredWidth(), 1073741824);
        Iterator it2 = C1697810uHb.LJIIJJI(20, 17).iterator();
        while (it2.hasNext()) {
            tuxTextView.LJJJJI(((Number) it2.next()).intValue());
            tuxTextView.measure(iMakeMeasureSpec, 0);
            if (tuxTextView.getLineCount() < 3) {
                tuxTextView.requestLayout();
                return;
            }
        }
    }

    public final void tp(TuxTextView tuxTextView, MusicDetail musicDetail, String str) {
        int iLIZIZ;
        boolean z;
        int i;
        Music music = musicDetail.music;
        if (music == null) {
            return;
        }
        sp(tuxTextView);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        C630900Ooq c630900Ooq = C630900Ooq.LIZ;
        Context context = getContext();
        c630900Ooq.getClass();
        C630900Ooq.LIZ(spannableStringBuilder, music, context, true, false);
        LLL.getClass();
        if (C630180Ong.LIZJ(musicDetail)) {
            C786410Ut5.I7(new AkS54S0200000_9(this, music, 1), tuxTextView);
            ((Paint) this.LLJZIJLIL.getValue()).setTextSize(tuxTextView.getTextSize());
            int iMeasureText = (int) ((Paint) this.LLJZIJLIL.getValue()).measureText(str);
            if (iMeasureText < tuxTextView.getWidth() && iMeasureText + C12ES.LIZJ(28.0f, getContext()) > tuxTextView.getWidth()) {
                z = false;
            } else {
                z = true;
            }
            Context context2 = getContext();
            if (context2 != null) {
                if (op().getState().LL == 1) {
                    i = R.raw.icon_pause_fill;
                } else {
                    i = R.raw.icon_play_fill;
                }
                int iLIZJ = (int) C12ES.LIZJ(20.0f, context2);
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = i;
                c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
                c419910GdJ.LIZIZ = (int) C12ES.LIZJ(10.0f, context2);
                c419910GdJ.LIZJ = (int) C12ES.LIZJ(10.0f, context2);
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context2);
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LJII = iLIZJ;
                c384050F3z.LJI = iLIZJ;
                c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                c384050F3z.LIZJ = Float.valueOf(C12ES.LIZJ(200.0f, context2));
                LayerDrawable layerDrawableLJIILIIL = C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(context2));
                layerDrawableLJIILIIL.setBounds(0, 0, layerDrawableLJIILIIL.getIntrinsicWidth(), layerDrawableLJIILIIL.getIntrinsicHeight());
                SpannableString spannableString = new SpannableString(" T");
                if (z) {
                    final int iLIZJ2 = (int) C12ES.LIZJ(8.0f, context2);
                    C786410Ut5.p2(spannableString, new ReplacementSpan(iLIZJ2) { // from class: X.0GVK
                        public final int LL;

                        @Override // android.text.style.ReplacementSpan
                        public final void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                        }

                        {
                            this.LL = iLIZJ2;
                        }

                        @Override // android.text.style.ReplacementSpan
                        public final int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                            return this.LL;
                        }
                    }, 0, 1, 17);
                }
                C786410Ut5.p2(spannableString, new C416750GVt(layerDrawableLJIILIIL), (spannableString.length() - 2) + 1, spannableString.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
        } else if (!C298510Bmz.LIZ() && C630180Ong.LIZIZ(music)) {
            int iLIZIZ2 = C814420VxA.LIZIZ(tuxTextView.getTextSize());
            if (iLIZIZ2 == C814420VxA.LIZIZ(C418440Gaw.LIZIZ(30))) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
            } else if (iLIZIZ2 != C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24)) && iLIZIZ2 != C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))) {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
            } else {
                iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
            }
            Context context3 = getContext();
            if (context3 != null) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_pen;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.a1h);
                c419910GdJ2.LIZIZ = iLIZIZ;
                c419910GdJ2.LIZJ = iLIZIZ;
                TuxIconDrawable tuxIconDrawableLIZ2 = c419910GdJ2.LIZ(context3);
                tuxIconDrawableLIZ2.setBounds(0, 0, tuxIconDrawableLIZ2.LJII, tuxIconDrawableLIZ2.LJIIIIZZ);
                C416750GVt c416750GVt = new C416750GVt(tuxIconDrawableLIZ2);
                SpannableString spannableString2 = new SpannableString(" T");
                C786410Ut5.p2(spannableString2, c416750GVt, (spannableString2.length() - 2) + 1, spannableString2.length(), 17);
                C786410Ut5.p2(spannableString2, new C0P45(this, 1), spannableString2.getSpanStart(c416750GVt), spannableString2.getSpanEnd(c416750GVt), 34);
                MobClick mobClickObtain = MobClick.obtain();
                mobClickObtain.setEventName("original_title_show");
                mobClickObtain.setLabelName("original_music");
                mobClickObtain.setValue(String.valueOf(music.getId()));
                C20684815ws.onEvent(mobClickObtain);
                spannableStringBuilder.append((CharSequence) spannableString2);
            }
        }
        tuxTextView.setText(spannableStringBuilder);
        String str2 = lp().LLILZ;
        if (!this.LLJJJJJIL) {
            c630900Ooq.getClass();
            this.LLJJJJJIL = C630900Ooq.LIZIZ(music, str2, true);
        }
    }
}
