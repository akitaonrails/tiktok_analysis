package tikcast.api.persona;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class SkillInfo {

    @C09CT("available")
    public boolean available;

    @C09CT("cooldown_end_ms")
    public long cooldownEndMs;

    @C09CT("in_use")
    public boolean inUse;

    @C09CT("max_uses")
    public long maxUses;

    @C09CT("next_available_at_ms")
    public long nextAvailableAtMs;

    @C09CT("skill")
    public int skill;

    @C09CT("skill_extra")
    public SkillExtraUnion skillExtra;

    @C09CT("uses_remaining")
    public long usesRemaining;
}
