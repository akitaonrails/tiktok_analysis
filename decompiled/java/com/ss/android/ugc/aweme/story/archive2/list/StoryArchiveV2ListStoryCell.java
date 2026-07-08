package com.ss.android.ugc.aweme.story.archive2.list;

import X.C03IT;
import X.C1157210gDf;
import X.C1173560ge2;
import X.C1173680geE;
import X.C1220000hqw;
import X.C1308910kAL;
import X.C1331660kl2;
import X.C1331670kl3;
import X.C1388580mEq;
import X.C13LE;
import X.C13LP;
import X.C1697810uHb;
import X.C2095008Iq;
import X.C298680BnG;
import X.C384050F3z;
import X.C418440Gaw;
import X.C419910GdJ;
import X.C427760Gpy;
import X.C438710HIf;
import X.C452070Ho5;
import X.C710930Rud;
import X.C724750Sbp;
import X.C726800Sf8;
import X.C729510SjV;
import X.C736950SvV;
import X.C786410Ut5;
import X.C814420VxA;
import X.EnumC429060Gs4;
import X.InterfaceC1891350zJl;
import X.InterfaceC427850Gq7;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.mention.CoverMentionedUserStruct;
import com.ss.android.ugc.aweme.story.archive2.StoryArchiveV2ArchiveViewModel;
import com.zhiliaoapp.musically.R;
import irm.AkS57S0200000_18;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class StoryArchiveV2ListStoryCell extends PowerCell<C1157210gDf> {
    public final C736950SvV LL = new C736950SvV(C13LE.LIZ(StoryArchiveV2ArchiveViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(this), C1220000hqw.LIZ(this), AFwS256S0000000_18.get$arr$(774), null, null, null);

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1173680geE c1173680geE;
        Object objLJJJLL;
        int i;
        long jLongValue;
        UrlModel cover;
        int iIntValue;
        List<String> list;
        int i2;
        final C1157210gDf c1157210gDf = (C1157210gDf) interfaceC1891350zJl;
        super.onBindItemView(c1157210gDf);
        View view = this.itemView;
        view.setLayoutDirection(C1388580mEq.LIZIZ(view.getContext()) ? 1 : 0);
        View viewFindViewById = this.itemView.findViewById(R.id.ffy);
        TextView textView = (TextView) this.itemView.findViewById(R.id.fg2);
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.ok9);
        int iIntValue2 = 0;
        if (C298680BnG.LIZ()) {
            TuxTag tuxTag = (TuxTag) this.itemView.findViewById(R.id.w8w);
            Aweme aweme = ((C1173560ge2) ((AssemViewModel) this.LL.getValue()).getState()).LLILLL.get(c1157210gDf.LLILLJJLI);
            if (aweme != null && aweme.isSubOnlyVideo()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, tuxTag);
            tuxTag.setIconTintColor(-16777216);
            tuxTag.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        }
        C1173560ge2 c1173560ge2 = (C1173560ge2) ((AssemViewModel) this.LL.getValue()).getState();
        if (c1157210gDf.LLILZ) {
            c1173680geE = c1173560ge2.LLILLJJLI;
        } else {
            c1173680geE = c1173560ge2.LL;
        }
        List<String> list2 = c1173680geE.LIZIZ.get(c1157210gDf.LL);
        if (list2 != null) {
            objLJJJLL = C13LP.LJJJLL(list2);
        } else {
            objLJJJLL = null;
        }
        if (Intrinsics.LJFF(objLJJJLL, c1157210gDf.LLILLJJLI)) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        C384050F3z c384050F3z = new C384050F3z();
        if (C1388580mEq.LIZIZ(this.itemView.getContext())) {
            c384050F3z.LJIIJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        } else {
            c384050F3z.LJIIJJI = Float.valueOf(C418440Gaw.LIZIZ(8));
        }
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.zd);
        viewFindViewById.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
        Long lLJIILIIL = C2095008Iq.LJIILIIL(c1157210gDf.LL);
        if (lLJIILIIL != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        long j = jLongValue * 1000;
        textView.setText(new BDDateFormat("D").LIZIZ(j, Locale.getDefault()));
        textView2.setText(new BDDateFormat("MMM").LIZIZ(j, Locale.getDefault()));
        C786410Ut5.I7(new AkS57S0200000_18(c1157210gDf, this, 23), this.itemView);
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.cover);
        C427760Gpy c427760Gpy = (C427760Gpy) this.itemView.findViewById(R.id.bkc);
        Aweme aweme2 = ((C1173560ge2) ((AssemViewModel) this.LL.getValue()).getState()).LLILLL.get(c1157210gDf.LLILLJJLI);
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ("");
        c1331670kl3LJIIIZ.LJJ(smartImageView);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        C786410Ut5.LJLLLLLL(8, c427760Gpy);
        if (aweme2 != null) {
            if (!C726800Sf8.LIZ(aweme2) && !C726800Sf8.LIZIZ(aweme2)) {
                if (C729510SjV.LJIJI(aweme2)) {
                    cover = C710930Rud.LJ(aweme2);
                } else {
                    Video video = aweme2.getVideo();
                    if (video != null) {
                        cover = video.getCover();
                    } else {
                        cover = null;
                    }
                }
                smartImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.br, this.itemView.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                } else {
                    iIntValue = 0;
                }
                smartImageView.setBackgroundColor(iIntValue);
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(cover));
                c1331670kl3LJIIIIZZ.LJJ(smartImageView);
                c1331670kl3LJIIIIZZ.LJIIJ(new InterfaceC427850Gq7() { // from class: X.0geS
                    @Override // X.InterfaceC427850Gq7
                    public final void A3(Uri uri, C428600GrK c428600GrK) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void Bh(Uri uri, View view2) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void cm(Uri uri, View view2, Throwable th) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void e1(Uri uri) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void lg(Uri uri, Throwable th) {
                    }

                    @Override // X.InterfaceC427850Gq7
                    public final void Ad(Uri uri, View view2, C428600GrK c428600GrK, Animatable animatable) {
                        if (c1157210gDf.LLILZ) {
                            return;
                        }
                        StoryArchiveV2ArchiveViewModel storyArchiveV2ArchiveViewModel = (StoryArchiveV2ArchiveViewModel) this.LL.getValue();
                        if (!storyArchiveV2ArchiveViewModel.LLILZLL) {
                            long jCurrentTimeMillis = System.currentTimeMillis() - storyArchiveV2ArchiveViewModel.LLILZIL;
                            C1173900gea.LIZ.getClass();
                            C0LAB c0lab = new C0LAB();
                            c0lab.LIZIZ(jCurrentTimeMillis, "duration_in_ms");
                            C20684815ws.LJIILLIIL("story_archive_first_album_loading_time", c0lab.LIZ);
                            storyArchiveV2ArchiveViewModel.LLILZLL = true;
                        }
                    }
                });
                List<CoverMentionedUserStruct> coverMentionedUserInfos = AwemeExtKt.getCoverMentionedUserInfos(aweme2);
                if (coverMentionedUserInfos == null) {
                    C786410Ut5.LJLLLLLL(8, c427760Gpy);
                    return;
                }
                C786410Ut5.LJLLLLLL(0, c427760Gpy);
                c427760Gpy.setStacking(EnumC429060Gs4.FIRST_ON_TOP);
                int size = coverMentionedUserInfos.size();
                if (size > 3) {
                    size = 3;
                }
                c427760Gpy.setTotalCount(size);
                Iterator it2 = C13LP.LL(coverMentionedUserInfos, 3).iterator();
                while (true) {
                    int i3 = iIntValue2;
                    if (!it2.hasNext()) {
                        return;
                    }
                    Object next = it2.next();
                    iIntValue2++;
                    if (i3 >= 0) {
                        CoverMentionedUserStruct.UrlStruct urlStruct = ((CoverMentionedUserStruct) next).avatar;
                        if (urlStruct != null) {
                            list = urlStruct.urlList;
                        } else {
                            list = null;
                        }
                        C427760Gpy.LIZ(c427760Gpy, i3, new C03IT(list), String.valueOf(i3), null, null, false, null, 2040);
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            } else {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_video_slash_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.zj);
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.itemView.getContext());
                smartImageView.setScaleType(ImageView.ScaleType.CENTER);
                smartImageView.setImageDrawable(tuxIconDrawableLIZ);
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zg, this.itemView.getContext());
                if (numLIZJ2 != null) {
                    iIntValue2 = numLIZJ2.intValue();
                }
                smartImageView.setBackgroundColor(iIntValue2);
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return PowerCell.inflateItemView$default(this, viewGroup, R.layout.fb2, false, 4, null);
    }
}
