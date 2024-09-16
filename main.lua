function love.load()
    sti = require 'src/map/sti'   -- STI 라이브러리 불러오기
    gameMap = sti('src/map/mainRoom.lua')  -- 경로를 mainMap.lua 파일이 위치한 곳으로 설정
end

function love.update(dt)
    -- 맵 업데이트 (필요 시)
    gameMap:update(dt)
end

function love.draw()
    love.graphics.scale(scale, scale)
    gameMap:draw()
end