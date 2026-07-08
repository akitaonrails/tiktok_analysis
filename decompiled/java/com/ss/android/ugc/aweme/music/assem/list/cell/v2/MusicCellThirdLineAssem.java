package com.ss.android.ugc.aweme.music.assem.list.cell.v2;

import X.C0OY0;
import X.C1559260qg8;
import X.C20684815ws;
import X.C418440Gaw;
import X.C419980GdQ;
import X.C430750Gun;
import X.C631230OpN;
import X.C632090Oql;
import X.C723580SZw;
import X.C724270Sb3;
import X.C786410Ut5;
import X.EnumC631610Opz;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.model.MusicReleaseInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class MusicCellThirdLineAssem extends DefaultThirdLineAssem {
    public final C1559260qg8 LLJL = new C1559260qg8(new C723580SZw(this, OriginMusicArg.class, null), checkSupervisorPrepared());

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
        String str;
        Context context = getContext();
        if (context != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C0OY0.LIZ(musicModel.getPresenterDuration()));
            int i = 0;
            Object obj = null;
            if (enumC631610Opz == EnumC631610Opz.PINNED && !z && !z2) {
                C419980GdQ c419980GdQ = new C419980GdQ(context, null, 0);
                C631230OpN.LIZIZ(c419980GdQ, Float.valueOf(C418440Gaw.LIZIZ(4)));
                c419980GdQ.setFont(72);
                c419980GdQ.setText(2131839295);
                C430750Gun c430750Gun = new C430750Gun(c419980GdQ);
                SpannableString spannableString = new SpannableString(" ");
                C786410Ut5.p2(spannableString, c430750Gun, spannableString.length() - 1, spannableString.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            MusicReleaseInfo musicReleaseInfo = musicModel.getMusicReleaseInfo();
            if (musicReleaseInfo != null && musicReleaseInfo.isNewReleaseSong()) {
                C419980GdQ c419980GdQ2 = new C419980GdQ(context, null, 0);
                C631230OpN.LIZIZ(c419980GdQ2, Float.valueOf(C418440Gaw.LIZIZ(4)));
                c419980GdQ2.setFont(72);
                C430750Gun c430750Gun2 = new C430750Gun(c419980GdQ2);
                SpannableString spannableString2 = new SpannableString(" ");
                C786410Ut5.p2(spannableString2, c430750Gun2, spannableString2.length() - 1, spannableString2.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString2);
            }
            MusicReleaseInfo musicReleaseInfo2 = musicModel.getMusicReleaseInfo();
            if (musicReleaseInfo2 != null && musicReleaseInfo2.isNewReleaseSong()) {
                HashMap map = new HashMap();
                OriginMusicArg originMusicArg = (OriginMusicArg) this.LLJL.getValue();
                if (originMusicArg != null && originMusicArg.isMe()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                map.put("enter_from", str);
                map.put("music_id", musicModel.getMusicId());
                map.put("group_id", musicModel.getAwemeId());
                String str2 = "1";
                map.put("music_new_show", "1");
                map.put("location", "music_tab");
                C724270Sb3 c724270Sb3 = this.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                }
                if (!((C632090Oql) obj).getMusicItemModel().isHighlighted()) {
                    str2 = CardStruct.IStatusCode.DEFAULT;
                }
                map.put("highlight", str2);
                C20684815ws.LJIILLIIL("new_release_show", map);
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
