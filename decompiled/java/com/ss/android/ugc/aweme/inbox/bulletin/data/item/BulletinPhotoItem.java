package com.ss.android.ugc.aweme.inbox.bulletin.data.item;

import X.C09CT;
import X.C0OK6;
import X.C13LP;
import X.C786410Ut5;
import X.EnumC1994207rY;
import X.EnumC618810OOx;
import X.InterfaceC1891350zJl;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.inbox.bulletin.data.BulletinCommentUIOverview;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinImage;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BulletinItemBottomStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class BulletinPhotoItem extends BulletinBaseItem {
    public static final /* synthetic */ int LLJLILLLLZIIL = 0;
    public int LLILZLL;
    public final boolean LLIZ;
    public final Long LLIZLLLIL;
    public final boolean LLJ;
    public final BulletinImageInfo LLJI;
    public BulletinImageInfo LLJIJIL;
    public final List<BulletinImage> LLJILJIL;
    public final Long LLJILJILJ;
    public final int LLJILLL;
    public final BaseShortVideoContext LLJJ;
    public final Map<String, String> LLJJI;
    public final boolean LLJJIII;
    public final boolean LLJJIJI;
    public final boolean LLJJIJIIJIL;
    public final int LLJJIJIL;
    public final int LLJJJ;
    public final User LLJJJIL;
    public final boolean LLJJJJ;
    public List<BulletinEmojiItem> LLJJJJJIL;
    public int LLJJJJLIIL;
    public List<InterfaceC1891350zJl> LLJJL;
    public final String LLJJLIIIJLLLLLLLZ;
    public final BulletinItemBottomStruct LLJL;
    public BulletinCommentUIOverview LLJLIL;

    @C09CT("photoCreatorTime")
    public final long creatorTime;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BulletinPhotoItem)) {
            return false;
        }
        BulletinPhotoItem bulletinPhotoItem = (BulletinPhotoItem) obj;
        return this.LLILZLL == bulletinPhotoItem.LLILZLL && this.LLIZ == bulletinPhotoItem.LLIZ && this.creatorTime == bulletinPhotoItem.creatorTime && Intrinsics.LJFF(this.LLIZLLLIL, bulletinPhotoItem.LLIZLLLIL) && this.LLJ == bulletinPhotoItem.LLJ && Intrinsics.LJFF(this.LLJI, bulletinPhotoItem.LLJI) && Intrinsics.LJFF(this.LLJIJIL, bulletinPhotoItem.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, bulletinPhotoItem.LLJILJIL) && Intrinsics.LJFF(this.LLJILJILJ, bulletinPhotoItem.LLJILJILJ) && this.LLJILLL == bulletinPhotoItem.LLJILLL && Intrinsics.LJFF(this.LLJJ, bulletinPhotoItem.LLJJ) && Intrinsics.LJFF(this.LLJJI, bulletinPhotoItem.LLJJI) && this.LLJJIII == bulletinPhotoItem.LLJJIII && this.LLJJIJI == bulletinPhotoItem.LLJJIJI && this.LLJJIJIIJIL == bulletinPhotoItem.LLJJIJIIJIL && this.LLJJIJIL == bulletinPhotoItem.LLJJIJIL && this.LLJJJ == bulletinPhotoItem.LLJJJ && Intrinsics.LJFF(this.LLJJJIL, bulletinPhotoItem.LLJJJIL) && this.LLJJJJ == bulletinPhotoItem.LLJJJJ && Intrinsics.LJFF(this.LLJJJJJIL, bulletinPhotoItem.LLJJJJJIL) && this.LLJJJJLIIL == bulletinPhotoItem.LLJJJJLIIL && Intrinsics.LJFF(this.LLJJL, bulletinPhotoItem.LLJJL) && Intrinsics.LJFF(this.LLJJLIIIJLLLLLLLZ, bulletinPhotoItem.LLJJLIIIJLLLLLLLZ) && Intrinsics.LJFF(this.LLJL, bulletinPhotoItem.LLJL) && Intrinsics.LJFF(this.LLJLIL, bulletinPhotoItem.LLJLIL);
    }

    public final int hashCode() {
        int iZ2 = ((((this.LLILZLL * 31) + C786410Ut5.Z2(this.LLIZ)) * 31) + C786410Ut5.Y2(this.creatorTime)) * 31;
        Long l = this.LLIZLLLIL;
        int iHashCode = (((iZ2 + (l == null ? 0 : l.hashCode())) * 31) + C786410Ut5.Z2(this.LLJ)) * 31;
        BulletinImageInfo bulletinImageInfo = this.LLJI;
        int iHashCode2 = (iHashCode + (bulletinImageInfo == null ? 0 : bulletinImageInfo.hashCode())) * 31;
        BulletinImageInfo bulletinImageInfo2 = this.LLJIJIL;
        int iHashCode3 = (iHashCode2 + (bulletinImageInfo2 == null ? 0 : bulletinImageInfo2.hashCode())) * 31;
        List<BulletinImage> list = this.LLJILJIL;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Long l2 = this.LLJILJILJ;
        int iHashCode5 = (((iHashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31) + this.LLJILLL) * 31;
        BaseShortVideoContext baseShortVideoContext = this.LLJJ;
        int iHashCode6 = (((((((((((((iHashCode5 + (baseShortVideoContext == null ? 0 : baseShortVideoContext.hashCode())) * 31) + this.LLJJI.hashCode()) * 31) + C786410Ut5.Z2(this.LLJJIII)) * 31) + C786410Ut5.Z2(this.LLJJIJI)) * 31) + C786410Ut5.Z2(this.LLJJIJIIJIL)) * 31) + this.LLJJIJIL) * 31) + this.LLJJJ) * 31;
        User user = this.LLJJJIL;
        int iHashCode7 = (((((((((iHashCode6 + (user == null ? 0 : user.hashCode())) * 31) + C786410Ut5.Z2(this.LLJJJJ)) * 31) + this.LLJJJJJIL.hashCode()) * 31) + this.LLJJJJLIIL) * 31) + this.LLJJL.hashCode()) * 31;
        String str = this.LLJJLIIIJLLLLLLLZ;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        BulletinItemBottomStruct bulletinItemBottomStruct = this.LLJL;
        int iHashCode9 = (iHashCode8 + (bulletinItemBottomStruct == null ? 0 : bulletinItemBottomStruct.hashCode())) * 31;
        BulletinCommentUIOverview bulletinCommentUIOverview = this.LLJLIL;
        return iHashCode9 + (bulletinCommentUIOverview != null ? bulletinCommentUIOverview.hashCode() : 0);
    }

    public final String toString() {
        return "BulletinPhotoItem(viewCount=" + this.LLILZLL + ", hasSend=" + this.LLIZ + ", creatorTime=" + this.creatorTime + ", updateTime=" + this.LLIZLLLIL + ", isLocal=" + this.LLJ + ", localImage=" + this.LLJI + ", imageInfo=" + this.LLJIJIL + ", remoteImage=" + this.LLJILJIL + ", id=" + this.LLJILJILJ + ", status=" + this.LLJILLL + ", editModel=" + this.LLJJ + ", eventMap=" + this.LLJJI + ", isFirstInSequence=" + this.LLJJIII + ", isLastInSequence=" + this.LLJJIJI + ", needShowViewCount=" + this.LLJJIJIIJIL + ", groupMaxViewCount=" + this.LLJJIJIL + ", paddingBottom=" + this.LLJJJ + ", publishUser=" + this.LLJJJIL + ", hasRead=" + this.LLJJJJ + ", emojiList=" + this.LLJJJJJIL + ", emojiOrderNum=" + this.LLJJJJLIIL + ", emojiSnapshot=" + this.LLJJL + ", publishFrom=" + this.LLJJLIIIJLLLLLLLZ + ", bottomStruct=" + this.LLJL + ", commentUIOverView=" + this.LLJLIL + ')';
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJLZ() {
        return super.LJLZ() && !LLIIJI(null);
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final BulletinItemBottomStruct LIZIZ() {
        return this.LLJL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final BulletinCommentUIOverview LJIILIIL() {
        return this.LLJLIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final long LJIIZILJ() {
        return this.creatorTime;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final List<BulletinEmojiItem> LJIJJLI() {
        return this.LLJJJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJIL() {
        return this.LLJJJJLIIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final List<InterfaceC1891350zJl> LJJ() {
        return this.LLJJL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Map<String, String> LJJIFFI() {
        return this.LLJJI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJIJL() {
        return this.LLJJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJIJLIJ() {
        return this.LLJJJJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJIL() {
        return this.LLIZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Long LJJJ() {
        return this.LLJILJILJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJJJ() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJJJI() {
        return this.LLJJJ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final String LJJJJLI() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final User LJJJJZI() {
        return this.LLJJJIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJJLIIL() {
        return this.LLJILLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final Long LJJLIIIIJ() {
        return this.LLIZLLLIL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final int LJJLIIIJ() {
        return this.LLILZLL;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJZZIII() {
        return this.LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJLIIIL() {
        return this.LLJJIJI;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final boolean LJJLJ(BulletinBaseItem bulletinBaseItem) {
        if (!(bulletinBaseItem instanceof BulletinPhotoItem)) {
            return false;
        }
        BulletinPhotoItem bulletinPhotoItem = (BulletinPhotoItem) bulletinBaseItem;
        if (this.LLJ == bulletinPhotoItem.LLJ && Intrinsics.LJFF(this.LLJI, bulletinPhotoItem.LLJI) && Intrinsics.LJFF(this.LLJIJIL, bulletinPhotoItem.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, bulletinPhotoItem.LLJILJIL)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LJZ(BulletinCommentUIOverview bulletinCommentUIOverview) {
        this.LLJLIL = bulletinCommentUIOverview;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LJZL(List<BulletinEmojiItem> list) {
        this.LLJJJJJIL = list;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LL(int i) {
        this.LLJJJJLIIL = i;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LLFFF(List<InterfaceC1891350zJl> list) {
        this.LLJJL = list;
    }

    @Override // com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem
    public final void LLIIIJ(int i) {
        this.LLILZLL = i;
    }

    public final boolean LLIIJI(Integer num) {
        BulletinImage bulletinImage;
        if (num == null) {
            num = null;
            if (this.LLJ) {
                BulletinImageInfo bulletinImageInfo = this.LLJI;
                if (bulletinImageInfo != null) {
                    num = bulletinImageInfo.type;
                }
            } else {
                List<BulletinImage> list = this.LLJILJIL;
                if (list != null && (bulletinImage = (BulletinImage) C13LP.LJJJLL(list)) != null) {
                    num = bulletinImage.type;
                }
            }
        }
        int type = EnumC1994207rY.EMOJI.getType();
        if (num != null && num.intValue() == type) {
            return true;
        }
        return false;
    }

    public static BulletinPhotoItem LLIIIL(BulletinPhotoItem bulletinPhotoItem, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, List list, String str, BulletinCommentUIOverview bulletinCommentUIOverview, int i3) {
        int i4;
        long j;
        Long l;
        boolean z5;
        BulletinImageInfo bulletinImageInfo;
        BulletinImageInfo bulletinImageInfo2;
        List<BulletinImage> list2;
        Long l2;
        int i5;
        BaseShortVideoContext baseShortVideoContext;
        Map<String, String> map;
        User user;
        boolean z6;
        List<InterfaceC1891350zJl> list3;
        List list4 = list;
        String str2 = str;
        int i6 = i2;
        boolean z7 = z3;
        boolean z8 = z;
        int i7 = i;
        BulletinCommentUIOverview bulletinCommentUIOverview2 = bulletinCommentUIOverview;
        boolean z9 = z2;
        boolean z10 = z4;
        int i8 = 0;
        if ((i3 & 1) != 0) {
            i4 = bulletinPhotoItem.LLILZLL;
        } else {
            i4 = 0;
        }
        if ((i3 & 2) != 0) {
            z8 = bulletinPhotoItem.LLIZ;
        }
        if ((i3 & 4) != 0) {
            j = bulletinPhotoItem.creatorTime;
        } else {
            j = 0;
        }
        BulletinItemBottomStruct bulletinItemBottomStruct = null;
        if ((i3 & 8) != 0) {
            l = bulletinPhotoItem.LLIZLLLIL;
        } else {
            l = null;
        }
        if ((i3 & 16) != 0) {
            z5 = bulletinPhotoItem.LLJ;
        } else {
            z5 = false;
        }
        if ((i3 & 32) != 0) {
            bulletinImageInfo = bulletinPhotoItem.LLJI;
        } else {
            bulletinImageInfo = null;
        }
        if ((i3 & 64) != 0) {
            bulletinImageInfo2 = bulletinPhotoItem.LLJIJIL;
        } else {
            bulletinImageInfo2 = null;
        }
        if ((i3 & 128) != 0) {
            list2 = bulletinPhotoItem.LLJILJIL;
        } else {
            list2 = null;
        }
        if ((i3 & 256) != 0) {
            l2 = bulletinPhotoItem.LLJILJILJ;
        } else {
            l2 = null;
        }
        if ((i3 & 512) != 0) {
            i5 = bulletinPhotoItem.LLJILLL;
        } else {
            i5 = 0;
        }
        if ((i3 & 1024) != 0) {
            baseShortVideoContext = bulletinPhotoItem.LLJJ;
        } else {
            baseShortVideoContext = null;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            map = bulletinPhotoItem.LLJJI;
        } else {
            map = null;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z9 = bulletinPhotoItem.LLJJIII;
        }
        if ((i3 & 8192) != 0) {
            z7 = bulletinPhotoItem.LLJJIJI;
        }
        if ((i3 & 16384) != 0) {
            z10 = bulletinPhotoItem.LLJJIJIIJIL;
        }
        if ((32768 & i3) != 0) {
            i7 = bulletinPhotoItem.LLJJIJIL;
        }
        if ((65536 & i3) != 0) {
            i6 = bulletinPhotoItem.LLJJJ;
        }
        if ((131072 & i3) != 0) {
            user = bulletinPhotoItem.LLJJJIL;
        } else {
            user = null;
        }
        if ((262144 & i3) != 0) {
            z6 = bulletinPhotoItem.LLJJJJ;
        } else {
            z6 = false;
        }
        if ((524288 & i3) != 0) {
            list4 = bulletinPhotoItem.LLJJJJJIL;
        }
        if ((1048576 & i3) != 0) {
            i8 = bulletinPhotoItem.LLJJJJLIIL;
        }
        if ((2097152 & i3) != 0) {
            list3 = bulletinPhotoItem.LLJJL;
        } else {
            list3 = null;
        }
        if ((4194304 & i3) != 0) {
            str2 = bulletinPhotoItem.LLJJLIIIJLLLLLLLZ;
        }
        if ((8388608 & i3) != 0) {
            bulletinItemBottomStruct = bulletinPhotoItem.LLJL;
        }
        if ((i3 & 16777216) != 0) {
            bulletinCommentUIOverview2 = bulletinPhotoItem.LLJLIL;
        }
        bulletinPhotoItem.getClass();
        return new BulletinPhotoItem(i4, z8, j, l, z5, bulletinImageInfo, bulletinImageInfo2, list2, l2, i5, baseShortVideoContext, map, z9, z7, z10, i7, i6, user, z6, list4, i8, list3, str2, bulletinItemBottomStruct, bulletinCommentUIOverview2);
    }

    public BulletinPhotoItem(int i, boolean z, long j, Long l, boolean z2, BulletinImageInfo bulletinImageInfo, BulletinImageInfo bulletinImageInfo2, List<BulletinImage> list, Long l2, int i2, BaseShortVideoContext baseShortVideoContext, Map<String, String> map, boolean z3, boolean z4, boolean z5, int i3, int i4, User user, boolean z6, List<BulletinEmojiItem> list2, int i5, List<InterfaceC1891350zJl> list3, String str, BulletinItemBottomStruct bulletinItemBottomStruct, BulletinCommentUIOverview bulletinCommentUIOverview) {
        super(EnumC618810OOx.IMAGE, C0OK6.CONTENT, i, z, j, l, l2, null, null, i2, map, z3, z4, false, 0, i4, user, z6, new ArrayList(), BulletinBaseItem.LLILZIL, 0, new ArrayList(), true, str, 0, null, null, null);
        this.LLILZLL = i;
        this.LLIZ = z;
        this.creatorTime = j;
        this.LLIZLLLIL = l;
        this.LLJ = z2;
        this.LLJI = bulletinImageInfo;
        this.LLJIJIL = bulletinImageInfo2;
        this.LLJILJIL = list;
        this.LLJILJILJ = l2;
        this.LLJILLL = i2;
        this.LLJJ = baseShortVideoContext;
        this.LLJJI = map;
        this.LLJJIII = z3;
        this.LLJJIJI = z4;
        this.LLJJIJIIJIL = z5;
        this.LLJJIJIL = i3;
        this.LLJJJ = i4;
        this.LLJJJIL = user;
        this.LLJJJJ = z6;
        this.LLJJJJJIL = list2;
        this.LLJJJJLIIL = i5;
        this.LLJJL = list3;
        this.LLJJLIIIJLLLLLLLZ = str;
        this.LLJL = bulletinItemBottomStruct;
        this.LLJLIL = bulletinCommentUIOverview;
    }
}
