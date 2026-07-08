package com.ss.android.ugc.aweme.music.highlight.cell.assem;

import X.C0OY0;
import X.C418440Gaw;
import X.C419980GdQ;
import X.C426750GoL;
import X.C430750Gun;
import X.C631230OpN;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC631610Opz;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultThirdLineAssem;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: loaded from: classes10.dex */
public final class HighlightSelectMusicThirdLineAssem extends DefaultThirdLineAssem {
    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultThirdLineAssem, com.bytedance.assem.arch.reused.ReusedUIAssem
    public final void Eo(View view) {
        super.Eo(view);
        C426750GoL.LJIIIZ(getContentView(), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10))), null, null, false, 29);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.ss.android.ugc.aweme.music.assem.list.cell.v2.DefaultThirdLineAssem
    public final void op(EnumC631610Opz enumC631610Opz, MusicModel musicModel, boolean z, boolean z2) {
        Context context = getContext();
        if (context != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C0OY0.LIZ(musicModel.getPresenterDuration()));
            MusicReleaseInfo musicReleaseInfo = musicModel.getMusicReleaseInfo();
            int i = 0;
            if (musicReleaseInfo != null && musicReleaseInfo.isNewReleaseSong() && 1 != 0) {
                C419980GdQ c419980GdQ = new C419980GdQ(context, null, 0);
                C631230OpN.LIZIZ(c419980GdQ, Float.valueOf(C418440Gaw.LIZIZ(4)));
                c419980GdQ.setFont(72);
                C430750Gun c430750Gun = new C430750Gun(c419980GdQ);
                SpannableString spannableString = new SpannableString(" ");
                C786410Ut5.p2(spannableString, c430750Gun, spannableString.length() - 1, spannableString.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
            if (tuxTextView != null) {
                tuxTextView.setText(spannableStringBuilder);
            }
            TuxTextView tuxTextView2 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxTextView2 != null) {
                if (musicModel.getPresenterDuration() <= 0) {
                    i = 4;
                }
                C786410Ut5.LLLLZLL(tuxTextView2, i);
            }
        }
    }
}
