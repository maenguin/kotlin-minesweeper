package minesweeper.domain

import io.kotest.matchers.collections.shouldContain
import org.junit.jupiter.api.Test

internal class MinePositioningStrategyTest {
    @Test
    internal fun `지뢰를 매설할 위치를 추출할 수 있다`() {
        val sut = object : MinePositioningStrategy {
            override fun getMinePositions(): List<Position> {
                return Positions(listOf(Position(0, 0)))
            }
        }
        sut.getMinePositions() shouldContain Position(0, 0)
    }
}
